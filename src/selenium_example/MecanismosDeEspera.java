package selenium_example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MecanismosDeEspera {

	public static void main(String[] args) {
		
		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		// CONFIGURAMOS LA INSTANCIA DE WEBDRIVER AGREGANDO UNA ESPERA IMPLÍCITA DE 10 SEGUNDOS
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");
			
			WebElement buttonImplicitWait = driver.findElement(By.id("implicitWaitButton"));
			buttonImplicitWait.click();

			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}


	}

}
