package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class FeeListingScreen extends AbstractScreen{

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"wl_pih\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell\n")
    public WebElement firstCell;

    public FeeListingScreen(AppiumDriver driver) {
        super(driver);
    }
}
