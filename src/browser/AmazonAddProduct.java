package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonAddProduct {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\AkashDeep\\Desktop\\Chrome\\chromedriver.exe");
//		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("iphone 7s plus");
		driver.findElement(By.xpath("//*[@class='suggest_link2']")).click();
		
		driver.findElement(By.xpath("//*[@class= 'a-size-base a-color-base a-text-normal']")).click();
		driver.findElement(By.xpath("//*[@class= 'a-sheet-close a-icon a-icon-close-white a-focus-hidden']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='a-icon a-icon-supplemental']/following-sibling::input")).click();
		driver.findElement(By.xpath("(//*[@class='a-button-input' and @type='submit'])[9]")).click();
		driver.findElement(By.xpath("//*[@class='a-sheet-close a-focus-hidden']")).click();
		driver.findElement(By.xpath("//*[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//*[@id='mobileQuantityDropDown_4']")).click();
		driver.findElement(By.xpath("//*[@class='a-button-text a-text-left']")).click();
		
			
}

}
