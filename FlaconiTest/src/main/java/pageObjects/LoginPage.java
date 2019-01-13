package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#loginEmail")
	public WebElement btn_EmailAddress;

	@FindBy(css = "#loginPassword")
	public WebElement btn_Password;

	@FindBy(css = "#loginSubmit")
	public WebElement btn_LogIn;

	public void loginUser() {
		btn_EmailAddress.sendKeys("harifun2k@gmail.com");
		btn_Password.sendKeys("wipro@123");
		btn_LogIn.click();
	}

}
