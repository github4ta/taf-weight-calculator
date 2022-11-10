package by.it_academy.taf_wc;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    @Test
    public void testOpenCalculatorPage() {
        // given
        String expected = "Идеальная масса тела";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://svyatoslav.biz/testlab/wt/index.php";
        // when
        driver.get(URL);
        String xPathPageTitle = "//body/table/tbody/tr[1]/td[1]";
        By byPageTitle = By.xpath(xPathPageTitle);
        WebElement webElementPageTitle = driver.findElement(byPageTitle);
        String actualPageTitle = webElementPageTitle.getText();
        System.out.println(actualPageTitle);



        String xPathInputName = "//input[@name='name']";
        By byInputName = By.xpath(xPathInputName);
        WebElement webElementInputName = driver.findElement(byInputName);
        String name = "Vasia";
        webElementInputName.sendKeys(name);


        By byInputHeight = By.name("height");
        WebElement webElementInputHeight = driver.findElement(byInputHeight);
        String height = "165";
        webElementInputHeight.sendKeys(height);


        By byInputWeight = By.name("weight");
        WebElement webElementInputWeight = driver.findElement(byInputWeight);
        String weight = "55";
        webElementInputWeight.sendKeys(weight);


        String xPathRadioButtonGenderFemale = "//input[@value='f']";
        By byRadioButtonGenderFemale = By.xpath(xPathRadioButtonGenderFemale);
        WebElement webElementRadioButtonGenderFemale = driver.findElement(byRadioButtonGenderFemale);
        webElementRadioButtonGenderFemale.click();


        String xPathResult = "//tbody/tr[2]/td[2]";
        By byResult = By.xpath(xPathResult);
        WebElement webElementResult = driver.findElement(byResult);
        String actual = webElementResult.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);


        driver.quit();


    }

}
