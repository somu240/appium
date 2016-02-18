package learning;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;







public class Whatsapptest {

	AndroidDriver Driver;
	@Test
	public void testWhatsapp() throws MalformedURLException
	
	{
		
		
		
		/*DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability("deviceName", "Moto X");
		
		capability.setCapability("platformName", "Android");
        capability.setCapability("platformVersion", "5.1");	*/
        
        
        DesiredCapabilities capability=new DesiredCapabilities();
        capability.setCapability("deviceName","Navitas Testing");
        capability.setCapability("platformName", "Android");
        capability.setCapability("platformVersion", "4.3");
        
        File myfile =new File("E:\\appium\\learning\\src\\test\\resources\\com.whatsapp_v2.12.429-450881_Android-2.1.apk");
        capability.setCapability("app", myfile.getAbsolutePath());
	Driver =new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"),capability);
	}
	


	

}
