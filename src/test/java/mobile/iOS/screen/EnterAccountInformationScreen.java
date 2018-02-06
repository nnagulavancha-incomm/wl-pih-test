package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class EnterAccountInformationScreen extends AbstractScreen {

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"wl_pih\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField\n")
    public WebElement accountNumber;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"wl_pih\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField\n")
    public WebElement confirmAccountNumber;
    @iOSFindBy(accessibility = "Submit")
    public WebElement submitButton;

    public EnterAccountInformationScreen(AppiumDriver driver) {
        super(driver);
    }

    public void sendAccountNumber(WebElement element, String numberString) {
        element.sendKeys(numberString);
    }

}
