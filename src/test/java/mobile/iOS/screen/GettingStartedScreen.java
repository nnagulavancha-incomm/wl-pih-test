/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 *
 * @author nnagulavancha
 */
public class GettingStartedScreen extends AbstractScreen{
        @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
        public WebElement skip;


        public GettingStartedScreen(AppiumDriver driver) {
            super(driver);
            System.out.println(driver);
        }        
}
