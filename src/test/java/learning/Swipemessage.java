package learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipemessage {

AndroidDriver Driver;

@Test

void Swipemessage() throws MalformedURLException{
	
	DesiredCapabilities capability= new DesiredCapabilities();
	capability.setCapability("deviceName", "Navitas Testing");
	capability.setCapability("platformName", "Android");
	capability.setCapability("platformVersion", "4.3");
	capability.setCapability("appPackage", "com.android.mms");
	capability.setCapability("appActivity", "com.android.mms.ui.ConversationComposer");
	Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	
	Dimension Size= Driver.manage().window().getSize();
	int startx= (int)(Size.width*.20);
	int Starty= (int)(Size.width*80);
	
	TouchAction action= new TouchAction((MobileDriver) Driver);
	
	WebElement element= (WebElement) Driver.findElementById("com.android.mms:id/conversationList_item_root");
	
	action.longPress(element).moveTo(650, 200).release().perform();
	
	Driver.quit();
	
	
	
	
	
	
}
	
	
	
}
