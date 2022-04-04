package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;

public class Control {
    protected By locator;
    protected WebElement control;

    public Control(By locator){
        this.locator=locator;
    }

    public void findControl() throws MalformedURLException {
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }


}
