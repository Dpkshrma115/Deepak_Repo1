package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{
	// WebElement
	
	@FindBy (id="customer.firstName")
	WebElement firstName;
	
	@FindBy (id="customer.lastName")
	WebElement lastName;
	
	@FindBy (id="customer.address.street")
	WebElement address;
	
	@FindBy (id="customer.address.city")
	WebElement city;
	
	@FindBy (name="customer.address.state")
	WebElement state;
	
	@FindBy (name="customer.address.zipCode")
	WebElement zipCode;
	
	@FindBy (name="customer.phoneNumber")
	WebElement phone;
	
	@FindBy (name="customer.ssn")
	WebElement ssn;
	
	
	@FindBy (name="customer.username")
	WebElement userName;
	
	@FindBy (name="customer.password")
	WebElement password;
	
	@FindBy (name="repeatedPassword")
	WebElement confirmPassword;

	
	@FindBy (className="button")
	WebElement registerButton;
	//constructor with page factory
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	
	public void fillSignUpForm() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		address.sendKeys(prop.getProperty("address"));
		city.sendKeys(prop.getProperty("city"));
		state.sendKeys(prop.getProperty("state"));
		zipCode.sendKeys(prop.getProperty("zipcode"));
		phone.sendKeys(prop.getProperty("phone"));
		ssn.sendKeys(prop.getProperty("ssn"));
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		confirmPassword.sendKeys(prop.getProperty("confirmPassword"));
	}
	
	
	public void clickSignUpButton() {
		registerButton.click();
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	

}
