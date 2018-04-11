package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {

    public String testeTimeStamp(){
        String timeStamp = String.valueOf(System.currentTimeMillis());
        timeStamp = "Teste Automacao " + timeStamp;

        return timeStamp;
    }

    public void wait(WebDriver browser, WebElement element){

        WebDriverWait wait = new WebDriverWait(browser,5);
        element = wait.until(ExpectedConditions.elementToBeClickable(element));
    }




}
