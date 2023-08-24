package features;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class clock {
	public static DesiredCapabilities dc= new DesiredCapabilities();
	AndroidDriver driver;
	
	@Test
	public void test() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		dc.setCapability("appium:automationName", "Appium");
		
		dc.setCapability("appium:platformName", "Android");
		
		dc.setCapability("appium:platformVersion", "9.0");	
		
		dc.setCapability("appium:deviceName", "Android Emulator");
		
		dc.setCapability("appium:appPackage", "com.google.android.deskclock");
		
		dc.setCapability("appium:appActivity", "com.android.deskclock.DeskClock");
	
		URL url=new URL("http://localhost:4723/wd/hub");
		
		driver =new AndroidDriver(url,dc);	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]"
				+ "/android.widget.TextView")).click();
		driver.findElement(By.id("com.google.android.deskclock:id/fab")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("android:id/toggle_mode")).click();
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.id("android:id/input_hour"));
		e.clear();
		e.sendKeys("4");
		Thread.sleep(1000);
		
		WebElement e1=driver.findElement(By.id("android:id/input_minute"));
		e1.clear();
		e1.sendKeys("30");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		
		
		String s=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"4:30 PM Alarm\"]/android.widget.Switch")).getText();
		System.out.println(s);
		 Thread.sleep(1000);
         driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"4:30 PM Alarm\"]/android.widget.Switch")).click();
		
         Thread.sleep(2000);
	   driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"9:00 AM Alarm\"]/android.widget.Button")).click();
	   Thread.sleep(2000);
	   TakesScreenshot screen=(TakesScreenshot)driver;
	    File SrcFile=screen.getScreenshotAs(OutputType.FILE);
	    
	    File DestFile=new File("/home/niveus/eclipse-workspace/myproject/screenshot//alarm2.jpg");

	    //Copy file at destination

	    FileUtils.copyFile(SrcFile, DestFile);
	   
	   
	driver.navigate().back();
	Thread.sleep(1000);
		driver.quit();    
	
		}
}
