package activities;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class LoginScreen {
    public TextBox usuarioTextBox= new TextBox(By.xpath("//android.widget.EditText[@text='Usuario']"));
    public TextBox contrasenaTextBox= new TextBox(By.xpath("//android.widget.EditText[contains(@text,'Contrase')]"));
    public Button inciarSesionButton= new Button(By.xpath("//android.widget.Button[contains(@content-desc,'Iniciar')]"));

    public LoginScreen(){}

    public void login(String user,String pwd) throws MalformedURLException, InterruptedException {
        this.usuarioTextBox.clickType(user);
        this.contrasenaTextBox.clickType(pwd);
        this.inciarSesionButton.click();
    }
}

