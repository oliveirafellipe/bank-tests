package tests.atr;

import helpers.Elements;
import helpers.SetUp;
import pages.atr.perfil.CadastroPerfilPage;
import pages.LoginPage;
import pages.atr.perfil.EditarPerfilPage;
import pages.atr.perfil.PerfilPage;
import pages.atr.perfil.ViewPerfilPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class PerfilTest {
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
        addPerfil();
    }

     public void login(){
        LoginPage loginPage = new LoginPage(browser);
         loginPage.login("AUTOMACAO", "123");
    }


    @Tag("MAT")
    public void addPerfil(){
        PerfilPage perfilPage = new PerfilPage(browser);
        CadastroPerfilPage cadastroPerfilPage = new CadastroPerfilPage(browser);

        perfilPage.addButton();

        cadastroPerfilPage.typeNome
                (nome);

        cadastroPerfilPage.typeDescricao("Descrição de teste");

        cadastroPerfilPage.ativoSim();
        cadastroPerfilPage.delegavelSim();
        cadastroPerfilPage.salvar();
    }

    @Tag("MAT")
    @Test
    public void findPerfil(){
        PerfilPage perfilPage = new PerfilPage(browser);
        perfilPage.findPerfil(nome);

        String labelAtivo = browser.findElement(By.id("labelPerfisEncontrados")).getText();
        assertEquals("1 perfis encontrados", labelAtivo);
    }

    @Tag("MAT")
    @Test
    public void openViewPerfil(){
        PerfilPage perfilPage = new PerfilPage(browser);
        perfilPage.findPerfil(nome);

        perfilPage.viewPerfil();
        ViewPerfilPage viewPerfilPage = new ViewPerfilPage(browser);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        viewPerfilPage.voltar();
    }

    @Tag("MAT")
    @Test
    public void editPerfil(){
        PerfilPage perfilPage = new PerfilPage(browser);
        EditarPerfilPage editarPerfilPage = new EditarPerfilPage(browser);

        findPerfil();
        perfilPage.editButton();
        editarPerfilPage.typeDescricao("Descrição de teste EDITADA");
        editarPerfilPage.salvar();
    }

    @After
    public void deletePerfil(){
        PerfilPage perfilPage = new PerfilPage(browser);
        perfilPage.findPerfil(nome);

        browser.findElement(By.id("excluirButton")).click();

        WebElement myDynamicElement = (new WebDriverWait(browser, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modalConfirmacaoExluirPerfil\"]/div/div/div[3]/div/button[1]")));
                myDynamicElement.click();

        //WebElement myDynamicElement2 = (new WebDriverWait(browser, 10))
              //  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"div_badescmensageria\"]/ul/li")));

        browser.quit();
    }
}
