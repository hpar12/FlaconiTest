package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BuyPerfumeStepDefinition {

	WebDriver driver;

	@Given("^user launches the Flaconi website on a Chrome browser$")
	public void user_launches_the_Flaconi_website_on_a_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/Hariharan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.flaconi.de");
	}

	@When("^user is on the Flaconi home page$")
	public void user_is_on_the_Flaconi_home_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Online Parfümerie: Parfum & Kosmetik bestellen | FLACONI", title);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// This is to close the cookies message displayed in the browser
		driver.findElement(By.xpath("/html/body/div[5]/div/a/span")).click();
	}

	@Then("^user clicks on the Parfum link$")
	public void user_clicks_on_the_parfum_link() {
		driver.findElement(By.cssSelector("#main-navigation > ul > li:nth-child(2) > a")).click();
	}

	@Then("^on the perfume list page selects a perfume by clicking on it$")
	public void on_the_perfume_list_page_selects_a_perfume_by_clicking_on_it() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean startButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/a/span"))
				.isDisplayed();
		Assert.assertTrue(startButton);

		driver.findElement(By.cssSelector(
				"a[href='/parfum/yves-saint-laurent/black-opium/yves-saint-laurent-black-opium-eau-de-parfum.html']"))
				.click();

	}

	@Then("^adds the perfume to the cart$")
	public void adds_the_perfume_to_the_cart() {

		driver.findElement(By.cssSelector(
				"#productAddToCartForm-80005078-30 > div.columns.large-8.large-push-4.medium-7.medium-push-5.small-12.cart-button-wrapper > button"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		boolean continueShoppingButton = driver.findElement(By.cssSelector("#htmlData > div.footer.row > div > button"))
				.isDisplayed();
		Assert.assertEquals(true, continueShoppingButton);

		boolean viewCart = driver.findElement(By.cssSelector("#htmlData > div.footer.row > div > a")).isDisplayed();
		Assert.assertEquals(true, viewCart);

	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.close();

	}
}
