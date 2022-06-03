package com.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FinalSteps {
	
	@Given("^user visit practice site final$")
	public void user_visit_practice_site_final() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@When("^user click on dresses tab final$")
	public void user_click_on_dresses_tab_final() throws Throwable {
	    
	}

}
