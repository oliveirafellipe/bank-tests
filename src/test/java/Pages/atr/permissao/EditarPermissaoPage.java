package pages.atr.permissao;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditarPermissaoPage extends BasePage {
    public EditarPermissaoPage(WebDriver browser) {
        super(browser);
    }

    public EditarPermissaoPage typeNome(String nome) {
        browser.findElement(By.id("basic-url"))
                .sendKeys(nome);
        return this;
    }

    public EditarPermissaoPage typeDescricao(String descricao) {
        browser.findElement(By.id("basic-url_desc"))
                .sendKeys(descricao);
        return this;
    }

    public EditarPermissaoPage ativoSim() {
        browser.findElement(By.id("lvAtivoSim")).click();
        return this;
    }

    public EditarPermissaoPage ativoNao() {
        browser.findElement(By.id("lvAtivoNao")).click();
        return this;
    }

    public PermissaoPage salvar() {
        browser.findElement(By.id("salvarButton")).click();
        return new PermissaoPage(browser);
    }

    public PermissaoPage voltar() {
        browser.findElement(By.id("voltarButton")).click();
        return new PermissaoPage(browser);
    }
}
