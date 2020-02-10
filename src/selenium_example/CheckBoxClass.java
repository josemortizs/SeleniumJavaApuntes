package selenium_example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxClass {

	public static void main(String[] args) {

		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");
			
			List<WebElement> listaCheckbox = driver.findElements(By.name("listaCompra"));
			
			for(WebElement elemento : listaCheckbox)
			{
				elemento.click();
				System.out.println(elemento.isSelected());
				Thread.sleep(1000);
			}
			System.out.println("_-----_");
			
			listaCheckbox.get(0).click();
			listaCheckbox.get(3).click();
			
			for(WebElement elemento : listaCheckbox)
			{
				System.out.println(elemento.isSelected());
			}
			
			
			
			WebElement botonCheckbox = driver.findElement(By.id("enviaCheckboxes"));
			botonCheckbox.click();
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}
		
	}

}
