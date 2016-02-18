package learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class swipe{

	AndroidDriver Driver;
	
	
	/*int startx,endx,starty,endy;
	
	swipe(int startx, int endx, int starty, int endy){
		
		this.startx=startx;
		this.endx=endx;
		this.starty=starty;
		this.endy=endy;
		
		
	}*/
	
@Test

public void horizantalswipe() throws MalformedURLException, InterruptedException{
	
	
	
	DesiredCapabilities capability =new DesiredCapabilities();
	capability.setCapability("deviceName", "Navitas Testing");
	capability.setCapability("platformName", "Android");
	capability.setCapability("platformVersion", "4.3");
	capability.setCapability("appPackage","com.sec.android.app.myfiles");
	capability.setCapability("appActivity", "com.sec.android.app.myfiles.MainActivity");
	Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	
	Driver.findElementByXPath("//android.widget.RelativeLayout[@index='1']").click();
	Driver.findElementById("com.sec.android.app.myfiles:id/text1").click();
	Driver.findElementById("com.sec.android.app.myfiles:id/text1").click();
	
	Thread.sleep(5000);
	
	 Dimension size=Driver.manage().window().getSize();
	 
	 
	 
	 
	 int startx=(int)  (size.width*.70);
	 int endx=(int)(size.width*.30);
	 int starty=(int)(size.height*.50);
	 
	 
	 Driver.swipe(startx, starty, endx, starty, 6000);
	 Driver.navigate().back();
	 Thread.sleep(4000);
	 
	 
	 Driver.findElementByXPath("//android.widget.RelativeLayout[@index='2']").click();
	 Thread.sleep(4000);
	 Driver.swipe(endx, starty, startx, starty, 6000);
	 System.out.println("staring point is "+startx +"ending point is"+ endx);
	 
	 




	 Driver.findElementByXPath("//android.widget.RelativeLayout[@index='2']").click();
	 Thread.sleep(4000);
	 System.out.println("staring point is "+startx +"ending point is"+ endx);
	 Driver.swipe(endx, starty, startx, starty, 6000);
	 
}

@Test

public void vswipe() throws InterruptedException {
	Dimension size=Driver.manage().window().getSize();
	 int startx=(int)  (size.width*.70);
	 int endx=(int)(size.width*.30);
	 int starty=(int)(size.height*.80);
	 int endy=(int)(size.height*20);
	 
	 Driver.swipe(startx, starty, startx, endy, 3000);
	 Thread.sleep(4000);
	 Driver.swipe(startx, endy, startx, starty, 3000);
	 
	 
	
	
	
}



@AfterTest

public void killdriver(){
	
	
	Driver.quit();
	
	
}
}

