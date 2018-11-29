package Demo1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.cg.model.LoginPageFactory;
import com.cg.model.RegistrationPageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	
	RegistrationPageFactory regPage;
	WebDriver driver;
	
	public StepDefination() {
		regPage=new RegistrationPageFactory(driver);
	}
	

@Given("^User is on registration Page$")
public void user_is_on_registration_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","D:\\BDD\\chromedriver\\chromedriver.exe");
	  driver= new ChromeDriver();
			driver.get("D:\\Practice\\SpringWebServices\\HotelBookingDemo\\hotelbooking.html");
			
			regPage=new RegistrationPageFactory(driver);
			
			System.out.println("page loaded in browser");
}

@When("^firstname is blank$")
public void firstname_is_blank() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	regPage.setTxtFN("");
	regPage.clickLoginButton();
  
}

@Then("^Dispay Error Message 'Please fill the First Name'$")
public void dispay_Error_Message_Please_fill_the_First_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String expErrorMsg= "Please fill the First Name";
	String actErrMsg=driver.switchTo().alert().getText();
	Assert.assertEquals(actErrMsg, expErrorMsg);
	driver.switchTo().alert().accept();
	
}

@When("^lastname is blank$")
public void lastname_is_blank() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regPage.setTxtFN("Priya");
	regPage.setLastName("");
	regPage.clickLoginButton();
}

@Then("^Display Error Message 'Please enter Lastname'$")
public void display_Error_Message_Please_enter_Lastname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	String expErrorMsg= "Please fill the Last Name";
	String actErrMsg=driver.switchTo().alert().getText();
	Assert.assertEquals(actErrMsg, expErrorMsg);
	driver.switchTo().alert().accept();
	driver.close();
}

	@When("^Email is blank$")
	public void email_is_blank() throws Throwable {
		regPage.setTxtFN("Priya");
		regPage.setLastName("Priya");
		regPage.setEmail("");
		regPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter email'$")
	public void display_alert_Please_enter_email() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Email";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Mobile Number is blank$")
	public void mobile_Number_is_blank() throws Throwable {
		regPage.setTxtFN("Priya");
		regPage.setLastName("Priya");
		regPage.setEmail("priya.kochar@capgemini.com");
		regPage.setPhone("");
		regPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter mobile number'$")
	public void display_alert_Please_enter_mobile_number() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Mobile No.";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Invalid email is entered$")
	public void invalid_email_is_entered() throws Throwable {
		regPage.setTxtFN("Priya");
		regPage.setLastName("Priya");
		regPage.setEmail("sha");
		regPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid email'$")
	public void display_alert_Invalid_email() throws Throwable {
		String expErrMsg = "Please enter valid Email Id.";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Invalid Mobile Number is entered$")
	public void invalid_Mobile_Number_is_entered() throws Throwable {
		regPage.setTxtFN("Priya");
		regPage.setLastName("Priya");
		regPage.setEmail("priya.kochar@capgemini.com");
		regPage.setPhone("2123546556");
		regPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid Mobile Number'$")
	public void display_alert_Invalid_Mobile_Number() throws Throwable {
		String expErrMsg = "Please enter valid Contact no.";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}


}
