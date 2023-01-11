package SelJunitTest;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestsSel {
	public static WebDriver driver;
	@After
	public void afterTestCase() {
		driver.quit();
	}
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();	
	}
	@Before
	public void beforTestCase() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void openFacebook() {
		
		
	
		driver.get("https://fr-fr.facebook.com/");
		//WebElement cookiesAccept = driver.findElement(By.xpath("//*[@data-testid='cookie-policy-manage-dialog-accept-button'][2]"));
		//cookiesAccept.click();
	}
	@Test
	public void openGoogle() {
		
		
		driver.get("https://www.google.com/");
		//WebElement cookiesAccept = driver.findElement(By.xpath("//*[@data-testid='cookie-policy-manage-dialog-accept-button'][2]"));
		//cookiesAccept.click();
	}

	

}
