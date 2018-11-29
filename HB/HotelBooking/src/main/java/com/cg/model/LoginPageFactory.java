package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup //First time it looks for and den store in cache so dat it can be searched later
	WebElement userNameTxt;
	
	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pwdTxt;
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	WebElement userErrorMsg;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	WebElement pwdErrorMsg;
	
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String name) {
		userNameTxt.sendKeys(name);
	}
		
	public void setPassword(String pwd) {
			pwdTxt.sendKeys(pwd);
		}
			
	public void clickLoginButton() {
		loginBtn.click();
	}	
	
	public String getUserNameError() {
		String error=userErrorMsg.getText();
		return error;
	}
	
	public String getpasswordError() {
		String error=pwdErrorMsg.getText();
		return error;
	}
	
		
	
}
