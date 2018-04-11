package pages.atr.perfil;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditarPerfilPage extends BasePage {
    public EditarPerfilPage(WebDriver browser) {
        super(browser);
    }

    public EditarPerfilPage typeNome(String nome) {
        browser.findElement(By.id("basic-url"))
                .sendKeys(nome);
        return this;
    }

    public EditarPerfilPage typeDescricao(String descricao) {
        browser.findElement(By.id("basic-url_desc"))
                .sendKeys(descricao);
        return this;
    }

    public EditarPerfilPage ativoSim() {
        browser.findElement(By.id("lvAtivoSim")).click();
        return this;
    }

    public EditarPerfilPage ativoNao() {
        browser.findElement(By.id("lvAtivoNao")).click();
        return this;
    }

    public EditarPerfilPage delegavelSim() {
        browser.findElement(By.id("lvDelegavelNao")).click();
        return this;
    }

    public EditarPerfilPage delegavelNao() {
        browser.findElement(By.id("lvDelegavelNao")).click();
        return this;
    }

    public PerfilPage salvar() {
        browser.findElement(By.id("salvarButton")).click();
        return new PerfilPage(browser);
    }

    public PerfilPage voltar() {
        browser.findElement(By.id("voltarButton")).click();
        return new PerfilPage(browser);
    }
}
