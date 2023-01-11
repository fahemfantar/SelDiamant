package com.tuttoSport.stesDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class connexionPage {
	public WebDriver driver;
	 public connexionPage(WebDriver d) {
		driver =d ;
		PageFactory.initElements(d,this);
	}
	 @FindBy(name ="email")
	 public WebElement emailField;
	 @FindBy(name ="password")
	 public WebElement passwordField;
	 @FindBy(id ="submit-login")
	 public WebElement btnConnexion;
	 

}
