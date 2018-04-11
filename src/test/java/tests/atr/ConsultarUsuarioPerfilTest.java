package tests.atr;

import helpers.BaseComLogin;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.atr.consultaUsuarioPerfil.ConsultaUsuarioPerfilPage;
import pages.atr.vinularPerfilUsuario.VincularPerfilUsuarioPage;

import static org.junit.Assert.assertEquals;

public class ConsultarUsuarioPerfilTest extends BaseComLogin {

    @Before
    public void menuConsultarUsuarioPerfil(){
        VincularPerfilUsuarioPage user = new VincularPerfilUsuarioPage(browser);
        browser.findElement(By.id("menuItem2")).click();
        user.typeUsuario("AUTOMACAO");

        user.desvinculaTodos();
        user.typeDisponiveis("Teste menuConsultarUsuarioPerfil");
        user.checkUmRegistroDisponiveis();
        user.vinculaSelecionados();
        user.salvarButton();

        //click alert
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.badesc-notificacao.alert.alert-dismissible.alert-success"))))
                .click();
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menuItem3"))).click();

    }

    @Test
    public void validaConsultaUsuarioPerfil(){
        ConsultaUsuarioPerfilPage cons = new ConsultaUsuarioPerfilPage(browser);

        cons.typePerfil("Teste menuConsultarUsuarioPerfil");
        cons.typeUsuarioVinculado("AUTOMACAO");

        assertEquals("AUTOMACAO", cons.validaUsuarioVinculado("AUTOMACAO"));
    }

    @Test
    public void voltar(){
        ConsultaUsuarioPerfilPage cons = new ConsultaUsuarioPerfilPage(browser);
        cons.voltarButton();

        assertEquals("Home" ,browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.ng-scope > div > div.col-md-10 > div.row > bsc-breadcrumbs-component > ui-breadcrumbs > ol > li > span")).getText());
    }

}
