package tesena.advanced.automation.objects.lotteries;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import tesena.advanced.automation.components.ButtonComponent;
import tesena.advanced.automation.components.Component;
import tesena.advanced.automation.components.DrawNumbersComponent;
import tesena.advanced.automation.driver.Driver;
import tesena.advanced.automation.objects.PageObject;

import java.util.Arrays;

public class SelectNumbersPage extends PageObject {

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'recyclerPrimaryColumnTip')]")
    private DrawNumbersComponent firstColumns;

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'buttonFinish')]")
    private ButtonComponent finishButton;

    public SelectNumbersPage(Driver driver) {
        super(driver);
    }


    public SelectNumbersPage selectFirstColumnNumbers(String... numbers) {
        if (numbers.length !=5) {
            throw  new RuntimeException("");
        }
        firstColumns.selectFirstColumnNumbers(numbers);
        finishButton.scrollToComponent();
        return this;
    }

}
