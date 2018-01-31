/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS;

import io.appium.java_client.AppiumDriver;
import mobile.iOS.screen.GettingStartedScreen;
import mobile.iOS.screen.LoginScreen;
import mobile.iOS.screen.MoreScreen;
import mobile.iOS.screen.TabBarScreen;

/**
 *
 * @author nnagulavancha
 */
public class PayItHere {
        private final AppiumDriver driver;

        public PayItHere(AppiumDriver driver) {
            this.driver = driver;
        }

        public GettingStartedScreen gettingStartedScreen() { return new GettingStartedScreen(driver); }
        public LoginScreen getLoginScreen() { return new LoginScreen(driver); }
        public TabBarScreen getTabScreen() {return new TabBarScreen(driver);}
        public MoreScreen getMoreScreen() {return new MoreScreen(driver);}
}
