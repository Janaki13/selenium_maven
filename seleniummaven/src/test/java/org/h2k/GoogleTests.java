package org.h2k;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class GoogleTests {

		@Parameters({"url","title"})
		@Test
		public void verifyTitle(String url,String title)
		{
			//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get(url);
			String actual = driver.getTitle();
			String expected=title;
			Assert.assertEquals(actual,expected);
		}
	}



