package pages.atr.permissao;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcluirModalPermissaoPage extends BasePage{
    public ExcluirModalPermissaoPage(WebDriver browser) {
        super(browser);
    }

    public PermissaoPage confirmarExclusao(){
        WebElement myDynamicElement = (new WebDriverWait(browser, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("confirmarExcluirButton")));
        myDynamicElement.click();

        return new PermissaoPage(browser);
    }

    public PermissaoPage cancelarExclusao(){
        WebElement myDynamicElement2 = (new WebDriverWait(browser, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("fecharButton")));
        myDynamicElement2.click();

        return new PermissaoPage(browser);
    }
}
