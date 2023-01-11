package com.tuttoSport.stes.Run;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"},
		glue = {"com.tuttoSport.stesDefinitions"},
		plugin = {"pretty", "html:target/cucumber.html"}

		
		
		)
public class testRunner {
	public static WebDriver driver ;
	 @BeforeClass
	    public static void beforeClass() 
	    {
	    	 WebDriverManager.chromedriver().setup();
	 	    driver =new ChromeDriver();
	 	    driver.manage().window().maximize();
	 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	 

}
