package com.tuttospSport.PagesObjects;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver d) {
		driver =d ;
		PageFactory.initElements(d,this);
	}
	@FindBy(className ="user-info" )
	public WebElement iconUserProfil;
@FindBy(xpath = "//*[@class='bon-login-popup']//a[1]")
public WebElement btnPopUpConnect;
  //  WebElement btnPopUpConnect = driver.findElement(By.xpath("//*[@class='bon-login-popup']//a[1]"));

	//public  WebElement iconUserProfil = driver.findElement(By.className("user-info"));
}
