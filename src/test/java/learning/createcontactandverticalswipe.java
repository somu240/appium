package learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class createcontactandverticalswipe {

	
	
	
	AndroidDriver Driver;
	
	Dimension Size; 
	int  i;
	
	@Test
	
	public void createcontact() throws MalformedURLException{
		
		
		DesiredCapabilities capability= new DesiredCapabilities();
		
		capability.setCapability("deviceName","Navitas Testing");
		capability.setCapability("platformName","Android");
		capability.setCapability("platformVersion", "4.3");
		capability.setCapability("appPackage", "com.android.contacts");
		capability.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	
		
		
	 /*  Driver.findElementByAccessibilityId("Create new contact").click();
	     String contactname;
	     contactname="createcontact".concat(toString().valueOf(i));
		Driver.findElementByName("Name").sendKeys(contactname);
		//i++;
		Driver.findElementById("com.android.contacts:id/menu_done").click();
		Driver.navigate().back();
		}*/
		
	}
	@Test
	
	void verticalswipeup() throws InterruptedException{
		
		
	Size= Driver.manage().window().getSize();
		int startx= (int)(Size.width*.30);
		int starty= (int)(Size.height*.80);
		int endy= (int) (Size.height*.20);
		
         Thread.sleep(4000);
		
		Driver.swipe(startx, starty, startx, endy, 6000);
       Thread.sleep(4000);
		
		Driver.swipe(startx, endy, startx, starty, 6000);
		
		
		
		
	}
		
		
		
	
	
	@AfterTest
	void kill(){
		
		Driver.quit();
	}
	
}
