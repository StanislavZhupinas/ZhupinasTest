package testng.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Test1Page {
	
	private WebDriver driver;
	
	public Test1Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Define an Email element and it's functions
	@FindBy(id="inputEmail")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	//Define an Password element and it's functions
	@FindBy(id="inputPassword")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	//Define an Sign In element and it's functions
	@FindBy(css="[type='submit']")
	private WebElement signInButton;
	
	public WebElement getSignInButton() {
		return signInButton;
	}

	public void submitSignIn() {
		this.signInButton.click();
	}
	
	public void assertElementPresence (WebElement element) {
		Assert.assertEquals(true, element.isDisplayed());
	}

}
