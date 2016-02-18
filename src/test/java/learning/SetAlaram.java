package learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SetAlaram {

	

AndroidDriver Driver;	
	
@Test

public void SetAlaram() throws MalformedURLException{
	
	
	DesiredCapabilities capability =new DesiredCapabilities();
	capability.setCapability("deviceName", "Navitas Testing");
	capability.setCapability("platformName", "Android");
	capability.setCapability("platformVersion", "4.3");
	capability.setCapability("appPackage","com.sec.android.app.clockpackage");
	capability.setCapability("appActivity", "com.sec.android.app.clockpackage.ClockPackage");
	Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	
    Driver.findElementById("com.sec.android.app.clockpackage:id/txtCreateButton").click();
    
    Driver.findElementById("com.sec.android.app.clockpackage:id/repeat_at_day5").click();
    Driver.findElementById("com.sec.android.app.clockpackage:id/timepicker_input").clear();
    Driver.findElementById("com.sec.android.app.clockpackage:id/timepicker_input").clear();
    Driver.findElementById("com.sec.android.app.clockpackage:id/timepicker_input").sendKeys("20");
    
    Driver.findElementById("com.sec.android.app.clockpackage:id/menu_done").click();    
   
    
    
    
}
}
