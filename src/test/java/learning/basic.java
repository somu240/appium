package learning;

import java.nio.charset.Charset;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class basic {

	
	@Test
	
	public static void main() {
		// TODO Auto-generated method stub

		System.out.println("hi");
		
		byte[] array = new byte[7]; // length is bounded by 7
		new Random().nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));
		System.out.println(generatedString);
		
	
	
	
	
	}
	

}
