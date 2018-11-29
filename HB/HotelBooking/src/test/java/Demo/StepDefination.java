package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.cg.model.LoginPageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination {
	
	LoginPageFactory loginPage;
	WebDriver driver;
	
	public StepDefination() {
		loginPage=new LoginPageFactory(driver);
	}
	
	@Given("^User is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
	   
	     driver= new FirefoxDriver();
		driver.get("D:\\Practice\\SpringWebServices\\HotelBookingDemo\\login.html");
		
		loginPage=new LoginPageFactory(driver);
		
		System.out.println("page loaded in browser");
	}

	@When("^Username Password is blank$")
	public void username_Password_is_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		/*WebElement userNameTxt=driver.findElement(By.name("userName"));
	  userNameTxt.sendKeys("");
	  
	  WebElement loginBtn=driver.findElement(By.className("btn"));
	  loginBtn.click();*/
		
		loginPage.setUserName("");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
		
	}

	@Then("^Dispay Error Message 'Please enter Username'$")
	public void dispay_Error_Message_Please_enter_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement divEle=driver.findElement(By.id("userErrMsg"));
		//String actualErrorMessage= divEle.getText();
		String actualErrorMessage= loginPage.getUserNameError();
		String expErrorMsg="* Please enter userName.";
		Assert.assertEquals(expErrorMsg,actualErrorMessage);
		driver.close();
	    
	}
	
	@When("^Username is given but Password is blank$")
	public void username_is_given_but_Password_is_blank() throws Throwable {
		   // Write code here that turns the phrase above into concrete actions
		  /*WebElement userNameTxt=driver.findElement(By.name("userName"));
		  WebElement pwdTxt=driver.findElement(By.name("userPwd"));
		  WebElement loginBtn=driver.findElement(By.className("btn"));
		  userNameTxt.sendKeys("Priya");
		  pwdTxt.sendKeys("");
		  loginBtn.click();*/
		
		loginPage.setUserName("Priya");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
		
		  
	}

	@Then("^Dispay Error Message 'Please enter Password'$")
	public void dispay_Error_Message_Please_enter_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement divEle=driver.findElement(By.id("pwdErrMsg"));
		//String actualErrorMessage= divEle.getText();
		String actualErrorMessage= loginPage.getpasswordError();
		
		String expErrorMsg="* Please enter password.";
		Assert.assertEquals(expErrorMsg,actualErrorMessage);
		driver.close();
	    
	}
	
	@When("^Username and Password are not correct$")
	public void username_and_Password_are_not_correct() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*WebElement userNameTxt=driver.findElement(By.name("userName"));
		  WebElement pwdTxt=driver.findElement(By.name("userPwd"));
		  WebElement loginBtn=driver.findElement(By.className("btn"));
		  userNameTxt.sendKeys("Priya22");
		  pwdTxt.sendKeys("Priya12");
		  loginBtn.click();*/
		  
		  loginPage.setUserName("Priya22");
			loginPage.setPassword("Priya12");
			loginPage.clickLoginButton();
			
	}

	@Then("^Dispay Error Message 'Invalid login'$")
	public void dispay_Error_Message_Invalid_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String expErrorMsg= "Invalid login! Please try again!";
		String actErrMsg=driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrorMsg);
		driver.switchTo().alert().accept();
		
	    
	}
	
	@When("^Username and Password are  correct$")
	public void username_and_Password_are_correct() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*WebElement userNameTxt=driver.findElement(By.name("userName"));
		  WebElement pwdTxt=driver.findElement(By.name("userPwd"));
		  WebElement loginBtn=driver.findElement(By.className("btn"));
		  userNameTxt.sendKeys("Priya");
		  pwdTxt.sendKeys("Priya");
		  loginBtn.click();*/
		  
		loginPage.setUserName("Priya");
		loginPage.setPassword("Priya");
		loginPage.clickLoginButton();
		
	}

	@Then("^Dispay Message 'Valid Login'$")
	public void dispay_Error_Message_Valid_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("D:\\Practice\\SpringWebServices\\HotelBookingDemo\\hotelbooking.html");
		driver.close();
	}
	
	/*@Given("^User is on Registration Page$")
	public void user_is_on_Registration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver= new FirefoxDriver();
			driver.get("D:\\Practice\\SpringWebServices\\HotelBookingDemo\\hotelbooking.html");
			System.out.println("Getting loaded: Registration Page");
	}

	@When("^FirstName is blank$")
	public void firstname_is_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement firstName=driver.findElement(By.name("txtFN"));
		  firstName.sendKeys("");
		  
		  WebElement loginBtn=driver.findElement(By.className("btn"));
		  loginBtn.click();
		  
	}

	@Then("^Dispay Error Message 'Please enter FirstName'$")
	public void dispay_Error_Message_Please_enter_FirstName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement divEle=driver.findElement(By.id("userErrMsg"));
		String actualErrorMessage= divEle.getText();
		String expErrorMsg="* Please enter userName.";
		Assert.assertEquals(expErrorMsg,actualErrorMessage);
		driver.close();
	    
	}

	@When("^LastName is blank$")
	public void lastname_is_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement firstName=driver.findElement(By.name("txtFN"));
		  firstName.sendKeys("");
		  
		  WebElement loginBtn=driver.findElement(By.className("btn"));
		  loginBtn.click();
		  
	}

	@Then("^Dispay Error Message 'Please enter LastName'$")
	public void dispay_Error_Message_Please_enter_LastName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	*/
	






}
