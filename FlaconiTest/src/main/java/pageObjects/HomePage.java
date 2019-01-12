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

	@FindBy(css = "body > div.cookie-box > div > a > span")
	public WebElement btn_CloseCookiesMessageBox;

	@FindBy(css = "#autosuggest-form-header > input")
	public WebElement btn_SearchBox;

	@FindBy(css = "#autosuggest-form-header > button")
	public WebElement btn_SearchSubmit;

	public void perform_Search(String search) {
		// driver.navigate().to("http://shop.demoqa.com/?s=" + search +
		// "&post_type=product");
	}

	public void navigateTo_HomePage() {
		driver.get("https://www.flaconi.de");
	}

}
