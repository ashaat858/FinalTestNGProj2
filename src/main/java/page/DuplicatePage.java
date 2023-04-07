package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DuplicatePage {

	WebDriver driver;
	SoftAssert softAssert;
	public DuplicatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.XPATH, using = "//*[contains(text(),'The category you want to add already exists: ')]") WebElement VALIDATE_DUPLICATE_MESSAGE;

	public void assertOnAddingDuplicateCategory() {
		
		Assert.assertEquals(MainPage.NewCategory,VALIDATE_DUPLICATE_MESSAGE);
		
	}
}
