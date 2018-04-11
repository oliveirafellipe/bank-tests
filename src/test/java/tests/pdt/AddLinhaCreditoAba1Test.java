package tests.pdt;

import helpers.BaseComLogin;
import helpers.Elements;
import org.junit.Ignore;
import pages.pdt.LinhaDeCredito.PdtAbaInfoLinhaCredito;
import pages.pdt.LinhaDeCredito.PdtCreatePage;
import pages.SeletorMenu;
import pages.pdt.LinhaDeCredito.PdtPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AddLinhaCreditoAba1Test extends BaseComLogin {

    private String nome;

    @Before
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
    }
    @Ignore
    @Test
    public void addAba1(){
        PdtAbaInfoLinhaCredito pdtAbaInfoLinhaCredito = new PdtAbaInfoLinhaCredito(browser);

        pdtAbaInfoLinhaCredito.typeInicioVigencia("01012019");
        pdtAbaInfoLinhaCredito.typeFimVigencia("31122019");
        pdtAbaInfoLinhaCredito.checkTipoPessoa();
    }

}


