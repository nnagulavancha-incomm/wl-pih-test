/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 *
 * @author nnagulavancha
 */
public class TabBarScreen extends AbstractScreen{
     @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Bills\"]")
       public WebElement bills;
     
     @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Create Payment Slip\"]")
       public WebElement createSlip;
     
     @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"More\"]")
       public WebElement more;
     
      public TabBarScreen(AppiumDriver driver) {
            super(driver);
            System.out.println(driver);
        } 
}
