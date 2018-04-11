package pages.atr.permissao;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PermissaoPage extends BasePage {
    public PermissaoPage(WebDriver browser) {
        super(browser);
    }

    public CadastroPermissaoPage addPermissao() {
        browser.findElement(By.id("adicionarButton")).click();
        return new CadastroPermissaoPage(browser);
    }

    public PermissaoPage findPermissao(String valor) {
        browser.findElement(By.id("buscaPermissao")).clear();
        browser.findElement(By.id("buscaPermissao")).sendKeys(valor);
        return this;
    }

    public CadastroPermissaoPage viewPermissao() {
        browser.findElement(By.id("visualizarButton")).click();
        return new CadastroPermissaoPage(browser);
    }

    public CadastroPermissaoPage editPermissao() {
        browser.findElement(By.id("editarButton"))
                .click();
        return new CadastroPermissaoPage(browser);
    }

    public ExcluirModalPermissaoPage excluirPermissao(){
        browser.findElement(By.id("excluirButton"))
                .click();
        return new ExcluirModalPermissaoPage(browser);
    }
}
