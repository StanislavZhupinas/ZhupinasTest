package testng.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Test4Page {

	private WebDriver driver;
		
	public Test4Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(css="[class='btn btn-lg btn-primary']")
	private WebElement activeButton;
	
	public WebElement getActiveButton() {
		return activeButton;
	}
	
	@FindBy(css="[class='btn btn-lg btn-secondary']")
	private WebElement inactiveButton;
	
	public WebElement getInactiveButton() {
		return inactiveButton;
	}
	
	/*
	 * Method to assert button status. Accepts a WebElement, boolean expected state.
	 */
	public void buttonStateValidation (WebElement button, boolean isTrue) {
		Assert.assertEquals(button.isEnabled(), isTrue);
	}

}
