package localisationSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("file://"+ System.getProperty("user.dir")+"/src/main/resources/applications/interaction.html");
			WebElement titreGeneral = driver1.findElement(By.id("TitlePage"));
	System.out.println(titreGeneral.getText());

	}

}
