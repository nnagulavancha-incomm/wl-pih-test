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
public class LoginScreen extends AbstractScreen{
        @iOSFindBy(className = "XCUIElementTypeTextField")
        public WebElement emailText;
        
        public void fillEmailTextBox(){
            emailText.clear();
            emailText.sendKeys("public-test-user@eteam.io");
        }
        
        @iOSFindBy(className = "XCUIElementTypeSecureTextField")
        public WebElement passwordText;
         
        public void fillPasswordTextBox(){
            passwordText.clear();
            passwordText.sendKeys("12345678");
        }
        
        @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
        public WebElement login;

         
        public LoginScreen(AppiumDriver driver) {
            super(driver);
            System.out.println(driver);
        }  
}
