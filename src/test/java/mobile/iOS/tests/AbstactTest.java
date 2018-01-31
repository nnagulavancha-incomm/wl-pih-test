/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.tests;

import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;
import mobile.iOS.PayItHere;
import mobile.iOS.utilities.AppiumDriverBuilder;
import org.testng.annotations.BeforeSuite;

/**
 *
 * @author nnagulavancha
 */
public class AbstactTest {
    
      protected AppiumDriver driver = AppiumDriverBuilder.forIOS().build();
      protected PayItHere app = new PayItHere(driver);

//      /* Establish a connection to TestObject, or to a local device test is local. */
//      @BeforeSuite
//      public void connect() throws MalformedURLException {
//          app = new PayItHere(driver);
//      }
}
