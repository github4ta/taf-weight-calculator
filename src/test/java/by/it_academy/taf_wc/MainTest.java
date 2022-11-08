package by.it_academy.taf_wc;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
   @Test
    public void openCalculatorPage() {
        // given
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String URL = "https://svyatoslav.biz/testlab/wt/index.php";
        // when
        driver.get(URL);


    }
}
