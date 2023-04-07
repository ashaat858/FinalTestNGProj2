package testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MainPage;
import util.BrowserFactory;

public class DropDownMonthTest {

	
WebDriver driver;
	
	@Test
	public void ValidateMonthDropdown() {
		
		driver = BrowserFactory.init();

		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.clickingDropdownOfDueDateMonth();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mainpage.selectFromDropdown(mainpage.DUE_DATE_MONTH_DROPDOWN_BUTTON);
		
		
		BrowserFactory.tearDown();
}
}