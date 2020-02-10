package selenium_example;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitClass {

	public static void main(String[] args) {
		
		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");

			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
			
			WebElement buttonImplicitWait = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id("implicitWaitButton"));
				}
			});	

			buttonImplicitWait.click();
			
			Thread.sleep(5000);

			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}

	}

}
