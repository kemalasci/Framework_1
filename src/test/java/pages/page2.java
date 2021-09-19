package pages;

import org.testng.annotations.Test;
import utils.BrowserTypes;
import utils.ConfigBrowser;
import utils.Driver2;
import utils.MyMethods;

public class page2 extends MyMethods {

    @Test
    public void config(){
        ConfigBrowser.browser = BrowserTypes.FIREFOX;
    }

    @Test(dependsOnMethods = "config")
    public void terst1(){

        open("https://demoqa.com/automation-practice-form");
    }
}
