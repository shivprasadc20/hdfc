package features;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Calender
{
	public static DesiredCapabilities dc= new DesiredCapabilities();
	AndroidDriver driver;
	
	@Test
	public void test() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		dc.setCapability("appium:automationName", "Appium");
		
		dc.setCapability("appium:platformName", "Android");
		
		dc.setCapability("appium:platformVersion", "9.0");	
		
		dc.setCapability("appium:deviceName", "Android Emulator");
		
		dc.setCapability("appium:appPackage", "com.google.android.calendar");
		
		dc.setCapability("appium:appActivity", "com.google.android.calendar.timely.WhatsNewFullScreenImpl");
	
		URL url=new URL("http://localhost:4723/wd/hub");
		
		driver =new AndroidDriver(url,dc);	
		
		try {
		   		} catch (SecurityException e) {
		    e.printStackTrace();
		    //do smth in this scenario
		} 
	}
//	@Test
}
