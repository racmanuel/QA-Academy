package diaDos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import diaDos.LocatorRepository;

public class PruebaAcademia {
	
	@Test(priority=1)
	public void Clima_SLP() {
		System.setProperty("webdriver.chrome.driver",LocatorRepository.pathDriver);
		WebDriver driver = new ChromeDriver();
		driver.get(LocatorRepository.URL);
		String x = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + x);
		System.out.println(driver.getCurrentUrl());
		WebElement search = driver.findElement(By.xpath(LocatorRepository.serchFieldXpath));
		search.clear();
		search.sendKeys(LocatorRepository.Clima_1 + Keys.ENTER);
		driver.close();
		driver.quit();
	}
	@Test(priority=2)
	public void Clima_MTY() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ra_cm\\eclipse-workspace\\QA-Academy\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String x = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + x);
		System.out.println(driver.getCurrentUrl());
		WebElement search = driver.findElement(By.xpath(LocatorRepository.serchFieldXpath));
		search.clear();
		search.sendKeys(LocatorRepository.Clima_2 + Keys.ENTER);
		driver.close();
		driver.quit();
	}
}
