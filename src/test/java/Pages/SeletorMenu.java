package pages;

import pages.aud.AudPage;
import pages.pdt.LinhaDeCredito.PdtPage;
import pages.wkf.WkfPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.RemoteWebElement;

public class SeletorMenu extends BasePage{

    public SeletorMenu(WebDriver browser) {
        super(browser);
    }

    public AudPage selectMenuAud(){
        RemoteWebElement a = (RemoteWebElement) browser.findElement(By.cssSelector("#selectMenu .chosen-container"));
        Mouse mouse = ((HasInputDevices) browser).getMouse();
        mouse.mouseDown(a.getCoordinates());
        WebElement input = browser.findElement(By.cssSelector("#selectMenu .chosen-search > input"));
        input.sendKeys("aud", Keys.ENTER);

        return new AudPage(browser);
    }
    public PdtPage selectMenuPdt() {
        RemoteWebElement a = (RemoteWebElement) browser.findElement(By.cssSelector("#selectMenu .chosen-container"));
        Mouse mouse = ((HasInputDevices) browser).getMouse();
        mouse.mouseDown(a.getCoordinates());
        WebElement input = browser.findElement(By.cssSelector("#selectMenu .chosen-search > input"));
        input.sendKeys("pdt", Keys.ENTER);

        return new PdtPage(browser);
    }
    public WkfPage selectMenuWkf() {
        RemoteWebElement a = (RemoteWebElement) browser.findElement(By.cssSelector("#selectMenu .chosen-container"));
        Mouse mouse = ((HasInputDevices) browser).getMouse();
        mouse.mouseDown(a.getCoordinates());
        WebElement input = browser.findElement(By.cssSelector("#selectMenu .chosen-search > input"));
        input.sendKeys("wkf", Keys.ENTER);

        return new WkfPage(browser);
    }

    //public PermissaoPage
}
