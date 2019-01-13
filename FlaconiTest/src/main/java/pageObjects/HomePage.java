package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#main-navigation > ul > li:nth-child(2) > a")
	public WebElement btn_ParfumLink;

	// @FindBy(css = "#login-link > span:nth-child(2)")
	// public WebElement btn_Login;

	@FindBy(css = "#login-link > span.ico-account")
	public WebElement btn_LogIn;

	@FindBy(css = "body > div.cookie-box > div > a > span")
	public WebElement btn_CloseCookiesMessageBox;

	@FindBy(css = "#autosuggest-form-header > input")
	public WebElement btn_SearchBox;

	@FindBy(css = "#autosuggest-form-header > button")
	public WebElement btn_SearchSubmit;

	@FindBy(css = "#ProductFeedWidget > div.sc-bbmXgH.cwzxIL > div > button.sc-jqCOkK.eDBGjH")
	public WebElement btn_BeautyBazaarParfum;

	public void btn_CloseCookiesMessageBox() {
		btn_CloseCookiesMessageBox.click();
	}

	public void navigateTo_HomePage() {
		driver.get("https://www.flaconi.de");
	}

	// public void btn_ParfumLink() {
	// btn_ParfumLink.click();
	// }

}
