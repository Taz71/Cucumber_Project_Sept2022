package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		driver.get("https://techfios.com/test/107/");
	}
	@After
	public void tearDown() {
		driver.close();
	}
	@Given("{string} button exists")
	public void button_exists(String button) {
		if(button.equalsIgnoreCase("SetSkyBlueBackground")) {
			loginPage.ClickOnTheSkyBlueButton();
		}else if(button.equalsIgnoreCase("SetSkyWhiteBackground")) {
			loginPage.ClickOnTheSkyWhiteButton();
		}else {
			System.out.println("Background Colour Change");
		}
	    
	}

	@When("I click on the button")
	public void i_click_on_the_button() {
	    loginPage.ClickOnTheSkyBlueButton();
	    loginPage.ClickOnTheSkyWhiteButton();
	}

	@Then("the background colour will change to sky blue")
	public void the_background_colour_will_change_to_sky_blue() {
	    String expectedColour = "SkyBlue";
	    String actualColour = loginPage.getPageColour();
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isDisplayed());    
	}

	
	
	@Then("the background colour will change to white.")
	public void the_background_colour_will_change_to_white() {
		String expectedColour = "White";
	    String actualColour = loginPage.getPageColour();
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).isDisplayed());  
	    
	}


}
