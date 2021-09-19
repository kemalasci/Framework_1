package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver1 {

    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        if (driver == null) {
            switch (ConfigBrowser.browser){
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

        }
    }

    @AfterSuite
    public void afterSuite(){
        if (driver != null && ConfigBrowser.closeBrowser) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

}
