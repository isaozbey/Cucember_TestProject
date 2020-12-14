package Com.OZY.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {


    private static WebDriver driver;



    public static WebDriver getDriver() {
        String browser=ConfigurationReader.getProperties("browser");


        if (driver == null){


            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "chrome-remote":

                    try {
                        ChromeOptions chromeOptions=new ChromeOptions();
                        URL url=new URL("http://3.95.240.248:4444/wd/hub");
                        driver=new RemoteWebDriver(url,chromeOptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

            }
        }

        return driver;
    }


}
