package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	LoginPage lp;
	SignUpPage signUpPage;

	public SignUpPageTest() {
		super();
	}

	@BeforeMethod
	public void testSetupMethod() throws InterruptedException {
		
		initialization();
		Thread.sleep(5000);
		lp= new LoginPage();
		signUpPage= new SignUpPage();
		lp.clickRegisterButton();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Aftermethod");
	}
	@Test
	public void registrationFormTest() {
		
	signUpPage.fillSignUpForm();
	signUpPage.clickSignUpButton();
	Assert.assertEquals(signUpPage.getTitle(), "ParaBank | About Us");
	}

}
