package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MainPage {

	WebDriver driver;
	static String NewCategory = "Hello its Me";
	SoftAssert softAssert;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
//	WebElement CATEGORY_FIELD;
	@FindBy(xpath = "//input[@name='categorydata']")
	WebElement CATEGORY_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@type = 'submit' and @value='Add category']")
	WebElement ADD_CATEGORY_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Hello it's Me')]")
	WebElement ADDED_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	public WebElement DUE_DATE_MONTH_DROPDOWN_BUTTON;
//	@FindBy (how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li/a") WebElement INDEX_ADDED_NEW_NAME;

	public void enteringNewCategoryName() {

		CATEGORY_FIELD.sendKeys(NewCategory);
	}

	public void clickOnAddCategoryButton() {

		ADD_CATEGORY_BUTTON.click();
	}

	public void AssertOnAddingNewCategory() {
		softAssert.assertEquals(NewCategory, ADDED_CATEGORY_ELEMENT, "Category Name has Been Added Successfuly!");
	}

	public void clickingDropdownOfDueDateMonth() {
		DUE_DATE_MONTH_DROPDOWN_BUTTON.click();
	}

	public void selectFromDropdown(WebElement element) {

		String before_xpath = "//*[@id='extra']/select[3]/option[";
		String after_xpath = "]";
		for (int i = 2; i <= 13; i++) {
			String month = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(month);

		}

	}
}
