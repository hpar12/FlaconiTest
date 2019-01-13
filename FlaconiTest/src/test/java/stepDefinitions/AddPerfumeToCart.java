package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class AddPerfumeToCart {

	WebDriver driver;
	HomePage home;
	LoginPage loginPage;

	@Given("^user launches the Flaconi website$")
	public void user_launches_the_Flaconi_website() {
		System.setProperty("webdriver.chrome.driver", "/Users/Hariharan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flaconi.de");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		home = new HomePage(driver);
		home.btn_CloseCookiesMessageBox();
	}

	@When("^the user selects perfume for women$")
	public void the_user_selects_perfume_for_women() {
		home = new HomePage(driver);
		home.btn_ParfumLink.click();
		driver.findElement(By.cssSelector(
				"body > div.wrapper.off-canvas-wrap > div.inner-wrap.row-collapse > div > div.content > div.row > aside > div > ul > li.active > ul > li:nth-child(1) > a"))
				.click();
		driver.findElement(By.xpath("//*[@title='Lancôme La vie est belle Eau de Parfum']")).click();
	}

	@Then("^the perfume is added to the cart$")
	public void the_perfume_is_added_to_the_cart() {
		driver.findElement(By.xpath("//*[@title='In den Warenkorb']")).click();
		driver.findElement(By.cssSelector("#htmlData >div.footer.row > div > a")).click();
		Assert.assertEquals("Lancôme - La vie est belle",
				driver.findElement(By
						.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/strong/a"))
						.getText());
	}

	@Given("^user logs into flaconi website$")
	public void user_logs_into_flaconi_website() {
		System.setProperty("webdriver.chrome.driver", "/Users/Hariharan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flaconi.de");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		home = new HomePage(driver);
		home.btn_LogIn.click();
		home.btn_CloseCookiesMessageBox();
		loginPage = new LoginPage(driver);
		loginPage.loginUser();
	}

	@When("^the user selects a perfume$")
	public void the_user_selects_a_perfume() {
		home = new HomePage(driver);
		home.btn_ParfumLink.click();
		driver.findElement(By.xpath("//*[@title='Lancôme La vie est belle Eau de Parfum']")).click();

	}

}
