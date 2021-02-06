package tests;

import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import core.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hooks {
	
	@BeforeSuite
	public void setup(ITestContext context) {
		Driver driver = new Driver();
		
		//String deviceName = "Samsung Galaxy A31";
		String deviceId = "RZ8N81ZYGBP";
		//String platformName = "Android";
		//String platformVersion = "10";
		String appURL = "C:\\Users\\GUR36959\\Desktop\\AndroidApp.apk";
		boolean resetValue = false;
		String serverIP = "127.0.0.1";
		String appiumPort = "4723";
		
		AppiumDriver appiumDriver = driver.getDriver(serverIP, appiumPort, deviceId, appURL, resetValue);
		context.setAttribute("driver", appiumDriver);

	}
	
	@Test
	public void first() {
		System.out.println("App has started successfully");
	}
		
		

}
