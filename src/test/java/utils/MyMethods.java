package utils;

import org.openqa.selenium.WebDriver;

public class MyMethods extends Driver2{

    public void open(String url){
        getDriver();
        driver.get(url);
    }
}
