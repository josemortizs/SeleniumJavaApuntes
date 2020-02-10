package selenium_example;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {

	public static void main(String[] args) 
	{

		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");

			WebElement buttonAlertSimple = driver.findElement(By.id("buttonAlertSimple"));
			buttonAlertSimple.click();
			
			Thread.sleep(2000);
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			//alert.dissmiss(); para cancelar
			alert.accept();
			
			Thread.sleep(2000);
			
			WebElement alertInput = driver.findElement(By.id("buttonAlertPrompt"));
			alertInput.sendKeys("Pruebas Chrome");
			
			Thread.sleep(2000);
			
			alertInput.click();
			
			Thread.sleep(1000);
			
			/*
			 * 
			 * Revisar driver.switchTo()... para cambiar al frame del nuevo socio
			 * 
			 */
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}
		
	}

}
