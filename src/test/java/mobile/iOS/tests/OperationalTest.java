/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.tests;

import io.appium.java_client.MobileElement;
import mobile.iOS.screen.GettingStartedScreen;
import mobile.iOS.utilities.AppiumDriverBuilder;
import org.testng.annotations.Test;

/**
 *
 * @author nnagulavancha
 */
public class OperationalTest extends AbstactTest{

    /* A simple addition, it expects the correct result to appear in the result field. */
    @Test
    public void logInButtonTestTest() { 
         app.gettingStartedScreen().skip.click();
         app.getLoginScreen().fillEmailTextBox();
         app.getLoginScreen().fillPasswordTextBox();
         app.getLoginScreen().login.click();
         
    }
    
//    @Test
//    public void clickTabsTest() { 
//        app.getTabScreen().createSlip.click();
//        app.getTabScreen().more.click();
//        app.getTabScreen().bills.click();
//    }
    
    @Test
    public void clickMoreCellOne(){
//        app.getMoreScreen().firstCell.click();
//        driver.findElementByName("More");
//        app.getMoreScreen().secondCell.click();
//        driver.findElementByName("More");
//        app.getMoreScreen().thirdCell.click();
//        driver.findElementByName("More");
//        app.getMoreScreen().fourthCell.click();
//        driver.findElementByName("More");
//        app.getMoreScreen().sixthCell.click();
//        driver.findElementByName("More");
//        app.getMoreScreen().logout.click();
    }

} 
