package testng.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test3Page {

	private WebDriver driver;
	
	public Test3Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="dropdownMenuButton")
	private WebElement dropdownMenu;
	
	
	
	public void assertDropdownValue (WebElement element,String expectedValue) {
		String currentValue = element.getText();
		Assert.assertEquals(currentValue, expectedValue);
	}

	
	public WebElement getDropdownMenu() {
		return dropdownMenu;
	}


	@FindBy(css="[class='dropdown-item']")
	private List<WebElement> dropdownItems;

	public void setDropdownMenu(String dropdownValue) {
		dropdownMenu.click();		
		
		driver.findElement(By.xpath("//a[text()='" + dropdownValue + "']")).click();
	}
}
