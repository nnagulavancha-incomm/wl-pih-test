/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnagulavancha
 */

package mobile.iOS.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.File;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import mobile.iOS.TestCapabilities;

public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver> {

	protected String apiKey;
	protected String testReportId;

	public static IOSDriverBuilder forIOS() {
		return new IOSDriverBuilder();
	}

	public static class IOSDriverBuilder extends AppiumDriverBuilder<IOSDriverBuilder, IOSDriver> {

		DesiredCapabilities capabilities = new DesiredCapabilities();

                @Override
		public IOSDriver build()  {
                        File file = new File("wl_pih.app");
                        String path = file.getAbsolutePath();       
                        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, TestCapabilities.DEVICE_NAME);
                        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, TestCapabilities.PLATFORM_NAME);
                        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, TestCapabilities.PLATFORM_VERSION);
                        capabilities.setCapability(MobileCapabilityType.APP, path);
                        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, TestCapabilities.AUTOMATION_NAME);
                   
                        IOSDriver<IOSElement> driver = null;
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(AppiumDriverBuilder.class.getName()).log(Level.SEVERE, null, ex);
                    }   
//                        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Skip\"]").click();
                        System.out.println(driver);
                        return driver;
		}
	}

	public abstract DRIVER build();

}