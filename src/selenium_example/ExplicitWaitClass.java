package selenium_example;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static void main(String[] args) {
		
		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");
			
			// CREAMOS LA INSTANCIA DE WEBDRIVERWAIT A LA QUE LLAMAREMOS PARA ESPERAR A QUE EL ELEMENTO CUMPLA LA CONDICIÓN QUE ESTABLECEMOS
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			// LLAMAMOS A LA INSTANCIA WAIT Y ESPECIFICAMOS QUE ESPERAMOS (AL MENOS 10 SEGUNDOS) A QUE EL ELEMENTO ESTÉ DISPONIBLE
			WebElement boton = wait.until(ExpectedConditions.elementToBeClickable(By.id("explicitWaitButton")));
			
			
			boton.click();
			
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}

	}

}
