package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AdminPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ServicePage;
import com.crm.qa.util.TestUtil;

public class AdminPageTest  extends TestBase{
	
	LoginPage loginPage;
	ServicePage servicePage;
	AdminPage adminPage;
	String sheetName= "Admin";
	
	public AdminPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		adminPage = new AdminPage();
		adminPage= loginPage.clickAdminLink();
		
	}
	
	@DataProvider
	public Object[][] getParaSoftTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test
	@Ignore
	public void verifyTitleTest() {
		String adminPageTitle = driver.getTitle();
		Assert.assertEquals(adminPageTitle, "ParaBank | Administration","The test failed due to wrong page title");
		
	}
	@Test
	@Ignore
	public void submitFormWithoutDetailsTest() {
		adminPage.selectJDBOption();
		adminPage.emptySoapEnpointValue();
		adminPage.emptyRestEnpointValue();
		adminPage.emptyEnpointValue();
		adminPage.emptyInitBalanceValue();
		adminPage.emptyMinBalanceValue();
		adminPage.selectLoanProviderValue("Web Service");
		adminPage.selectLoanProcessorValue("Down Payment");
		adminPage.emptyThresholdValue();
		adminPage.clickSubmit();
		
	}
	
	@Test(dataProvider= "getParaSoftTestData" )
	//@Ignore
	public void submitFormTest(String soap, String rest, String end, String initBal, String minBal, String lProvider, String lProcessor, String thresh) {
		adminPage.selectJDBOption();
		adminPage.enterSoapEnpointValue(soap);
		adminPage.enterRestEnpointValue(rest);
		adminPage.enterEnpointValue(end);
		adminPage.emptyInitBalanceValue();
		
		adminPage.enterInitBalanceValue(initBal);
		adminPage.emptyMinBalanceValue();
		adminPage.enterMinBalanceValue(minBal);
		adminPage.selectLoanProviderValue(lProvider);
		adminPage.selectLoanProcessorValue(lProcessor);
		adminPage.emptyThresholdValue();
		adminPage.enterThresholdValue(thresh);
		adminPage.clickSubmit();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
