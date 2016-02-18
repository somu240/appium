package learning;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class telecall {

	
	
	AndroidDriver Driver;
	
	
	@Test
	
	
	public  telecall() {
		
		
		
		DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability("deviceName", "Moto X");
		
		capability.setCapability("platformName", "Android");
        capability.setCapability("platformVersion", "5.1");	
        capability.setCapability("appPackage", "com.android.dialer");
        capability.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
        
        
	try {
		Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
	Driver.findElement(By.id("com.android.dialer:id/one")).click();
	Driver.findElement(By.id("com.android.dialer:id/one")).click();
	Driver.findElement(By.id("com.android.dialer:id/one")).click();
	Driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
	
	Driver.findElement(By.id("com.android.dialer:id/floating_end_call_action_button")).click();
	
//takeScreenShot();

	
	
		
		
		
		
	}

/*	@Test

	private void takeScreenShot() throws IOException {
	String destDir = "Screenshots";
	
	File scrFile =((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
	
	new File(destDir).mkdir();
	
	FileUtils.copyFile(scrFile,new File(destDir +"/"+ destDir ) );
	
	}*/
}
