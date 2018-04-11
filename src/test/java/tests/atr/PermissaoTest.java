package tests.atr;

import helpers.Elements;
import helpers.SetUp;
import pages.LoginPage;
import pages.atr.permissao.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PermissaoTest {
    private WebDriver browser;
    private String nome;

    @Before
    public void init(){
        Elements elements = new Elements();
        nome = elements.testeTimeStamp();

        SetUp setUp = new SetUp();
        browser = setUp.getBrowser();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login();
        //Navega até o menu permissão
        browser.findElement(By.id("menuItem4")).click();
        addPermissao();
    }

    public void login(){
        LoginPage loginPage = new LoginPage(browser);
        loginPage.login("FELLIPE", "123");
    }


    @Tag("MAT")
    public void addPermissao(){
        PermissaoPage permissaoPage = new PermissaoPage(browser);
        CadastroPermissaoPage cadastroPermissaoPage = new CadastroPermissaoPage(browser);

        permissaoPage.addPermissao();
        cadastroPermissaoPage.typeNome(nome);
        cadastroPermissaoPage.typeDescricao("Descrição de teste");
        cadastroPermissaoPage.ativoSim();
        cadastroPermissaoPage.salvar();
    }

    @Tag("MAT")
    @Test
    public void findPermissao(){
        PermissaoPage permissaoPage = new PermissaoPage(browser);
        permissaoPage.findPermissao(nome);

        String labelAtivo = browser.findElement(By.id("itensTabela")).getText();
        assertEquals("1 permissões encontradas", labelAtivo);
    }

    @Tag("MAT")
    @Test
    public void openViewPermissao(){
        PermissaoPage permissaoPage = new PermissaoPage(browser);
        permissaoPage.findPermissao(nome);

        permissaoPage.viewPermissao();
        ViewPermissaoPage viewPermissaoPage = new ViewPermissaoPage(browser);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        viewPermissaoPage.voltar();
    }

    @Tag("MAT")
    @Test
    public void editPermissao(){
        PermissaoPage permissaoPage = new PermissaoPage(browser);
        EditarPermissaoPage editarPermissaoPage = new EditarPermissaoPage(browser);

        findPermissao();
        permissaoPage.editPermissao();
        editarPermissaoPage.typeDescricao("Descrição de teste EDITADA");
        editarPermissaoPage.salvar();
    }

    @After
    public void deletePermissao(){
        PermissaoPage permissaoPage = new PermissaoPage(browser);
        ExcluirModalPermissaoPage excluirModalPermissaoPage = new ExcluirModalPermissaoPage(browser);
        permissaoPage.findPermissao(nome);
        permissaoPage.excluirPermissao();

        excluirModalPermissaoPage.confirmarExclusao();

        browser.quit();
    }
}
