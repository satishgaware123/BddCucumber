//package stepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestLoginPage {
//	WebDriver driver;
//
//	@Given("open the browser")
//	public void open_the_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@Given("user navigate to the test site")
//	public void user_navigate_to_the_test_site() {
//		driver.get("http://3.25.145.165/auth");
//	}
//
//	@Given("user enter the username")
//	public void user_enter_the_username() {
//		WebElement email = driver.findElement(By.xpath("//ui-input//input[@type='text']"));
//		email.sendKeys("newaurmember@yopmail.com");
//	}
//
//	@When("user enter the  password")
//	public void user_enter_the_password() {
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("Admin@123");
//	}
//
//	@When("user click on the login button")
//	public void user_click_on_the_login_button() throws Exception {
//		WebElement button = driver.findElement(By.xpath("//ui-button[@class='login-button']"));
//		button.click();
//		Thread.sleep(3000);
//	}
//
//	@When("verify user navigate to the home page")
//	public void verify_user_navigate_to_the_home_page() {
//		String urlString = driver.getCurrentUrl();
//		System.out.println(urlString);
////		Assert.assertEquals(urlString, "http://3.25.145.165/auth");	
//	}
//
////	@Then("close the browser")
////	public void close_the_browser() {
////		driver.quit();
////	}
//}
