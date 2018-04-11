package tests.atr;

import helpers.BaseComLogin;
import org.junit.*;
import org.openqa.selenium.By;
import pages.atr.vincularPermissaoPerfil.VincularPermissaoPerfilPage;

import static java.lang.Thread.sleep;

public class VincularPermissaoPerfilTest extends BaseComLogin {
    @Before
    public void menuVincularPermissaoPerfil(){
        browser.findElement(By.id("menuItem6")).click();

    }
    
    @Test
    public void vinculaUm(){
        VincularPermissaoPerfilPage vinc = new VincularPermissaoPerfilPage(browser);
        vinc.typePerfil("Teste Automacao");

        vinc.typeDisponiveis("Teste Automacao");

        vinc.checkUmRegistro();

        vinc.vinculaSelecionados();
        vinc.salvarButton();

       // voltar();
    }

    @Test
    public void vinculaTodos() {
        VincularPermissaoPerfilPage vinc = new VincularPermissaoPerfilPage(browser);
        vinc.typePerfil("Teste Automacao");


        vinc.vinculaTodos();

        vinc.salvarButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void desvinculaUm(){
        VincularPermissaoPerfilPage vinc = new VincularPermissaoPerfilPage(browser);

        vinculaUm();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        menuVincularPermissaoPerfil();
        //vinc.typePerfil("Teste Automacao");

        vinc.checkUmRegistro();

        vinc.desvinculaSelecionados();
        vinc.salvarButton();

    }

    @Test
    public void voltar() {
        VincularPermissaoPerfilPage vinc = new VincularPermissaoPerfilPage(browser);
        vinc.voltarButton();
    }

    @After
    public void desvinculaAll(){
        VincularPermissaoPerfilPage vinc = new VincularPermissaoPerfilPage(browser);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        browser.navigate().refresh();
        browser.findElement(By.id("menuItem6")).click();


        vinc.typePerfil("Teste Automacao");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.desvinculaTodos();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.salvarButton();
    }
}
