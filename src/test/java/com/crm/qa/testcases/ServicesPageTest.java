package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ServicePage;

public class ServicesPageTest extends TestBase {
	LoginPage loginPage;
	ServicePage servicePage;
	
	public ServicesPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		servicePage= new ServicePage();
		servicePage =loginPage.serviceLinkClick();
		
	}
	
	@Test
	public void firstTabletextTest() {
		int rowNum = servicePage.firstTable.size();
		System.out.println(rowNum);
	
		int colNum = driver.findElements(By.xpath("(//table[@style='text-align: left; width: 925px;']//child::tbody)[1]/tr[1]/td")).size();
		System.out.println(colNum);
		for (int i=1; i<= rowNum; i++) {
			for (int j=1; j<= colNum; j++) {
			String text = driver.findElement(By.xpath("(//table[@style='text-align: left; width: 925px;']//child::tbody)[1]/tr["+i+"]/td["+j+"]")).getText();
			System.out.println(text);
		}
			
		}
		
	}
	
	@Test
	public void openWADLPageTest() {
		servicePage.openWADLLink();
	}
	
	@Test
	public void verifyHomeLogoTest() {
		boolean flag =servicePage.verifyNavLogo();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
