package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddPerfumeToCart {

	WebDriver driver;

	@Given("^user has added a perfume to the cart$")
	public void user_has_added_a_perfume_to_the_cart() {
	}

	@Then("^the perfume is added to the cart$")
	public void the_perfume_is_added_to_the_cart() {

		driver.findElement(By.cssSelector(
				"#productAddToCartForm-80005078-30 >div.columns.large-8.large-push-4.medium-7.medium-push-5.small-12.cart-button-wrapper> button"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String itemAddedToCartTitle_Actual = driver.findElement(By.cssSelector("#htmlData > div.header.row > div > h1"))
				.getText();
		String itemAddedToCartTitle_Expected = "1 Artikel wird in den Warenkorb gelegt.";
		Assert.assertEquals(itemAddedToCartTitle_Expected, itemAddedToCartTitle_Actual);
	}

	@When("^the user wants to view the cart$")
	public void the_user_wants_to_view_the_cart() {
	}

	@Then("^clicks on the view cart icon$")
	public void clicks_on_the_view_cart_icon() {
	}

	@Then("^the selected perfume is displayed in the cart$")
	public void the_selected_perfume_is_displayed_in_the_cart() {
	}
}
