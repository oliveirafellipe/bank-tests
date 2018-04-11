package tests.pdt;

import helpers.BaseComLogin;
import helpers.Elements;
import org.junit.Ignore;
import pages.SeletorMenu;
import pages.pdt.LinhaDeCredito.PdtCreatePage;
import pages.pdt.LinhaDeCredito.PdtPage;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;


public class AddLinhaCreditoTest extends BaseComLogin {
    private String nome;

    @Ignore
    @Test
    @Tag("MAT")
    public void addLinhaCredito() {
        Elements elements = new Elements();
        nome = elements.testeTimeStamp();

        SeletorMenu seletorMenu = new SeletorMenu(browser);
        PdtPage pdtPage = new PdtPage(browser);
        PdtCreatePage createPdtPage = new PdtCreatePage(browser);
        seletorMenu.selectMenuPdt();
        pdtPage.addButtom();

        createPdtPage.typeLinhaCredito(nome);
        createPdtPage.selectFonte("Badesc");
        createPdtPage.selectPrograma("Finep");
        createPdtPage.clickSalvar();
        //valida se foi redirecionado para a Aba Identificação da Linha de Crédito
        String checkAba = browser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[3]/div/div[2]/div[2]/div/div/div/div/div/div[4]/ul/li[1]/a")).getText();
        assertEquals("Identificação da Linha de Crédito", checkAba);

        //continuar...

    }

    //@Test
    public void addLinhaCredito2(){
        WebElement comboProduto = browser.findElement(By.xpath("//div[@ng-if=\"vm.menuItens\"]"));
        Select combobox = new Select(comboProduto);
        combobox.selectByValue("PDT - PRODUTOS DA INSTITUIÇÃO");
        //Valida se está no meu correto
        assertEquals("Linhas de Crédito",browser.findElement(By.id("menuItem1")).getText());
    }
}