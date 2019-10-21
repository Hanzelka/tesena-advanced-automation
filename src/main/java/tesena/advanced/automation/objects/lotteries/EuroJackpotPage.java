package tesena.advanced.automation.objects.lotteries;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tesena.advanced.automation.components.ButtonComponent;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;

public class EuroJackpotPage extends PageObject {

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'buttonMakeABet')]")
    private ButtonComponent betButton;

    public EuroJackpotPage(Driver driver) {
        super(driver);
    }

    public EuroJackpotBetPage bet() {
        betButton.click();
        return new EuroJackpotBetPage(driver);
    }
}
