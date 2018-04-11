package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver browser) {
        super(browser);
    }

    public LoginPage typeUsername(String username){
        browser.findElement(By.id("username")).sendKeys(username);
        return this;
    }
    public LoginPage typePassword(String password){
        browser.findElement(By.id("password")).sendKeys(password);
        return this;
    }
    public SeletorMenu clickSignin(){
        browser.findElement(By.xpath("//button")).click();
        WebElement logado = browser.findElement(By.xpath("//bsc-breadcrumbs-component/ui-breadcrumbs/ol/li/span"));
        String textoLogado = logado.getText();
        assertEquals("Pesquisa de Linhas de Crédito", textoLogado);

        return new SeletorMenu(browser);
    }

    public SeletorMenu login(String username, String password){
        typeUsername(username);
        typePassword(password);
        clickSignin();


        return new SeletorMenu(browser);
    }


}
