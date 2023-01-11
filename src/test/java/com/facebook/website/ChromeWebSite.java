package com.facebook.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeWebSite {
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver1.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
	}
}
