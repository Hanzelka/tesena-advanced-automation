package tesena.advanced.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import tesena.advanced.automation.SazkaTest;
import tesena.advanced.automation.objects.lotteries.HomePage;

public class EurojackpotTest extends SazkaTest {

    @Test
    public void eurojackpot() {
        HomePage homePage =  new HomePage(driver);
        homePage.euroJackpot()
                .bet()
                .fillNewBet()
                .fillTicket()
                .selectFirstColumnNumbers("1", "2", "3", "4", "5");
    }
}
