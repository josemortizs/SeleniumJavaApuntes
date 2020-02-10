package selenium_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxClass {

	public static void main(String[] args) {
		
		/*
		 * 
		 * WebElement usernameBox = driver.findElement(By.cssSelector("#username"));
		 * WebElement usernameBox = driver.findElement(By.xpath("//input[@id='password']"));
		 * WebElement boton = driver.findElement(By.cssSelector("button#botonLogin"));
		 * 
		 */
		
		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		String tituloEsperado = "Selenium - Wikipedia, la enciclopedia libre";
		
		
		try {

			driver.get("https://www.wikipedia.es");
			
			WebElement cajaDeBusqueda = driver.findElement(By.id("searchInput"));
			WebElement botonDeBusqueda = driver.findElement(By.id("searchButton"));
			Thread.sleep(2000);
			cajaDeBusqueda.sendKeys("selenium");
			Thread.sleep(2000);
			botonDeBusqueda.click();
			
			String tituloWeb = driver.getTitle();
			
			if(tituloWeb.equals(tituloEsperado)) System.out.println("El título es el esperado, en concreto: " + tituloWeb);
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}

	}

}
