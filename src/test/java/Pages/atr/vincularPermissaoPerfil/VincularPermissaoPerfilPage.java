package pages.atr.vincularPermissaoPerfil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.atr.perfil.PerfilPage;

import static java.lang.Thread.sleep;

public class VincularPermissaoPerfilPage extends BasePage {
    public VincularPermissaoPerfilPage(WebDriver browser) {
        super(browser);
    }

    public VincularPermissaoPerfilPage typePerfil(String perfil){
        browser.findElement(By.cssSelector("#perfil > div > div:nth-child(2) > div > div"))
                .click();

        browser.findElement(By.cssSelector("#perfil > div > div:nth-child(2) > div > div > div > div > input[type=\"text\"]"))
                .sendKeys(perfil, Keys.ENTER);
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }


    public VincularPermissaoPerfilPage typeDisponiveis(String disponiveis){
        browser.findElement(By.cssSelector("#permissaoPerfilLinkedList > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.input-group.col-md-12 > input"))
                .sendKeys(disponiveis);
        return this;
    }

    public VincularPermissaoPerfilPage checkUmRegistro(){
        //#permissaoPerfilLinkedList > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div:nth-child(1) > label > input
        //#permissaoPerfilLinkedList .check-item-lista input
        browser.findElement(By.cssSelector("#permissaoPerfilLinkedList > bsc-linked-list-component > div:nth-child(2) > bsc-list-component > div > div > div.bsc-list-component__list > div:nth-child(1) > label > input"))
                .click();
        return this;
    }

    public VincularPermissaoPerfilPage vinculaTodos(){
        browser.findElement(By.cssSelector("#permissaoPerfilLinkedList .vincula-todos"))
                .click();
        return this;
    }

    public VincularPermissaoPerfilPage vinculaSelecionados(){
        browser.findElement(By.cssSelector("#permissaoPerfilLinkedList .vincula-selecionados"))
                .click();
        return this;
    }

    public VincularPermissaoPerfilPage desvinculaSelecionados(){
        browser.findElement(By.cssSelector("#permissaoPerfilLinkedList .desvincula-selecionados"))
                .click();
        return this;
    }

    public VincularPermissaoPerfilPage desvinculaTodos(){
        browser.findElement(By.cssSelector("#permissaoPerfilLinkedList .desvincula-todos"))
                .click();
        return this;
    }

    public PerfilPage voltarButton(){
        browser.findElement(By.id("voltarButton"))
                .click();
        return new PerfilPage(browser);
    }

    public VincularPermissaoPerfilPage salvarButton(){
        browser.findElement(By.id("salvarButton"))
                .click();
        return this;
    }
}
