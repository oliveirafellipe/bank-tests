package tests.autentication;

import helpers.BaseComLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogoutTest extends BaseComLogin {

    @Test
    public void logout(){
        WebElement wait = (new WebDriverWait(browser, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("logout-img")));
                wait.click();

                //browser.findElement(By.id("logout-img")).click();
        //browser.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/a")).click();
            }
}
