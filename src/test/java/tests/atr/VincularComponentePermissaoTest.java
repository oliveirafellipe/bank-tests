package tests.atr;

import helpers.BaseComLogin;
import pages.atr.vincularComponentePermissao.VincCompPermPage;
import org.junit.*;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class VincularComponentePermissaoTest extends BaseComLogin {
    @Before
    public void menuVincularComponentePermissao(){
        browser.findElement(By.id("menuItem5")).click();

    }
// #idListComponent .move-tudo
    @Test
    public void vinculaUm(){
        VincCompPermPage vinc = new VincCompPermPage(browser);
        vinc.selectPermissao("Teste Automacao");

        vinc.typeDisponiveis("Perfil / Consultar");

       vinc.checkUmRegistroDisponiveis();

        vinc.vincularSelecionadosButton();
        vinc.salvarButton();

        voltar();
    }

    @Test
    public void vinculaTodos() {
        VincCompPermPage vinc = new VincCompPermPage(browser);
        vinc.selectPermissao("Teste Automacao");

        vinc.vincularAllButton();

        vinc.salvarButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void desvinculaUm(){
        VincCompPermPage vinc = new VincCompPermPage(browser);

        vinculaUm();

        menuVincularComponentePermissao();
        vinc.selectPermissao("Teste Automacao");

        vinc.typeVinculados("Perfil / Consultar");

        vinc.checkUmRegistroVinculado();

        vinc.desvincularSelecionadosButton();
        vinc.salvarButton();

        voltar();
    }

    @Test
    public void voltar() {
        VincCompPermPage vinc = new VincCompPermPage(browser);
        vinc.voltarButton();
    }

    @Test
    @After
    public void desvinculaTodos(){
        VincCompPermPage vinc = new VincCompPermPage(browser);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        browser.navigate().refresh();
        browser.findElement(By.id("menuItem5")).click();


        vinc.selectPermissao("Teste Automacao");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.desvincularAllButton();
        vinc.salvarButton();
    }
}
