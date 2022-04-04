package testcases;

import org.junit.jupiter.api.AfterEach;
import session.Session;

import java.net.MalformedURLException;

public class BaseTest {
    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeApp();
    }
}
