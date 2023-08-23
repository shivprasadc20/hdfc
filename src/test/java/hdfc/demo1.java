package hdfc;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class demo1 {
	
	DesiredCapabilities dc=new DesiredCapabilities();
	AndroidDriver driver;
	@Test
	public void landingpage() throws MalformedURLException
	{
		dc.setCapability("appium:Automation Name", "Appium");
		dc.setCapability("appium:platformName", "Android");
		dc.setCapability("aapium:deviceName", "Android Emulator");
		dc.setCapability("appium:platformversion", "14.0");	
		dc.setCapability("appium:app","/home/niveus/Downloads/selendroid-test-app-0.17.0.apk");
//		dc.setCapability(MobileCapabilityType.APP, "/home/niveus/Appium/Mahindra Finance Final-release (2) (1).apk");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
	}
//     @Test
//     public void open()
//     {
//    	 System.out.println("App is launched");
//     }

}
