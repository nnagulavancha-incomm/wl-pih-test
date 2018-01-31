/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.iOS.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import java.util.List;
import org.openqa.selenium.WebElement;

/**
 *
 * @author nnagulavancha
 */
public class TabBarScreen extends AbstractScreen{
     @iOSFindBy(accessibility = "tab_bar_item_0")
       public List<WebElement> bills;
     
     @iOSFindBy(accessibility = "tab_bar_item_1")
       public List<WebElement> createSlip;
     
     @iOSFindBy(accessibility = "tab_bar_item_2")
       public List<WebElement> more;
     
      public TabBarScreen(AppiumDriver driver) {
            super(driver);
            System.out.println(driver);
        } 
}
