package hdfc;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class demo1 {
	
	DesiredCapabilities dc=new DesiredCapabilities();
	AndroidDriver driver;
	@Test
	public void landingpage() throws MalformedURLException, InterruptedException 
	{
		dc.setCapability("appium:Automation Name", "Appium");
		dc.setCapability("appium:platformName", "Android");
		dc.setCapability("aapium:deviceName", "SMG 990E");
		dc.setCapability("appium:platformversion", "14.0");	
		dc.setCapability("appium:app","/home/niveus/Downloads/2.0.101-UAT.apk");
		dc.setCapability(AndroidMobileCapabilityType.ADB_EXEC_TIMEOUT, 80000);
		dc.setCapability(AndroidMobileCapabilityType.ANDROID_DEVICE_READY_TIMEOUT, 80000);
//		 dc.setCapability("appium.appPackage","com.application.hdfcergo.hdfc_ergo");
//        dc.setCapability("appium.appActivity","com.application.hdfcergo.hdfc_ergo.MainActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
		 Thread.sleep(6000);                 	
    	 driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//    	 Thread.sleep(2000);
//    	 driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]")).click();
      
//    	 el1.click();
//    	 el1.click();
//    	 el1.click();
//    	 el1.click();
    	 
}

}
