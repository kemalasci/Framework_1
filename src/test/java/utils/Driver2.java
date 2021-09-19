package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver2 {

    protected WebDriver driver;

    public void getDriver(){
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
            if (ConfigBrowser.browser == BrowserTypes.CHROME)
                driver.close();
            driver.quit();
            driver = null;
        }
    }

}
