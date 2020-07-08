package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonSignUp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "abc");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\AkashDeep\\Desktop\\Chrome\\chromedriver.exe");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		driver.findElement(By.xpath(".//a[@id='nav-hamburger-menu']")).click();
		System.out.println("hello");
		driver.findElement(By.xpath(".//div[@id='hmenu-customer-name']")).click();
		driver.findElement(By.xpath(".//a[@id='register_accordion_header']")).click();
		driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Test");
		driver.findElement(By.xpath(".//input[@type='tel']")).sendKeys("8865966578");
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("test6767676567656@gmail.com");
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("abcd1234");
		Thread.sleep(5000);
		driver.hideKeyboard();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath(".//input[@id='continue']")).click();
		String StrText = driver.findElement(MobileBy.xpath("//h4[text()='Mobile number already in use']")).getText();
		System.out.println(StrText);

	}

}
