package tesena.advanced.automation.objects.lotteries.euro;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import tesena.advanced.automation.annotations.AndroidXpath;
import tesena.advanced.automation.components.Component;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;
import tesena.advanced.automation.objects.lotteries.LotteryNumbersSelectPage;

import java.util.Arrays;

public class EurojackpotBetNumbersSelectPage extends LotteryNumbersSelectPage {

    @AndroidXpath(xpath = "//*[contains(@resource-id, 'recyclerAuxColumnTip')]")
    private Component secondRow;

    public EurojackpotBetNumbersSelectPage(Driver driver) {
        super(driver);
    }

    public EurojackpotBetNumbersSelectPage selectEuroFirstRowNumbers(String... numbers) {
        if (numbers.length != 5) {
            throw new RuntimeException("Count of bet numbers must be equal to 5");
        }
        super.selectFirstRowNumbers(numbers);
        return this;
    }

    public EurojackpotBetNumbersSelectPage selectSecondRowNumbers(String... numbers) {
        logger.info("Selecting numbers: " + Arrays.toString(numbers));
        if (numbers.length != 2) {
            throw new RuntimeException("Count of bet numbers must be equal to 2");
        }
        buttonFinish.scrollDownTo();
        for (String number: numbers) {
            secondRow.findElement(By.xpath(".//*[@text='" + number + "']")).click();
        }
        return this;
    }

    public EurojackpotNewBetPage done() {
        buttonFinish.scrollDownTo().click();
        return new EurojackpotNewBetPage(driver);
    }
}