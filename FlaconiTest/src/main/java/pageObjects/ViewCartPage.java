package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {

	public ViewCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#to-checkout-btn-1")
	public WebElement btn_Checkout;

	@FindBy(xpath = "//*[@id='continue-shopping-btn-1']")
	public WebElement btn_ContinueShopping;

	@FindBy(css = "#htmlData > div.footer.row > div > a")
	public WebElement btn_CheckoutMiniCartPopup;

	@FindBy(name = "#date_of_birth")
	public WebElement btn_DateOfBirthField;

	public void btn_CheckoutMiniCartPopup() {
		btn_CheckoutMiniCartPopup.click();
	}

	public void btn_ContinueShopping() {
		btn_ContinueShopping.click();
	}

	public void btn_DateOfBirthField() {
		btn_DateOfBirthField.click();
		btn_DateOfBirthField.sendKeys("10.04.1998");
	}

	public void btn_Checkout() {
		btn_Checkout.click();
	}

}
