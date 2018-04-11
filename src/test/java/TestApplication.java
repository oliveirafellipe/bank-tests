import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import tests.*;
import tests.atr.*;
import tests.autentication.LoginTest;
import tests.autentication.LogoutTest;
import tests.pdt.AddLinhaCreditoTest;

public class TestApplication {

    public static void main(String [] args){
      final Result result =
              JUnitCore.runClasses(
                      ConsultarUsuarioPerfilTest.class,
                      PerfilTest.class,
                      PermissaoTest.class,
                      VincularPerfilUsuarioTest.class,
                      VincularComponentePermissaoTest.class,
                      VincularPermissaoPerfilTest.class,
                      LoginTest.class,
                      LogoutTest.class,
                      AddLinhaCreditoTest.class
              );

      for (final Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

    }
}
