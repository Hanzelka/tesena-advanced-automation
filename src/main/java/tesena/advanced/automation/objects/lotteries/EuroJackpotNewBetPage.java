package tesena.advanced.automation.objects.lotteries;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tesena.advanced.automation.components.ButtonComponent;
import tesena.advanced.automation.components.Component;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;

public class EuroJackpotNewBetPage extends PageObject {

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'textTipValue')]")
    private ButtonComponent numbers;

    public EuroJackpotNewBetPage(Driver driver) {
        super(driver);
    }

    public SelectNumbersPage fillTicket() {
        numbers.click();
        return new SelectNumbersPage(driver);
    }

}
