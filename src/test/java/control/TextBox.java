package control;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value);
    }

    public void cleanType(String value) throws MalformedURLException {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }

    public void clickType(String value) throws MalformedURLException, InterruptedException {
        this.findControl();
        this.control.click();
        Thread.sleep(2000);
        this.findControl();
        this.control.sendKeys(value);
    }
}
