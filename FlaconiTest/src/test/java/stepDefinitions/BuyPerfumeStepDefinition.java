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
		home.btn_CloseCookiesMessageBox();
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
		driver.close();
	}

}
