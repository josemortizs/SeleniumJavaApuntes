package selenium_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		try {

			driver.get("https://www.wikipedia.es");
			//driver.navigate().to("https://www.wikipedia.es"); //Otra forma de hacerlo...
			
			/* Formas de seleccionar elementos del DOM */
			
			//driver.findElement(By.id("n-randompage")).click();
			//driver.findElement(By.xpath("//*[@id=\"main-tfa\"]//*[text() = ' Leer ']")).click();
			
			WebElement capturaDiv = driver.findElement(By.cssSelector("div#main-tfa>p:nth-of-type(2)"));
			System.out.println(capturaDiv.getText());
			
			Thread.sleep(3000);

			
			/* 
			 * La instrucción anterior devuelve un elemento WebElement.
			 * Otra forma de trabajar con dicho elemento sería la siguiente:
			 */
			
			WebElement paginaAleatoria = driver.findElement(By.linkText("Página aleatoria"));
			paginaAleatoria.click();

			WebElement tituloPaginaAleatoria = driver.findElement(By.tagName("title"));
			
			
			//String titulo = driver.getTitle();
			String titulo = tituloPaginaAleatoria.getAttribute("innerText");
			System.out.println("El título de la página es: " + titulo);
			
			Thread.sleep(2000); //Para poder revisar el funcionamiento del programa

			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}
		
		/*
		 * //Paramos, durante 5 segundos, la finalización del programa 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			driver.quit();
		*/
	}

}
