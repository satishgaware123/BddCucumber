package stepDefination;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBackground {
	WebDriver driver;

	@Given("user navigate to lpage")
	public void user_navigate_to_lpage() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://3.25.145.165/auth");
		Thread.sleep(3000);
	}

	@Given("eters username & password")
	public void eters_username_password() throws Exception {
		WebElement email = driver.findElement(By.xpath("//ui-input//input[@type='text']"));
		email.sendKeys("newaurmember@yopmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Admin@123");
		Thread.sleep(3000);
	}

	@Then("click on the login button")
	public void user_click_on_the_login_button() throws Exception {
		WebElement button = driver.findElement(By.xpath("//ui-button[@class='login-button']"));
		button.click();
		Thread.sleep(3000);
	}

	@Given("click on the profile tab")
	public void click_on_the_profile_tab() throws Exception {
		FluentWait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ui-menu)[1]")));
		WebElement button = driver.findElement(By.xpath("(//ui-menu)[1]"));
		button.click();
		Thread.sleep(3000);
	}

	@Given("click on the people tab")
	public void click_on_the_people_tab() throws Exception {

		FluentWait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ui-icon//i)[8]")));
		WebElement button = driver.findElement(By.xpath("(//ui-icon//i)[8]"));
		button.click();
		Thread.sleep(3000);
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();

	}

}
