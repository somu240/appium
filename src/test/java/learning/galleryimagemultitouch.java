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
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class galleryimagemultitouch {

	
	
	
	
AndroidDriver Driver;
@Test

public void galleryimagemultitouch() throws MalformedURLException, InterruptedException{
	
	
	DesiredCapabilities capability =new DesiredCapabilities();
	capability.setCapability("deviceName", "Navitas Testing");
	capability.setCapability("platformName", "Android");
	capability.setCapability("platformVersion", "4.3");
	capability.setCapability("appPackage","com.sec.android.gallery3d");
	capability.setCapability("appActivity", "com.sec.android.gallery3d.app.Gallery");
	Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	
	
	
	Set<String> contextNames = Driver.getContextHandles();
	for (String contextName : contextNames) {
		System.out.println(contextNames); //prints out something like [NATIVE_APP, WEBVIEW_<APP_PKG_NAME>]
	}
	Thread.sleep(5000);
	
	List <WebElement> myelements=  Driver.findElementsByXPath("//*");
	
	for (WebElement listofnodes: myelements){
	
		
		String getextvalue=listofnodes.getTagName();
		
		System.out.println(getextvalue);
		//Driver.findElementByClassName(getextvalue).click();
		
		
		Point getresourceid=listofnodes.getLocation();

		System.out.println(getresourceid);
		
	
			//Driver.findElementByClassName("android.widget.ImageView").click();
		
			
		
		
	
		
		
		
		
	}
	Driver.findElementByClassName("android.widget.ImageView").click();
	
	
	//Driver.findElementByClassName("android.view.View").click();
	
	
	
}
}



