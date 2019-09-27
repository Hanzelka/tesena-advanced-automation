package tesena.advanced.automation.objects.lotteries;

import tesena.advanced.automation.annotations.AndroidXpath;
import tesena.advanced.automation.annotations.VerifyText;
import tesena.advanced.automation.components.Component;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;

public class LotteryDetailPage extends PageObject {

    @VerifyText(text = "VSAĎTE SI")
    @AndroidXpath(xpath = "//*[contains(@resource-id, 'buttonMakeABet')]")
    protected Component betButton;

    public LotteryDetailPage(Driver driver) {
        super(driver);
    }
}
