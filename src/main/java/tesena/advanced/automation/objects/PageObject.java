package tesena.advanced.automation.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.factories.POFactory;

public abstract class PageObject {

    protected Driver driver;

    //init element create instance off all elements, but are found when really are used (dont throw the exception when are not found, but when we try to use them)
    public PageObject(Driver driver) {
        this.driver = driver;
        POFactory.initPageComponents(this.getClass(), this, driver);
    }


}
