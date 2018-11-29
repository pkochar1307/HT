package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageFactory {

WebDriver driver;

	
	@FindBy(name="txtFN")
	@CacheLookup //First time it looks for and den store in cache so dat it can be searched later
	WebElement firstNameTxt;

	@FindBy(name="txtLN")
	@CacheLookup //First time it looks for and den store in cache so dat it can be searched later
	WebElement lastNameTxt;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement loginBtn;
	
	public  RegistrationPageFactory(){
		super();
	}
	
	public RegistrationPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setTxtFN(String name) {
		firstNameTxt.sendKeys(name);
	}
		
	public void setLastName(String name) {
		lastNameTxt.sendKeys(name);
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setPhone(String pno) {
		phone.sendKeys(pno);
	}
	
	public void clickLoginButton() {
		loginBtn.click();
	}
	
	
	
}
