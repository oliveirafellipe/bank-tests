package tests.atr;

import helpers.BaseComLogin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.atr.vinularPerfilUsuario.VincularPerfilUsuarioPage;

public class VincularPerfilUsuarioTest extends BaseComLogin {
    @Before
    public void menuVincularPerfilUsuario(){
        browser.findElement(By.id("menuItem2")).click();
    }

    @Test
    public void vinculaUm(){
        VincularPerfilUsuarioPage vinc = new VincularPerfilUsuarioPage(browser);
        vinc.typeUsuario("Automacao");

        vinc.typeDisponiveis("Teste Automacao");

        vinc.checkUmRegistroDisponiveis();

        vinc.vinculaSelecionados();
        vinc.salvarButton();

        // voltar();
    }

    @Test
    public void vinculaTodos() {
        VincularPerfilUsuarioPage vinc = new VincularPerfilUsuarioPage(browser);
        vinc.typeUsuario("Automacao");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.vinculaTodos();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.salvarButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void desvinculaUm(){
        VincularPerfilUsuarioPage vinc = new VincularPerfilUsuarioPage(browser);

        vinculaUm();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        menuVincularPerfilUsuario();
        //vinc.typePerfil("Teste Automacao");

        vinc.checkUmRegistroVinculado();

        vinc.desvinculaSelecionados();
        vinc.salvarButton();

    }

    @Test
    public void voltar() {
        VincularPerfilUsuarioPage vinc = new VincularPerfilUsuarioPage(browser);
        vinc.voltarButton();
    }

    @Test
    public void desvinculaAll(){
        VincularPerfilUsuarioPage vinc = new VincularPerfilUsuarioPage(browser);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        browser.navigate().refresh();
        browser.findElement(By.id("menuItem2")).click();


        vinc.typeUsuario("Automacao");
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
    @After
    @Override
    public void fim(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        VincularPerfilUsuarioPage vinc = new VincularPerfilUsuarioPage(browser);
        browser.findElement(By.id("menuItem2")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.typeUsuario("Automacao");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.desvinculaTodos();

        vinc.typeDisponiveis("Administrador (Fellipe)");

        vinc.checkUmRegistroDisponiveis();

        vinc.vinculaSelecionados();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vinc.salvarButton();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.quit();

    }
}
