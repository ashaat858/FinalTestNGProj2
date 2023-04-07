package testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import page.MainPage;
import util.BrowserFactory;

public class AddingNewCategory {

	WebDriver driver;
	
	@Test
	public void EnterNewCategoryValidatingThatItsAdded() {
		
		driver = BrowserFactory.init();
		
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.enteringNewCategoryName();
		mainpage.clickOnAddCategoryButton();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		mainpage.AssertOnAddingNewCategory();
		
		BrowserFactory.tearDown();
	}
}
