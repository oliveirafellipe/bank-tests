package pages.pdt.LinhaDeCredito;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PdtCreatePage extends BasePage {

    public PdtCreatePage(WebDriver browser) {
        super(browser);
    }

    public PdtCreatePage typeLinhaCredito(String linhaCredito){
        browser.findElement(By.name("desubprograma")).sendKeys(linhaCredito);
        return this;
    }
    public PdtCreatePage selectFonte(String fonte){
        Select selectFonte = new Select(browser.findElement(By.name("fonte")));
        selectFonte.selectByVisibleText(fonte);

        return this;
    }
    public PdtCreatePage selectPrograma(String programa){
        Select selectFonte = new Select(browser.findElement(By.name("programa")));
        selectFonte.selectByVisibleText(programa);
        return this;
    }
    public PdtPage clickFechar(){
        browser.findElement(By.xpath("//*[@id=\"aba-1\"]/div/div[6]/div[2]/div[2]/button")).click();
        return new PdtPage(browser);
    }
    public PdtAbaInfoLinhaCredito clickSalvar(){
        browser.findElement(By.xpath("//*[@id=\"aba-1\"]/div/div[6]/div[2]/div[1]/input")).click();
        return new PdtAbaInfoLinhaCredito(browser);
    }


}
