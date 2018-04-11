package pages.atr.perfil;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerfilPage extends BasePage {
    public PerfilPage(WebDriver browser) {
        super(browser);
    }

    public CadastroPerfilPage addButton() {
        browser.findElement(By.xpath("//a[@href=\"#/atr/perfil/novo/cadastro\"]")).click();
        return new CadastroPerfilPage(browser);
    }

    public PerfilPage findPerfil(String valor) {
        browser.findElement(By.id("findPerfil")).clear();
        browser.findElement(By.id("findPerfil")).sendKeys(valor);
        return this;
    }

    public CadastroPerfilPage viewPerfil() {
        browser.findElement(By.id("visualizarButton")).click();
        return new CadastroPerfilPage(browser);
    }

    public CadastroPerfilPage editButton() {
        browser.findElement(By.id("editarButton"))
                .click();
        return new CadastroPerfilPage(browser);
    }
}
