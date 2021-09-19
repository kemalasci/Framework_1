package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Driver;

public class page {

    WebDriver driver;

    @Test
    public void test1(){
        driver = Driver.getDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        Driver.quitDriver();
    }
}
