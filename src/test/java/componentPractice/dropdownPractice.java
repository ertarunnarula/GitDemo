package componentPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownPractice {
	
	@Test
	public void dropDown() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\new chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.seleniumeasy.com/test/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement element = driver.findElement(By.id("at-cv-lightbox-close"));
		
		js.executeScript("arguments[0].click();", element);
	
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement drop1 = driver.findElement(By.id("select-demo"));
		
		Select dd = new Select(drop1);
		dd.selectByValue("Wednesday");
		Thread.sleep(3000);
		dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByVisibleText("Friday");
		
		List<WebElement> opt = dd.getOptions();
		int count = opt.size();
		
		for (int i=0; i<count-1; i++) {
			System.out.println(opt.get(i).getText());
		}
		
		System.out.println("===================================================================");
		
		Select dd2 = new Select(driver.findElement(By.id("multi-select")));
		dd2.selectByValue("New York");
		dd2.selectByValue("New Jersey");
		dd2.selectByValue("Texas");
		
		// To get all selected options
		List<WebElement> opt2 = dd2.getAllSelectedOptions();
		
		for (int i=0; i<opt2.size();i++) {
			System.out.println(opt2.get(i).getText());
		}
		
		System.out.println("===================================================================");
		
		//To get only non-selected values
		
		List<WebElement> opt3 = dd2.getOptions();
		
		for (int i=0; i<opt3.size(); i++) {
			if(opt3.get(i).isSelected()) {
				continue;
			}
			else {
				System.out.println(opt3.get(i).getText());
			}
			
		}
		
		System.out.println("====================================================================");
		
		
		// To check that only values containing character "a" is selected
		for (int i=0; i<opt3.size(); i++) {
			if(opt3.get(i).equals("*.\\a+.*")) {
				System.out.println(opt3.get(i).getText());
			}
			else {
				continue;
			}
		}
	}

}
