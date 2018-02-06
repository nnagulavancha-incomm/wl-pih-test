package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class EnterPaymentScreen extends AbstractScreen {

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"wl_pih\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField")
    public MobileElement paymentTextField;
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Create Payment Slip\"][1]")
    public MobileElement createSlipButton;
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    public MobileElement doneButton;

    public EnterPaymentScreen(AppiumDriver driver) {
        super(driver);
    }

}
