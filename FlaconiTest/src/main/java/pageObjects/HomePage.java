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

	@FindBy(css = "#mini-basket > a > span.ico-basket")
	public WebElement btn_CartIcon;

	@FindBy(css = "body > div.wrapper.off-canvas-wrap > div.inner-wrap.row-collapse > div > header > div.main-header.clearer > div.logo > a")
	public WebElement btn_FlaconiIcon;

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

	@FindBy(css = "body > div.wrapper.off-canvas-wrap > div.inner-wrap.row-collapse > div > div.content > div.row > aside > div > ul > li.active > ul > li:nth-child(1) > a")
	public WebElement btn_WomansPerfume;

	@FindBy(xpath = "//*[@title='Lancôme La vie est belle Eau de Parfum']")
	public WebElement btn_SelectedWomanPerfume;

	@FindBy(xpath = "//*[@title='Lancôme La vie est belle Eau de Parfum']")
	public WebElement btn_SelectedPerfume;

	public void btn_CloseCookiesMessageBox() {
		btn_CloseCookiesMessageBox.click();
	}

	public void navigateTo_HomePage() {
		driver.get("https://www.flaconi.de");
	}

	public void btn_SearchSubmit() {
		btn_SearchSubmit.click();

	}

	public void btn_SearchBox() {
		btn_SearchBox.sendKeys("dior");
	}

	public void btn_ParfumLink() {
		btn_ParfumLink.click();
	}

	public void btn_CartIcon() {
		btn_CartIcon.click();
	}

	public void btn_WomansPerfume() {
		btn_WomansPerfume.click();
	}

	public void btn_SelectedWomanPerfume() {
		btn_SelectedWomanPerfume.click();
	}

	public void btn_SelectedPerfume() {
		btn_SelectedPerfume.click();
	}

}
