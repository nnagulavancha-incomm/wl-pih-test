/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.tests;

import io.appium.java_client.MobileElement;
import mobile.iOS.screen.GettingStartedScreen;
import mobile.iOS.utilities.AppiumDriverBuilder;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;


/**
 *
 * @author nnagulavancha
 */
public class OperationalTest extends AbstactTest{

//    @AfterTest
//    public void restartApp() {
//        driver.closeApp();
//        driver.launchApp();
//    }

    public void login() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        app.gettingStartedScreen().skip.click();
        app.getLoginScreen().fillEmailTextBox();
        app.getLoginScreen().fillPasswordTextBox();
        app.getLoginScreen().login.click();
    }

    /* A simple addition, it expects the correct result to appear in the result field. */
    @Test
    public void logInButtonTestTest() {
        app.gettingStartedScreen().skip.click();
        app.getLoginScreen().fillEmailTextBox();
        app.getLoginScreen().fillPasswordTextBox();
        app.getLoginScreen().login.click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        app.getTabScreen().createSlip.click();
//
//        app.getCreatePaymentSlipScreen().searchForBusiness("comcast");
//        driver.getKeyboard();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        app.getCreatePaymentSlipScreen().searchButton.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        app.getCreatePaymentSlipScreen().comcastCell.click();
//
//        app.getFeeList().firstCell.click();
//
//        app.getEnterAccountScreen().sendAccountNumber(app.getEnterAccountScreen().accountNumber, "56139025378326");
//        app.getEnterAccountScreen().sendAccountNumber(app.getEnterAccountScreen().confirmAccountNumber, "56139025378326");
//        driver.hideKeyboard();
//
//        app.getConfirmAccountScreen().positiveButton.click();
//
//        String randomNumber = String.valueOf(Math.floor(Math.random() * 498));
//        app.getEnterPaymentScren().paymentTextField.sendKeys(randomNumber);
//        app.getEnterPaymentScren().doneButton.click();
//        app.getEnterPaymentScren().createSlipButton.click();


    }

//    @Test
//    public void searchForComcast() {
//        login();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        app.getTabScreen().createSlip.click();
//
//        app.getCreatePaymentSlipScreen().searchForBusiness("comcast");
//        driver.getKeyboard();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        app.getCreatePaymentSlipScreen().searchButton.click();
//        driver.hideKeyboard();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        app.getCreatePaymentSlipScreen().comcastCell.click();
//
//    }
    
//    @Test
//    public void clickTabsTest() { 
//        app.getTabScreen().createSlip.click();
//        app.getTabScreen().more.click();
//        app.getTabScreen().bills.click();
//    }
    
//    @Test
//    public void clickMoreCellOne(){
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
//    }

}
