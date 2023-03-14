package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	//HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ParaBank | Error");
	}

	@Test(priority = 2)
	public void LogoImageTest() {
		boolean flag = loginPage.validateParaImage();
		Assert.assertTrue(flag);
	}

	/*@Test(priority = 3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}*/

	@Test
	public void elementPresenceTest() {
		boolean flag = loginPage.findElementInList();
		Assert.assertTrue(flag);
		System.out.println("The element is present");
	}

	@Test
	public void elementNamePrintTest() {
		int listSize = loginPage.menuList.size();
		System.out.println("List size: " + listSize);

		for (int i = 0; i < listSize; i++) {
			String element = loginPage.menuList.get(i).getText();
			System.out.println(element);

		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
