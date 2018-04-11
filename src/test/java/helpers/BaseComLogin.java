package helpers;

import pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class BaseComLogin {

    protected WebDriver browser;

    @Before
    public void init() {
        SetUp setUp = new SetUp();
        browser = setUp.getBrowser();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        executaLogin(browser);
    }

    public void executaLogin(WebDriver browser) {
        LoginPage loginPage = new LoginPage(browser);
        loginPage.login("AUTOMACAO", "123");
    }

    @After
    public void fim() {
        browser.quit();
    }


}
