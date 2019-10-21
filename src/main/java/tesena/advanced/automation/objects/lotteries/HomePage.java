package tesena.advanced.automation.objects.lotteries;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tesena.advanced.automation.components.BannerComponent;
import tesena.advanced.automation.components.Component;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;

public class HomePage extends PageObject {

    @AndroidFindBy(xpath = "//*[@content-desc='Eurojackpot']")
    private BannerComponent euroJackpotBanner;

    public HomePage(Driver driver) {
        super(driver);
    }

    public EuroJackpotPage euroJackpot() {
        euroJackpotBanner.click();
        return new EuroJackpotPage(driver);
    }

}
