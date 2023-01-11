package exIsert;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class interraction {



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file://"+ System.getProperty("user.dir") + "\\src\\main\\resources\\applications\\interaction.html");

			WebElement titreGeneral = driver.findElement(By.name("name"));
			System.out.println(titreGeneral.getAccessibleName());
			//titreGeneral.clear();
			//titreGeneral.sendKeys("fahemfantar");
			
			/*WebElement titreGeneral = driver.findElement(By.id("button_simple"));
			System.out.println(titreGeneral.getText());
*/

	}}

