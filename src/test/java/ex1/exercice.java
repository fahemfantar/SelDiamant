package ex1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class exercice {




		public static void main(String[] args) {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("file://"+ System.getProperty("user.dir")+"/src/main/resources/applications/ExercicesXpath.html");
			//	WebElement titreGeneral = driver1.findElement(By.id("TitlePage"));
		//System.out.println(titreGeneral.getText());
//question 1
		//	WebElement titreGeneral =driver1.findElement(By.xpath("//td[contains(text(),'can')]"));
			//System.out.println(titreGeneral.getText());
		
//question 2
				WebElement titreGeneral =driver1.findElement(By.xpath("\r\n"
						+ "//td[text()>=300 and text()<  630]"));
				System.out.println(titreGeneral.getText());
				
				
				
	//	List<WebElement> list = driver1.findElements(By.xpath("//td[contains(text(),\"700\")]/ preceding::td[2]\r\n" + ""));
			//	System.out.println(list.toString());
		}

	}


