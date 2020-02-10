package selenium_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboBoxClass {

	public static void main(String[] args) 
	{
		
		// CONFIGURACIÓN
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		// CREA UNA INSTANCIA DE LA CLASE WEBDRIVER UTILIZANDO CHROME COMO NAVEGADOR
		WebDriver driver = new ChromeDriver();
		
		try {

			driver.get("file:///Applications/XAMPP/xamppfiles/htdocs/openwebinars/index_completo.html");
			
			Select comboboxSimple = new Select(driver.findElement(By.id("combobox1")));
			
			comboboxSimple.selectByIndex(2);
			
			Thread.sleep(2000);
			
			Select comboboxMultiple = new Select(driver.findElement(By.id("combobox2")));
			
			comboboxMultiple.selectByIndex(0);
			comboboxMultiple.selectByValue("pera");
			comboboxMultiple.selectByVisibleText("Plátano");
			
			Thread.sleep(2000);
			
			WebElement botonCombo = driver.findElement(By.id("enviaComboboxes"));
			
			botonCombo.click();
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// driver.close(); // Cerraría la ventana, o pestaña, activa
			driver.quit();
			
		}
		
	}

}
