package diaDos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

	public void Practica() {
		driver.get(LocatorRepository_Practice.URL);
		WebElement logoGoogle = driver.findElement(By.id(LocatorRepository_Practice.logoGoogle));
		Assert.assertTrue(logoGoogle.isDisplayed());
		WebElement search = driver.findElement(By.xpath(LocatorRepository_Practice.serchFieldXpath));
		search.clear();
		search.sendKeys("selenium webdriver" + Keys.ENTER);
		WebElement selenium = driver.findElement(By.cssSelector(LocatorRepository_Practice.searchResult));
		selenium.click();
		WebElement logoSelenium = driver.findElement(By.cssSelector(LocatorRepository_Practice.logoSelenium));
		Assert.assertTrue(logoSelenium.isDisplayed());
		WebElement selenium_downloads = driver.findElement(By.cssSelector(LocatorRepository_Practice.pageDownloads));
		selenium_downloads.click();
		WebElement selenium_java = driver.findElement(By.cssSelector(LocatorRepository_Practice.pageJavaApi));
		selenium_java.click();
		String C_URL = driver.getCurrentUrl();
		Assert.assertEquals(C_URL, "https://selenium.dev/selenium/docs/api/java/index.html");
	}

	public void Practica2() {
		driver.get(LocatorRepository.URL);
		System.out.println(driver.getTitle());
		WebElement logoGoogle = driver.findElement(By.id("hplogo"));
		Assert.assertTrue(logoGoogle.isDisplayed());
	}

	@Test(priority = 1)
	public void Practica3() {
		/*
		 * Entrar a Google 
		 * Verfificar que esta en Google 
		 * Buscar una persona 
		 * Buscar su Wiki 
		 * Comprobar que es Wikipedia 
		 * Comprobar que esta en español 
		 * Cambiar el Idioma a Ingles 
		 * Comprobar que esta en español
		 */
		
		//Entra a Google
		driver.get(LocatorRepository_Practice.URL);
		//Verifica que esta en Google
		WebElement logoGoogle = driver.findElement(By.id(LocatorRepository_Practice.logoGoogle));
		Assert.assertTrue(logoGoogle.isDisplayed());
		//Realiza la escritura y busqueda de la persona
		WebElement search = driver.findElement(By.xpath(LocatorRepository_Practice.serchFieldXpath));
		search.clear();
		search.sendKeys("katy perry" + Keys.ENTER);
		//Entra a la Wikipedia de la persona
		WebElement WikiPage = driver.findElement(By.cssSelector(LocatorRepository_Practice.pageWiki));
		WikiPage.click();
		//Verifica el Lenguaje
		String Lenguaje= driver.getCurrentUrl();
		if (Lenguaje.contains("es")) {
			System.out.println("La pagina esta en Español");
		} else {
			System.out.println("La pagina no esta en Español");
		}
		//Entra a la Wikipedia de la persona pero en Ingles
		WebElement WikiPage_English = driver.findElement(By.xpath(LocatorRepository_Practice.pageWiki_English));
		WikiPage_English.click();
		//Verifica el Lenguaje
		Lenguaje= driver.getCurrentUrl();
		if (Lenguaje.contains("en")) {
			System.out.println("La pagina esta en Ingles");
		}
		
		
		/*WebElement lenguaje = driver.findElement(By.xpath("//html[@lang='es']"));
		if (lenguaje.getText().contains("es")) {
			System.out.println("La pagina esta en Español");
		} 
		WebElement WikiPage_English = driver.findElement(By.xpath(LocatorRepository_Practice.pageWiki_English));
		WikiPage_English.click();
		if(lenguaje.getText().contains("en")) {
			System.out.println("La pagina esta en Ingles");
		}*/
	}

	@AfterTest
	private void tearDown() {
		driver.close();
		driver.quit();
	}
}
