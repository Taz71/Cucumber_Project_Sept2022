package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

//	Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SkyBlueColour_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SkyWhiteColour_Element;

	public void ClickOnTheSkyBlueButton() {
		SkyBlueColour_Element.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void ClickOnTheSkyWhiteButton() {
		SkyWhiteColour_Element.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String getPageColour() {
		return driver.getTitle();
	}
}
