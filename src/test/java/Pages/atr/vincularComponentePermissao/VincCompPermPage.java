package pages.atr.vincularComponentePermissao;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.RemoteWebElement;

import static java.lang.Thread.*;


public class VincCompPermPage extends BasePage  {
    public VincCompPermPage(WebDriver browser) {
        super(browser);
    }


    public VincCompPermPage selectPermissao(String permissao){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //browser.findElement(By.xpath("//*[@id=\"selectPermissao\"]/div/div[2]/div/div/a")).click();


        /*WebDriverWait wait = new WebDriverWait(browser,5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#selectPermissao .chosen-container")));*/

        RemoteWebElement a = (RemoteWebElement) browser.findElement(By.cssSelector("#selectPermissao .chosen-container"));

        Mouse mouse = ((HasInputDevices) browser).getMouse();
        mouse.click(a.getCoordinates());
        WebElement input = browser.findElement(By.cssSelector("#selectPermissao .chosen-search >input"));
        input.sendKeys(permissao, Keys.ENTER);
        return this;
    }

    public VincCompPermPage typeDisponiveis(String componente){
        //Seleciona apenas um de cada vez
        browser.findElement(By.cssSelector("#idListComponent > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.input-group.col-md-12 > input"))
                .sendKeys(componente);
        return this;
    }

    public VincCompPermPage typeVinculados(String vinculados){
        //Seleciona apenas um de cada vez
        browser.findElement(By.cssSelector("#idListComponent > bsc-linked-list-component > div:nth-child(4) > bsc-list-component > div > div > div.input-group.col-md-12 > input"))
                .sendKeys(vinculados, Keys.SPACE);
        return this;
    }
    public VincCompPermPage checkUmRegistroDisponiveis() {
        browser.findElement(By.cssSelector("#idListComponent > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div > label > input"))
                .click();
        return this;
    }

    public VincCompPermPage checkUmRegistroVinculado(){
        browser.findElement(By.cssSelector("#idListComponent > bsc-linked-list-component > div:nth-child(4) > bsc-list-component > div > div > div.bsc-list-component__list > div > label > input"))
                .click();
        return this;
    }

    //#idListComponent > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div > label > input

    public VincCompPermPage vincularAllButton(){
        browser.findElement(By.cssSelector(".vincula-todos"))
                .click();
        return this;
    }

    public VincCompPermPage vincularSelecionadosButton(){
        browser.findElement(By.cssSelector(".vincula-selecionados"))
                .click();
        return this;
    }

    public VincCompPermPage desvincularSelecionadosButton(){
        browser.findElement(By.cssSelector(".desvincula-selecionados"))
                .click();
        return this;
    }

    public VincCompPermPage desvincularAllButton(){
        browser.findElement(By.cssSelector(".desvincula-todos"))
                .click();
        return this;
    }

    public VincCompPermPage salvarButton(){
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.findElement(By.id("salvarButton")).click();
        return this;
    }

    public VincCompPermPage voltarButton(){
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.findElement(By.id("voltarButton")).click();
        return this;
    }
}
