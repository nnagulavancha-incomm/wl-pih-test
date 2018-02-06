package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateNewPaymentSlip extends AbstractScreen {

    public CreateNewPaymentSlip(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "(//XCUIElementTypeSearchField[@name=\"Search Billers\"])[1]")
    public WebElement searchKeyboard;
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public WebElement searchButton;
    @iOSFindBy(accessibility = "COMCAST CABLE AND PHONE")
    public WebElement comcastCell;

    WebDriverWait wait = new WebDriverWait(driver, 5);


    public void searchForBusiness(String companyName) {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeSearchField[@name=\"Search Billers\"])[1]");
        el1.sendKeys(companyName);
//        searchKeyboard.click();
//        searchKeyboard.sendKeys(companyName);
    }

//    public void retrieveSearchButton() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        searchButton = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Search\"]"));
//    }
//
//    public void retrieveComcastCell() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////        comcastCell = driver.findElementByAccessibilityId("COMCAST CABLE AND PHONE");
//    }
}
