package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {
		
		private WebDriver driver;
		private String seleniumTitleExpected = "Selenium";
		private String wikipediaHomeTitle = "Wikipedia, la enciclopedia libre";
	
		@Before
		public void setUu() {
			driver = new ChromeDriver();
		}
		

		@Test
		public void test_WikipediaSeleniumTitle() {
			driver.get("https://www.wikipedia.es");
			WebElement searchInput = driver.findElement(By.id("searchInput"));
			WebElement searchButton = driver.findElement(By.id("searchButton"));
			
			searchInput.sendKeys("Selenium");
			searchButton.click();
			
			WebElement seleniumTitle = driver.findElement(By.id("firstHeading"));
			String seleniumTitleString = seleniumTitle.getText();
			
			assertEquals(seleniumTitleExpected, seleniumTitleString);
		}
		
		@Test
		public void test_WikipediaGoRandomAndBack() {
			driver.get("https://www.wikipedia.es");
			WebElement randomPageLink = driver.findElement(By.linkText("Página aleatoria"));
			randomPageLink.click();
			
			driver.navigate().back();
			
			String seleniumTitle = driver.getTitle();
			
			
			assertEquals(wikipediaHomeTitle, seleniumTitle);
		}
		
		
		@After
		public void shutdwon() {
			driver.quit();
		}

}
