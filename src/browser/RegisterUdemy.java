package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RegisterUdemy {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				DesiredCapabilities cap = new DesiredCapabilities();
				//cap.setCapability("deviceName","abc")
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
				//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
				
				cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.udemy.android");
				cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.udemy.android.SplashActivity");
				AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
				driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"New here? Create an account\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign up with email\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Name\")")).sendKeys("Akash");
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Email\")")).sendKeys("akashdeepm11@gmail.com");
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Password (8+ characters)\")")).sendKeys("abc1234@@");
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Create account\")")).click();		
				
	}

}
