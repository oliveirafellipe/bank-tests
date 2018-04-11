package pages.atr.permissao;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPermissaoPage extends BasePage {
    public CadastroPermissaoPage(WebDriver browser) {
        super(browser);
    }

    public CadastroPermissaoPage typeNome(String nome) {
        browser.findElement(By.id("basic-url"))
                .sendKeys(nome);
        return this;
    }

    public CadastroPermissaoPage typeDescricao(String descricao) {
        browser.findElement(By.id("basic-url_desc"))
                .sendKeys(descricao);
        return this;
    }

    public CadastroPermissaoPage ativoSim() {
        browser.findElement(By.id("lvAtivoSim")).click();
        return this;
    }

    public CadastroPermissaoPage ativoNao() {
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
