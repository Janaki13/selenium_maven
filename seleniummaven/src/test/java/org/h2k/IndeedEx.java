package org.h2k;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class IndeedEx {

		@Parameters({"jobType","url"})
		@Test
		public void verifyJS(String jobType,String url)
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
			 	
			WebElement e;
			e  = driver.findElement(By.id("text-input-what"));
			e.sendKeys(jobType);
			driver.findElement(By.tagName("button")).click();
		}
	}



