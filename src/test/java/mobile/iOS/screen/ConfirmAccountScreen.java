package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConfirmAccountScreen extends AbstractScreen{

    @iOSFindBy(accessibility = "Yes, this is my account.")
    public WebElement positiveButton;
    @iOSFindBy(accessibility = "No, this is not my account.")
    public WebElement negativeButton;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"wl_pih\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public List<MobileElement> accountNumberCell;

    public ConfirmAccountScreen(AppiumDriver driver) {
        super(driver);
    }
}
