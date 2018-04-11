package pages.atr.perfil;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewPerfilPage extends BasePage {
    public ViewPerfilPage(WebDriver browser) {
        super(browser);
    }
    public PerfilPage voltar() {
        browser.findElement(By.id("fecharButton")).click();
        return new PerfilPage(browser);
    }
}
