package selenium_example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClass {

	public static void main(String[] args) {
		
		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");
			
			WebElement aguaButton = driver.findElement(By.xpath("//input[@name='bebida' and @value='agua']"));
			aguaButton.click();
			
			Thread.sleep(1000);
			
			WebElement doradaButton = driver.findElement(By.cssSelector("[name^='com'][value$='ada']"));
			doradaButton.click();
			
			
			WebElement botonRadio = driver.findElement(By.id("enviaRadiobutton"));
			botonRadio.click();
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}
		
	}

}
