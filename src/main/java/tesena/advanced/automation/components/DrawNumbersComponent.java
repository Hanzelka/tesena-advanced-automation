package tesena.advanced.automation.components;

import org.openqa.selenium.By;
import tesena.advanced.automation.driver.Driver;

public class DrawNumbersComponent extends Component {

    public DrawNumbersComponent(Driver driver) {
        super(driver);
    }

    public void selectFirstColumnNumbers(String... numbers) {
        for(String number: numbers) {
            findElement(By.xpath(".//*[@text='" + number + "']")).click();
        }
    }
}
