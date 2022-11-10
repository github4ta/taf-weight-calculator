package by.it_academy.taf_wc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    @Test
    public void testOpenCalculatorPage() {
        String url = "https://www.onliner.by/";
        String classNameFooterCopy = "footer-style__copy";
        String expected = "© 2001—2022 Onlíner";

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get(url);
        By byFooterCopy = By.className(classNameFooterCopy);
        WebElement webElementFooterCopy = driver.findElement(byFooterCopy);
        String actualFooterCopy = webElementFooterCopy.getText();

        Assert.assertEquals(expected, actualFooterCopy);

        driver.quit();
    }
}
