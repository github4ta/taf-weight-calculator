package by.it_academy.taf_wc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VekTest{
    @Test
    public void testAllActionsPage(){
        String expected = "Все акции";
        String url = "https://www.21vek.by/";
        String xPathAllActionsLink = "//a[@href='/special_offers/promo.html'][@data-index='0']";
        String xPathAllActionsPageTitle = "//div[@class='style_title__fFdOX style_titleNew__2HvW8']";

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to(url);
        Util.waiter();
        By byButtonAgreement = By.xpath("//button[@data-testid='agreementBtn']");
        WebElement elementButtonAgreement = driver.findElement(byButtonAgreement);
        elementButtonAgreement.click();

        By byAllActionsLink = By.xpath(xPathAllActionsLink);
        WebElement elementAllActionsLink = driver.findElement(byAllActionsLink);
        elementAllActionsLink.click();

        By byAllActionsPageTitle = By.xpath(xPathAllActionsPageTitle);
        WebElement elementAllActionsPageTitle = driver.findElement(byAllActionsPageTitle);
        String actual = elementAllActionsPageTitle.getText();

        Assert.assertEquals(expected, actual);
    }
}
