package testng.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Test2Page {
	
	private WebDriver driver;
	
	public Test2Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public List<WebElement> getListItems() {
		return listItems;
	}
	
	//Define a elements List and it's functions
	@FindBy(className="list-group-item")
	private List<WebElement> listItems;
	
	/*
	 * Method to assert item list values. Accepts a WebElement, int index number and String expected value.
	 */
	public void listItemValueAssert (List<WebElement> element, int index, String expectedValue) {
		
		String listItem = element
				.get(index-1)
				.getText()
				.substring(0, expectedValue.length());
		
		Assert.assertEquals(listItem, expectedValue);
	}
	
	/*
	 * Method to assert item list badge values. Accepts a WebElement, int index number and String expected value.
	 */
	public void listItemBadgeAssert (List<WebElement> element, int index, String expectedValue) {
		
		String listItem = element
				.get(index-1)
				.getText()
				.substring(12);
		Assert.assertEquals(listItem, expectedValue);
	}

	/*
	 * Method to assert a number of items. Accepts a WebElement, int expected value.
	 */
	public void assertListItemsNumber (List<WebElement> element, int expectedNumberOfItems) {
		int count = element.size();
		Assert.assertEquals(expectedNumberOfItems, count);
	}
}
