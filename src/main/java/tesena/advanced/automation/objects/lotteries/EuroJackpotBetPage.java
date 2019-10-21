package tesena.advanced.automation.objects.lotteries;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tesena.advanced.automation.components.ButtonComponent;
import tesena.advanced.automation.components.Component;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;

public class EuroJackpotBetPage extends PageObject {

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'buttonFillBet')]")
    private ButtonComponent fillNewButton;

    public EuroJackpotBetPage(Driver driver) {
        super(driver);
    }


    public EuroJackpotNewBetPage fillNewBet() {
        fillNewButton.click();
        return new EuroJackpotNewBetPage(driver);
    }
}
