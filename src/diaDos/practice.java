package diaDos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", LocatorRepository_Practice.pathDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void Practica() {
		driver.get(LocatorRepository_Practice.URL);
		WebElement search = driver.findElement(By.xpath(LocatorRepository_Practice.serchFieldXpath));
		search.clear();
		search.sendKeys("selenium webdriver" + Keys.ENTER);
		WebElement selenium = driver.findElement(By.cssSelector(LocatorRepository_Practice.searchResult));
		selenium.click();
		WebElement selenium_downloads = driver.findElement(By.cssSelector(LocatorRepository_Practice.pageDownloads));
		selenium_downloads.click();
		WebElement selenium_java = driver.findElement(By.cssSelector(LocatorRepository_Practice.pageJavaApi));
		selenium_java.click();
		System.out.println(driver.getCurrentUrl());
	}
	@AfterTest
	private void tearDown() {
		driver.close();
		driver.quit();
	}
}
