package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CourseUdemySubscribe {

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
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Browse\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search all courses\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search all courses\")")).sendKeys("Selenium");
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"selenium\")")).click();
				driver.hideKeyboard();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Selenium WebDriver with Java -Basics to Advanced+Frameworks\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ADD TO CART\")")).click();
				driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"CANCEL\")")).click();
				
				
	}

}
