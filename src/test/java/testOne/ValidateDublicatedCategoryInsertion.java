package testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DuplicatePage;
import page.MainPage;
import util.BrowserFactory;

public class ValidateDublicatedCategoryInsertion {

	WebDriver driver;
	
	@Test
	public void AddDuplicate() {
		
		driver = BrowserFactory.init();
		
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.enteringNewCategoryName();
		mainpage.clickOnAddCategoryButton();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mainpage.enteringNewCategoryName();
		mainpage.clickOnAddCategoryButton();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		mainpage.AssertOnAddingNewName();
//		
//		mainpage.clickOnAddedNewNameFromListToDelete();
//		mainpage.clickOnRemoveButtonToDeleteAddedNewName();
//		mainpage.assertOnRemovingNewName();
		DuplicatePage duplicatepage = PageFactory.initElements(driver, DuplicatePage.class);
		duplicatepage.assertOnAddingDuplicateCategory();
		
		BrowserFactory.tearDown();
		
	
	}
}
