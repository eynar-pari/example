package testcases;

import activities.LoginScreen;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class LoginTest extends BaseTest {

    LoginScreen loginScreen = new LoginScreen();
    @Test
    public void verifyTheSuccessfullyLogin() throws MalformedURLException, InterruptedException {
        loginScreen.usuarioTextBox.clickType("test");
        loginScreen.contrasenaTextBox.clickType("test");
        loginScreen.inciarSesionButton.click();
        // verificacion
        Thread.sleep(10000);

    }

}
