package tests.autentication;

import static org.junit.Assert.*;

import helpers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginTest extends BaseComLogin {
    private WebDriver browser;


    //@Test
    public void login() {
        assertEquals("SISBADESC 2", browser.getTitle());

        browser.findElement(By.id("username")).sendKeys("FELLIPE");
        browser.findElement(By.id("password")).sendKeys("123");
        browser.findElement(By.xpath("//button")).click();

        WebElement logado = browser.findElement(By.xpath("//bsc-breadcrumbs-component/ui-breadcrumbs/ol/li/span"));
        String textoLogado = logado.getText();
        assertEquals("Home", textoLogado);
    }
}
