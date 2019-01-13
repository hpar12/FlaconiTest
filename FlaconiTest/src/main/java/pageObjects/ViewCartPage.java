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

	@FindBy(css = "#continue-shopping-btn-2")
	public WebElement btn_ContinueShopping;

}
