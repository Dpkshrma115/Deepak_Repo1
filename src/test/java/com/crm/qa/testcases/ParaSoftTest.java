/*package com.crm.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ParaSoftPage;


public class ParaSoftTest extends TestBase {
	LoginPage loginPage;
	ParaSoftPage parasoft;
	
	public ParaSoftTest() {
		super();
	}
	
	@BeforeMethod
	public void testSetupMethod() throws InterruptedException {
		
		initialization();
		Thread.sleep(5000);
		loginPage = new LoginPage();
		parasoft = new ParaSoftPage();
		
	parasoft =	loginPage.clickParaSoftLink();
		parasoft.closeBot();
		parasoft.popUPClose();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Aftermethod");
	}
	@Test
	//@Ignore
	public void toCheckOptionPresentTest() {
		
		 boolean flag=parasoft.testingNeedList();
		Assert.assertTrue(flag);
		System.out.println("The option is present");
	}
	
	@Test
	//@Ignore
	public void printSolutionByTestingNeedListTest() {
		parasoft.moveToSolutionList();
		WebElement optionList= driver.findElement(By.xpath("(//li[@id='menu-item-21413']//child::ul[@class='sub-menu']/li)[1]")) ;
		System.out.println("List name"+ optionList.getText());
//		parasoft.solutionTestingNeedMove();
//		System.out.println("The size of the list : "+ parasoft.solutionListSize());
//		for (int i = 0; i < parasoft.solutionListSize(); i++) {
//			String list = parasoft.solutionByTestingNeedList.get(i).getText();
//			System.out.println(list);
		}
	}*/
	
	
	
	


