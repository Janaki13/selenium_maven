package org.h2k;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver ;
	
	@Parameters({"browserType"})
	@BeforeClass
	public void invokeBrowser(String browserType)
	{
		if(browserType.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver = new FirefoxDriver();
		}
//		else if(browserType.equals("IE"))
//		{
//			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
//				driver = new InternetExplorerDriver();
//		}
		else
		{
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		 	
	}
	
	@Parameters({"jobType","url"})
	@Test
	public void verifyJS(String jobType,String url) throws InterruptedException
	{
		driver.get(url);
		WebElement e;
		e  = driver.findElement(By.id("text-input-what"));
		
		e. sendKeys(jobType);
		 
		
		Thread.sleep(10000);
		driver.findElement(By.tagName("button")).click();
	}

}
