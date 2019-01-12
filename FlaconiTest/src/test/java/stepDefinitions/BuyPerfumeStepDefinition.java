package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class BuyPerfumeStepDefinition {

	WebDriver driver;
	HomePage home;
	// WebDriverWait wait = new WebDriverWait(driver, 20);

	@Given("^user in on Flaconi website$")
	public void user_in_on_Flaconi_website() {
		System.setProperty("webdriver.chrome.driver", "/Users/Hariharan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flaconi.de");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		home = new HomePage(driver);
		home.btn_CloseCookiesMessageBox.click();

	}

	@When("^the user selects the Parfum link$")
	public void the_user_selects_the_Parfum_link() {

		home = new HomePage(driver);

		home.btn_ParfumLink.click();
	}

	@Then("^chooses a perfume that he wishes to buy$")
	public void chooses_a_perfume_that_he_wishes_to_buy() {
		driver.findElement(By.cssSelector(
				"a[href='/parfum/yves-saint-laurent/black-opium/yves-saint-laurent-black-opium-eau-de-parfum.html']"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

	@When("^the user searches for a perfume$")
	public void the_user_searches_for_a_perfume() {
		home = new HomePage(driver);
		home.btn_SearchBox.sendKeys("dior");
		home.btn_SearchSubmit.click();
	}

	@Then("^chooses the perfume she wishes to buy$")
	public void chooses_the_perfume_she_wishes_to_buy() {

		driver.findElement(By.cssSelector(
				"body > div.wrapper.off-canvas-wrap > div.inner-wrap.row-collapse > div > div.content > div > div.category-products.columns.small-12.medium-8.large-9.pull-right > div.dior-shop__catalog > div:nth-child(2) > div > div > div.slick-list.draggable > div > div:nth-child(2) > a > img"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// driver.findElement(By.cssSelector(
		// "#product-conversion >
		// div.medium-12.large-6.columns.purchasepanel.left > ul >
		// li.product-container.variant.active"))
		// .click();
		driver.close();
	}

	// Assert message 1 Artikel wurde in den Warenkorb gelegt.

	//
	//
	// boolean continueShoppingButton =
	// driver.findElement(By.cssSelector("#htmlData > div.footer.row > div >
	// button"))
	// .isDisplayed();
	// Assert.assertEquals(true, continueShoppingButton);
	//
	// boolean viewCart = driver.findElement(By.cssSelector("#htmlData >
	// div.footer.row > div > a")).isDisplayed();
	// Assert.assertEquals(true, viewCart);

}
//
// @Given("^user launches the Flaconi website$")
// public void user_launches_the_Flaconi_website() {
// System.setProperty("webdriver.chrome.driver",
// "/Users/Hariharan/Downloads/chromedriver");
// driver = new ChromeDriver();
// driver.get("https://www.flaconi.de");
// }
//
// @When("^user is on the Flaconi home page$")
// public void user_is_on_the_Flaconi_home_page() {
// String title = driver.getTitle();
// Assert.assertEquals("Online Parfümerie: Parfum & Kosmetik bestellen |
// FLACONI", title);
//
// // WebDriverWait wait = new WebDriverWait(driver, 20);
//
// // wait.until(ExpectedConditions
// // .visibilityOfElementLocated(By.cssSelector("#main-navigation > ul >
// // li:nth-child(2) > a")));
//
// // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
// // This is to close the cookies message displayed in the browser
// driver.findElement(By.xpath("/html/body/div[5]/div/a/span")).click();
// }
//
// @Then("^user clicks on the Parfum link$")
// public void user_clicks_on_the_parfum_link() {
// driver.findElement(By.cssSelector("#main-navigation > ul >
// li:nth-child(2) > a")).click();
// }
//
// @Then("^on the perfume list page selects a perfume by clicking on it$")
// public void
// on_the_perfume_list_page_selects_a_perfume_by_clicking_on_it() {
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
// boolean startButton =
// driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/a/span"))
// .isDisplayed();
// Assert.assertTrue(startButton);
//
// driver.findElement(By.cssSelector(
// "a[href='/parfum/yves-saint-laurent/black-opium/yves-saint-laurent-black-opium-eau-de-parfum.html']"))
// .click();
//
// }
//
// @Then("^adds the perfume to the cart$")
// public void adds_the_perfume_to_the_cart() {
//
// driver.findElement(By.cssSelector(
// "#productAddToCartForm-80005078-30 >
// div.columns.large-8.large-push-4.medium-7.medium-push-5.small-12.cart-button-wrapper
// > button"))
// .click();
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
// boolean continueShoppingButton =
// driver.findElement(By.cssSelector("#htmlData > div.footer.row > div >
// button"))
// .isDisplayed();
// Assert.assertEquals(true, continueShoppingButton);
//
// boolean viewCart = driver.findElement(By.cssSelector("#htmlData >
// div.footer.row > div > a")).isDisplayed();
// Assert.assertEquals(true, viewCart);
//
// }
//
// @Then("^close the browser$")
// public void close_the_browser() {
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
// driver.close();
//
// }
