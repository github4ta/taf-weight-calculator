package by.it_academy.taf_wc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    @Test
    public void testOpenOnlinerPage() {
        String url = "https://www.onliner.by/";
        String expected = "Заказы";
        String xPathTasksLink = "//li[@class = 'b-main-navigation__item']/a[@href='https://s.onliner.by/tasks']";
        String xPathTasksPageTitle = "//div[@class='service-header__title service-header__title_huge']";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get(url);
        By byTasksLink = By.xpath(xPathTasksLink);
        WebElement webElementTasksLink = driver.findElement(byTasksLink);
        webElementTasksLink.click();

        By byTasksPageTitle = By.xpath(xPathTasksPageTitle);
        WebElement webElementTasksPageTitle = driver.findElement(byTasksPageTitle);
        String actual = webElementTasksPageTitle.getText();

        Assert.assertEquals(expected, actual);

        driver.quit();
    }
}
