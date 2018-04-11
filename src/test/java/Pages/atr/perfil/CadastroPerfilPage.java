package pages.atr.perfil;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPerfilPage extends BasePage {
    public CadastroPerfilPage(WebDriver browser) {
        super(browser);
    }

    public CadastroPerfilPage typeNome(String nome) {
        browser.findElement(By.id("basic-url"))
                .sendKeys(nome);
        return this;
    }

    public CadastroPerfilPage typeDescricao(String descricao) {
        browser.findElement(By.id("basic-url_desc"))
                .sendKeys(descricao);
        return this;
    }

    public CadastroPerfilPage ativoSim() {
        browser.findElement(By.id("lvAtivoSim")).click();
        return this;
    }

    public CadastroPerfilPage ativoNao() {
        browser.findElement(By.id("lvAtivoNao")).click();
        return this;
    }

    public CadastroPerfilPage delegavelSim() {
        browser.findElement(By.id("lvDelegavelNao")).click();
        return this;
    }

    public CadastroPerfilPage delegavelNao() {
        browser.findElement(By.id("lvDelegavelNao")).click();
        return this;
    }

    public PerfilPage salvar() {
        browser.findElement(By.id("salvarButton")).click();
        return new PerfilPage(browser);
    }
}
