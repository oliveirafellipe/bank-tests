package pages.pdt.LinhaDeCredito;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class PdtAbaInfoLinhaCredito extends BasePage {
    public PdtAbaInfoLinhaCredito(WebDriver browser) {
        super(browser);
    }


    public PdtAbaInfoLinhaCredito typeInicioVigencia(String ddmmyyyy){
        browser.findElement(By.id("inicioVigencia")).sendKeys(ddmmyyyy);
        return this;
    }

    public PdtAbaInfoLinhaCredito typeFimVigencia(String ddmmyyyy){
        browser.findElement(By.id("fimVigencia")).sendKeys(ddmmyyyy);
        return this;
    }

    public PdtAbaInfoLinhaCredito typeBaseNormativa(String baseNormativa){
        browser.findElement(By.id("baseNormativaLegal")).sendKeys(baseNormativa);
        return this;
    }

    public PdtAbaInfoLinhaCredito selectAreaOperacionalGestora(String areaOperacional){
        Select select = new Select(browser.findElement(By.id("areaOperacionalGestora")));
        select.selectByVisibleText(areaOperacional);
        return this;
    }

    public PdtAbaInfoLinhaCredito selectCategoria(String categoria){
        Select select = new Select(browser.findElement(By.id("categoria")));
        select.selectByVisibleText(categoria);
        return this;
    }

    public PdtAbaInfoLinhaCredito selectSegmento(String segmento){
        Select select = new Select(browser.findElement(By.id("segmento")));
        select.selectByVisibleText(segmento);
        return this;
    }

    public PdtAbaInfoLinhaCredito checkTipoPessoa(){
        RemoteWebElement a = (RemoteWebElement) browser.findElement(By.id("tipoPessoa"));
        Mouse mouse = ((HasInputDevices) browser).getMouse();
        mouse.mouseDown(a.getCoordinates());
        WebElement input = browser.findElement(By.id("tipoPessoa"));
        input.sendKeys(Keys.SPACE);
        return this;
    }
    public PdtAbaInfoLinhaCredito checkObjetivosEspecificos() {
        RemoteWebElement a = (RemoteWebElement) browser.findElement(By.id("objetivosEspecificos"));
        Mouse mouse = ((HasInputDevices) browser).getMouse();
        mouse.mouseDown(a.getCoordinates());
        WebElement input = browser.findElement(By.id("objetivosEspecificos"));
        input.sendKeys(Keys.SPACE);
        return this;
    }

    public PdtAbaInfoLinhaCredito radioServicosPrestadosSim(){
        browser.findElement(By.id("servivosPrestadosSim")).click();
        return this;
    }

    public PdtAbaInfoLinhaCredito radioServicosPrestadosNao(){
        browser.findElement(By.id("servivosPrestadosNao")).click();
        return this;
    }

    public PdtAbaInfoLinhaCredito selectClassificacaoPorte(String classificacaoPorte){
        Select select = new Select(browser.findElement(By.id("classificacaoPorte")));
        select.selectByVisibleText(classificacaoPorte);
        return this;
    }

    public PdtAbaInfoLinhaCredito checkPorteGrupoEconomico(){
        browser.findElement(By.id("checkPorteGrupoEconomico")).click();
        return this;
    }

    public PdtAbaInfoLinhaCreditoModal1 buttonRemuneracaoBadesc(){
        browser.findElement(By.id("remuneracaoBadescButton")).click();
        return new PdtAbaInfoLinhaCreditoModal1(browser);
    }

    public PdtAbaInfoLinhaCreditoModal2 checkRemuneracaoBasicaFonte(){
        browser.findElement(By.id("checkRemuneracaoBasicaFonte")).click();
        return new PdtAbaInfoLinhaCreditoModal2(browser);
    }

    public PdtAbaInfoLinhaCreditoModal2 buttonRemuneracaoBasicaFonte() {
        browser.findElement(By.id("remuneracaoBasicaFonteButton")).click();
        return new PdtAbaInfoLinhaCreditoModal2(browser);
    }

    public PdtAbaInfoLinhaCreditoModal3 checkTaxaIntermediacaoFinanceira(){
        browser.findElement(By.id("checkTaxaIntermediacaoFinanceira")).click();
        return new PdtAbaInfoLinhaCreditoModal3(browser);
    }

    public PdtAbaInfoLinhaCreditoModal3 buttonTaxaIntermediacaoFinanceira() {
        browser.findElement(By.id("taxaButton")).click();
        return new PdtAbaInfoLinhaCreditoModal3(browser);
    }

    public PdtAbaInformacoesOperacionais buttonConcluirEtapa(){
        browser.findElement(By.id("concluirEtapa")).click();
        return new PdtAbaInformacoesOperacionais(browser);
    }

    public PdtPage buttonVoltar(){
        browser.findElement(By.id("voltarButton"));
        return new PdtPage(browser);
    }
}
