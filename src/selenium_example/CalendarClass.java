package selenium_example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarClass {

	public static void main(String[] args) 
	{

		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");

			
			Thread.sleep(2000);
			
			WebElement calendario = driver.findElement(By.name("fecha"));
			calendario.sendKeys("15121980");
			Thread.sleep(1000);
			calendario.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			calendario.sendKeys("1030");
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}
		
	}

}
