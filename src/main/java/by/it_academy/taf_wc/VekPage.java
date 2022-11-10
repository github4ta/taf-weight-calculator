package by.it_academy.taf_wc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VekPage {
    public final String EXPECTED = "Все акции";
    public final String URL = "https://www.21vek.by/";
    private final String xPathAllActionsLink = "//a[@href='/special_offers/promo.html'][@data-index='0']";
    private final String xPathAllActionsPageTitle = "//div[@class='style_title__fFdOX style_titleNew__2HvW8']";
    private final String xPathButtonAgreement = "//button[@data-testid='agreementBtn']";
    private WebDriver driver;

    public VekPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAgreement(){

         By byButtonAgreement = By.xpath(xPathButtonAgreement);
         WebElement elementButtonAgreement = driver.findElement(byButtonAgreement);
         elementButtonAgreement.click();
     }
     public void clickAllActionsLink(){
         By byAllActionsLink = By.xpath(xPathAllActionsLink);
         WebElement elementAllActionsLink = driver.findElement(byAllActionsLink);
         elementAllActionsLink.click();
     }
     public String getAllActionsPageTitleText(){
         By byAllActionsPageTitle = By.xpath(xPathAllActionsPageTitle);
         WebElement elementAllActionsPageTitle = driver.findElement(byAllActionsPageTitle);
         return elementAllActionsPageTitle.getText();
     }
     public void openHomePageAngClickButtonAgreementAndClickAllActionsLink(){
         driver.navigate().to(URL);
         Util.waiter();
         clickButtonAgreement();
         clickAllActionsLink();
         Util.waiter();
     }
}
