/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import java.util.List;
import org.openqa.selenium.WebElement;

/**
 *
 * @author nnagulavancha
 */
public class TabBarScreen extends AbstractScreen{
//    @iOSFindBy(accessibility = "tab_bar_item_0")
//    public List<WebElement> bills;

    @iOSFindBy(accessibility = "Create Payment Slip")
       public WebElement createSlip;

//     @iOSFindBy(accessibility = "tab_bar_item_2")
//       public List<WebElement> more;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"wl_pih\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar")
    public List<MobileElement> tabBar;
//
      public TabBarScreen(AppiumDriver driver) {
            super(driver);
            System.out.println(driver);
        }
}
