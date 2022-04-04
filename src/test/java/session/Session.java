package session;
import devices.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

// se esta usando un singleton
public class Session {
    private static Session session= null;
        private AppiumDriver driver;

    private Session() throws MalformedURLException {
            // todo property file
            driver= FactoryDevice.make("android").create();
        }

        public static Session getInstance() throws MalformedURLException {
            if (session==null)
                session=new Session();
            return session;
        }

        public void closeApp(){
            driver.quit();
            session=null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
