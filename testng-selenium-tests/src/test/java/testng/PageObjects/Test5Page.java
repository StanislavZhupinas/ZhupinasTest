package testng.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Test5Page {

	private WebDriver driver;
	
	public Test5Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="test5-button")
	private WebElement activeButton;
	
	@FindBy(id="test5-alert")
	private WebElement validationMessage;
	
	public WebElement getActiveButton() {
		return activeButton;
	}
	
	public WebElement getValidationMessage() {
		return validationMessage;
	}
	
	/*
	 * Method to click button when it's available. Accepts a WebElement.
	 */
	public void clickButtonWhenAvailable(WebElement button) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 20); 
		webDriverWait.withMessage("Waited for 20 seconds but the button is still not available");
		
		WebElement availableButton =
				webDriverWait.until(
						ExpectedConditions.visibilityOf(button));
		
		availableButton.click();
	}
	
	/*
	 * Method to check the validation message. Accepts a WebElement.
	 */
	public void checkTheValidationMessage(WebElement message) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 50); 
		webDriverWait.withMessage("Waited for 50 seconds but the message is still not available");
		
		WebElement availableMessage =
				webDriverWait.until(
						ExpectedConditions.visibilityOf(message));
		
		Assert.assertEquals(availableMessage.getText().trim(), "You clicked a button!");
	}
	
}
