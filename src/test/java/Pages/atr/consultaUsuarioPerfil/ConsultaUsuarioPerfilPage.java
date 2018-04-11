package pages.atr.consultaUsuarioPerfil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.atr.perfil.PerfilPage;

import static java.lang.Thread.sleep;

public class ConsultaUsuarioPerfilPage extends BasePage {
    public ConsultaUsuarioPerfilPage(WebDriver browser) {
        super(browser);
    }

    public ConsultaUsuarioPerfilPage typePerfil(String usuario){
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.findElement(By.cssSelector("#usuario > div > div:nth-child(2) > div > div"))
                .click();
        browser.findElement(By.cssSelector("#usuario > div > div:nth-child(2) > div > div > div > div > input[type=\"text\"]"))
                .sendKeys(usuario, Keys.ENTER);

        return this;
    }

    public ConsultaUsuarioPerfilPage typeUsuarioVinculado(String usuario){
        browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.ng-scope > div > div.col-md-10 > div.content.ng-scope > div > div > bsc-secured-content > div.bscSecuredContent__content.ng-scope > div > form > div.row.rowPadTp19 > div > bsc-list-component > div > div > div.input-group.col-md-12 > input"))
        .sendKeys(usuario);
        return this;
    }

    public String validaUsuarioVinculado(String usuario){
        String usuarioVinculado =
        browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.ng-scope > div > div.col-md-10 > div.content.ng-scope > div > div > bsc-secured-content > div.bscSecuredContent__content.ng-scope > div > form > div.row.rowPadTp19 > div > bsc-list-component > div > div > div.bsc-list-component__list.without-selection > div > label"))
                .getText();

        return usuarioVinculado;
    }

    public PerfilPage voltarButton(){
        browser.findElement(By.id("voltarButton"))
                .click();
        return new PerfilPage(browser);
    }
}
