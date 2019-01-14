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

	@FindBy(css = "#loginEmail")
	public WebElement btn_LoginEmail;

	@FindBy(css = "#loginPassword")
	public WebElement btn_LoginPassword;

	@FindBy(css = "#loginSubmit")
	public WebElement btn_LoginSubmit;

	@FindBy(css = "#button-primary__text")
	public WebElement btn_CompleteOrderContinue;

	public void loginUserOrderPage() {
		btn_LoginEmail.sendKeys("harifun2k@gmail.com");
		btn_LoginPassword.sendKeys("wipro@123");
		btn_LoginSubmit.click();
	}

	public void btn_AlreadyFlacnoniCustomer() {
		btn_AlreadyFlacnoniCustomer.click();
	}
}
