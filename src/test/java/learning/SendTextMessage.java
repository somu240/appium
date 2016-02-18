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

public class SendTextMessage {

	
	
	
	AndroidDriver Driver;

	@Test
	
	public void sendTextMessage() throws MalformedURLException{
		
		
		
		DesiredCapabilities capability =new DesiredCapabilities();
		capability.setCapability("deviceName", "Navitas Testing");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "4.3");
		capability.setCapability("appPackage","com.android.mms");
		capability.setCapability("appActivity", "com.android.mms.ui.ConversationComposer");
		Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
		
		Driver.findElementByXPath("//android.widget.TextView[@content-desc='Compose']").click();
		Driver.findElementByName("Enter recipient").sendKeys("13441324324");
		Driver.findElement(By.name("Enter message")).sendKeys("hi there");
		Driver.findElementByAccessibilityId("Send").click();
		Driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		
		try {
			takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
		}

		@Test

		private void takeScreenShot() throws IOException {
		String destDir = "Screenshots";
		
		File scrFile =((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		
		new File(destDir).mkdir();
		
		FileUtils.copyFile(scrFile,new File(destDir +"/"+ destDir ) );
		
		}

		
	}

