//package stepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestScenarioOutline {
//	WebDriver driver;
//
//	@Given("user navigate to the login page")
//	public void user_navigate_to_the_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://3.25.145.165/auth"); // replace with actual URL
//	}
//
//	@And("user enter the {string} & {string}")
//	public void user_enter_the_and(String username, String password) throws Exception {
//		driver.findElement(By.xpath("//ui-input//input[@type='text']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//		Thread.sleep(3000); // Replace with WebDriverWait
//	}
//
//	@When("click on the login button")
//
//	public void click_on_the_login_button() throws Exception {
//		WebElement button = driver.findElement(By.xpath("//ui-button[@class='login-button']"));
//		button.click();
//		Thread.sleep(3000); // Replace with WebDriverWait
//	}
//
//	@Then("close the Browser")
//	public void close_the_browser() {
//		driver.quit();
//	}
//}
