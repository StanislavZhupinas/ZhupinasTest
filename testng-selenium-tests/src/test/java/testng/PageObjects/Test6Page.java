package testng.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Test6Page {

	private WebDriver driver;
	
	public Test6Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void returnSellValue(int x, int y, String expectedValue) {
		
		String element = driver.findElement(By.cssSelector("tr:nth-of-type("+ (x + 1) +") > td:nth-of-type("+ (y+1) +")")).getText();
		
		Assert.assertEquals(element, expectedValue);
	}
}
