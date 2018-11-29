package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.model.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	LoginPage loginPage;
	WebDriver driver;
	
	public StepDefination() {
		loginPage=new LoginPage();
	}
	
	@Given("^User is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver\\chromedriver.exe");
	 driver= new ChromeDriver();
driver.get("D:\\Practice\\SpringWebServices\\HotelBookingDemo\\login.html");
			
			loginPage=new LoginPage(driver);
			
			System.out.println("page loaded in browser");
	}

	@When("^Username Password is blank$")
	public void username_Password_is_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Dispay Error Message 'Please enter Username'$")
	public void dispay_Error_Message_Please_enter_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
