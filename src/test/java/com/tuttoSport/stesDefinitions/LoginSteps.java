package com.tuttoSport.stesDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;
import com.tuttoSport.stes.Run.testRunner;
import com.tuttospSport.PagesObjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	static WebDriver driver = testRunner.driver;
	Actions act ;

   
	connexionPage connexionPage = new connexionPage(driver);

	@Given("I launch the TuttoSport application")
	public void i_launch_the_tutto_sport_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver.get("https://www.tuttosport.com.tn/");
	}

	@When("I hover and click on connexion button")
	public void i_hover_and_click_on_connexion_button() {
	    // Write code here that turns the phrase above into concrete actions
		HomePage homePage =new HomePage(driver);
		
	    act = new Actions(driver);
	    act.moveToElement(homePage.iconUserProfil).build().perform();
	   // WebElement btnPopUpConnect = driver.findElement(By.xpath("//*[@class='bon-login-popup']//a[1]"));
	    homePage.btnPopUpConnect.click();

	}

	@Then("The connexion page is displayed")
	public void the_connexion_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  // assertTrue("The connexion page is displayed",driver.getTitle().equals("connexion"));
		assertTrue("The connexion page is not displayed",driver.getTitle().equals("Connexion"));

	}

	@When("I enter the email {string}")
	public void i_enter_the_email(String email) {
	    // Write code here that turns the phrase above into concrete actions
	  // WebElement emailField =driver.findElement(By.name("email"));
	    connexionPage.emailField.clear();
	   connexionPage.emailField.sendKeys(email);
	}

	@When("I entre the password {string}")
	public void i_entre_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions

		//WebElement passwordFeild =driver.findElement(By.name("password"));
		 connexionPage.passwordField.clear();
		 connexionPage.passwordField.sendKeys(password);
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement btnConnexion = driver.findElement(By.id("submit-login"));
		connexionPage.btnConnexion.click();

	    
	}

	@Then("I connect on the application")
	public void i_connect_on_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(" i dont connect on the app", driver.getCurrentUrl().contains("mon-compte"));
	}

}
