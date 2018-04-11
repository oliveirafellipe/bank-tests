package pages.pdt.LinhaDeCredito;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PdtPage extends BasePage {

    public PdtPage(WebDriver browser) {
        super(browser);
    }

    public pages.pdt.LinhaDeCredito.PdtCreatePage addButtom(){
        browser.findElement(By.cssSelector("#adicionarLinhaCredito")).click();

        return new pages.pdt.LinhaDeCredito.PdtCreatePage(browser);
    }

}
