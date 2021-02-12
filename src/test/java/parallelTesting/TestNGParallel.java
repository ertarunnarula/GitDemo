package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGParallel {
	
	WebDriver driver;

	
	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
	public void test1() {
		System.out.println("I am inside test1 | " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
	}
	
	
	@Test
	public void test2() {
		System.out.println("I am inside test2 | " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

}
