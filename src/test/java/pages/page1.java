package pages;

import org.testng.annotations.Test;
import utils.BrowserTypes;
import utils.ConfigBrowser;
import utils.Driver1;

public class page1 extends Driver1 {

    @Test
    public void terst1(){
        ConfigBrowser.browser = BrowserTypes.FIREFOX; // anlamsiz
        driver.get("https://demoqa.com/automation-practice-form");
    }
}
