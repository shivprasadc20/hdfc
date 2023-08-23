package features;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class call {
	
	public static DesiredCapabilities dc= new DesiredCapabilities();
	AndroidDriver driver;
	
	@BeforeTest
	public void test() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		dc.setCapability("appium:automationName", "Appium");
		
		dc.setCapability("appium:platformName", "Android");
		
		dc.setCapability("appium:platformVersion", "9.0");	
		
		dc.setCapability("appium:deviceName", "Android Emulator");
		
		dc.setCapability("appium:appPackage", "com.google.android.dialer");
		
		dc.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
	
		URL url=new URL("http://localhost:4723/wd/hub");
		
		driver =new AndroidDriver(url,dc);	
	}
	@Test
	public void call() throws InterruptedException
	{
		driver.findElement(By.id("com.google.android.dialer:id/fab")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
//		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.dialer:id/dialpad_floating_action_button")).click();
		Thread.sleep(2000);

		
		Thread.sleep(3000);
		driver.quit();
	
	}
}
