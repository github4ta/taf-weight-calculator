package by.it_academy.taf_wc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class VekTest {
    @Test
    public void testAllActionsPage() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        VekPage vekPage = new VekPage(driver);

        vekPage.openHomePageAngClickButtonAgreementAndClickAllActionsLink();
        String actual = vekPage.getAllActionsPageTitleText();

        Assert.assertEquals(vekPage.EXPECTED, actual);
        driver.quit();
    }
}
