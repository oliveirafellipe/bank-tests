package pages.atr.permissao;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewPermissaoPage extends BasePage {
    public ViewPermissaoPage(WebDriver browser) {
        super(browser);
    }
    public PermissaoPage voltar() {
        browser.findElement(By.id("voltarButton")).click();
        return new PermissaoPage(browser);
    }
}
