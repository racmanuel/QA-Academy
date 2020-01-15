package diaUno;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PruebaAcademia {
	
	@Test(priority=1)
	public void Tarea() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ra_cm\\eclipse-workspace\\QA-Academy\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.clear();
		search.sendKeys("selenium webdriver" + Keys.ENTER);
		WebElement selenium = driver
				.findElement(By.cssSelector("div.rc>div.r>a[href*=\"https://selenium.dev/projects/\"]>h3"));
		selenium.click();
		WebElement selenium_downloads = driver.findElement(By.cssSelector("#navbar>a"));
		selenium_downloads.click();
		WebElement selenium_java = driver.findElement(
				By.cssSelector("a[href*=\"https://seleniumhq.github.io/selenium/docs/api/java/index.html\"]"));
		selenium_java.click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

	@Test(priority=2)
	public void Ir_Google() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ra_cm\\eclipse-workspace\\QA-Academy\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String x = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + x);
		System.out.println(driver.getCurrentUrl());
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.clear();
		search.sendKeys("Clima en San Luis Potosi" + Keys.ENTER);
		driver.close();
		driver.quit();
	}
}
