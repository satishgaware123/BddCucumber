//package stepDefination;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestDataTable {
//	WebDriver driver;
//
//	@Given("user navigate to the login page")
//	public void user_navigate_to_the_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://3.25.145.165/auth");
//	}
//
//	@Given("user enter the email address and password")
//	public void user_enter_the_email_address_and_password(DataTable dataTable) {
//		List<List<String>> data = dataTable.cells();
//		driver.findElement(By.xpath("//ui-input//input[@type='text']")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
//
//	}
//
//	@Given("click on the login button")
//	public void click_on_the_login_button() throws Exception {
//		WebElement button = driver.findElement(By.xpath("//ui-button[@class='login-button']"));
//		button.click();
//		Thread.sleep(3000);
//	}
//
//	@Then("close the Browser")
//	public void close_the_browser() {
//		driver.quit();
//	}
//}
