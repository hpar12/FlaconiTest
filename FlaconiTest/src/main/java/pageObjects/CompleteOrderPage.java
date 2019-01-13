package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteOrderPage {

	public CompleteOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#button-primary > div > div:nth-child(2)")
	public WebElement btn_Continue;

	@FindBy(css = "#showLoginForm")
	public WebElement btn_AlreadyFlacnoniCustomer;

}
