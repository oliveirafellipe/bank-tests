package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;


public class SetUp {
    private WebDriver browser;

    public WebDriver getBrowser(){
        String pathDriver = "src/test/java/resources/chromedriver";

        if (System.getProperty("os.name").toLowerCase().contains("win"))  {
           pathDriver += ".exe";
        }

        File chrome = new File(pathDriver);
        String pathChrome = chrome.getPath();

        String browserType = System.getProperty("browser");
        // mvn clean test -Dbrowser=chrome
        if ("ie".equals(browserType)) {
            browser = new ChromeDriver();

        } else if("chrome".equals(browserType)){
            System.setProperty("webdriver.chrome.driver", pathChrome);
            browser = new ChromeDriver();

        } else { //Seleciona o Chrome por Padrão
            System.setProperty("webdriver.chrome.driver", pathChrome);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--log-level=3");
            browser = new ChromeDriver(options);
        }

        //set Url para Teste
        browser.get("http://127.0.0.1:3000");
        browser.manage().window().maximize();

        return browser;
    }
}
