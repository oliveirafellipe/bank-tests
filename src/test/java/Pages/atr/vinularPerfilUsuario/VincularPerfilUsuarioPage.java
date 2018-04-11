package pages.atr.vinularPerfilUsuario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.atr.perfil.PerfilPage;

import static java.lang.Thread.sleep;

public class VincularPerfilUsuarioPage extends BasePage{

    public VincularPerfilUsuarioPage(WebDriver browser) {
        super(browser);
    }

    public VincularPerfilUsuarioPage typeUsuario(String usuario){
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.findElement(By.cssSelector("#usuario > div > div:nth-child(2) > div > div > a"))
                .click();
        browser.findElement(By.cssSelector("#usuario > div > div:nth-child(2) > div > div > div > div > input"))
                .sendKeys(usuario, Keys.ENTER);

        return this;
    }

    public VincularPerfilUsuarioPage typeDisponiveis(String disponiveis){
        browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.ng-scope > div > div.col-md-10 > div.content.ng-scope > div > div > bsc-secured-content > div.bscSecuredContent__content.ng-scope > div > ng-form > div.form-group.perfilUsuario-vincular__agrupador > div > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.input-group.col-md-12 > input"))
                .sendKeys(disponiveis);
        return this;
    }

    public VincularPerfilUsuarioPage typeVinculados(String vinculados){
        browser.findElement(By.xpath("//*[@id=\"perfilUsuarioLinkedList\"]/bsc-linked-list-component/div[3]/bsc-list-component/div/div/div[1]/input"))
                .sendKeys(vinculados);
        return this;
    }

    public VincularPerfilUsuarioPage checkUmRegistroDisponiveis() {
        //#perfilUsuarioLinkedList > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div:nth-child(1) > label > input
        //#perfilUsuarioLinkedList .check-item-lista input
        browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.ng-scope > div > div.col-md-10 > div.content.ng-scope > div > div > bsc-secured-content > div.bscSecuredContent__content.ng-scope > div > ng-form > div.form-group.perfilUsuario-vincular__agrupador > div > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div > label > input"))
                .click();
        return this;
    }

    public VincularPerfilUsuarioPage checkUmRegistroVinculado(){
        //#perfilUsuarioLinkedList > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div:nth-child(1) > label > input
        //#perfilUsuarioLinkedList .check-item-lista input
        browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.ng-scope > div > div.col-md-10 > div.content.ng-scope > div > div > bsc-secured-content > div.bscSecuredContent__content.ng-scope > div > ng-form > div.form-group.perfilUsuario-vincular__agrupador > div > bsc-linked-list-component > div:nth-child(4) > bsc-list-component > div > div > div.bsc-list-component__list > div > label > input"))
                .click();
        return this;
    }

    public VincularPerfilUsuarioPage vinculaTodos(){
        browser.findElement(By.cssSelector(".vincula-todos"))
                .click();
        return this;
    }

    public VincularPerfilUsuarioPage vinculaSelecionados(){
        browser.findElement(By.cssSelector(".vincula-selecionados"))
                .click();
        return this;
    }

    public VincularPerfilUsuarioPage desvinculaSelecionados(){
        browser.findElement(By.cssSelector(".desvincula-selecionados"))
                .click();
        return this;
    }

    public VincularPerfilUsuarioPage desvinculaTodos(){
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".desvincula-todos")))
                .click();
        return this;
    }

    public PerfilPage voltarButton(){
        browser.findElement(By.id("voltarButton"))
                .click();
        return new PerfilPage(browser);
    }

    public VincularPerfilUsuarioPage salvarButton(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.findElement(By.id("salvarButton"))
                .click();

        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.cssSelector("#container > div > div.container-fluid > div.badesc-notificacao.alert.alert-dismissible.alert-success"))))
                .click();


        return this;
    }



}
