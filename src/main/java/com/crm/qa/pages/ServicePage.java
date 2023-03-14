package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ServicePage extends TestBase {

	@FindBy(xpath = "(//table[@style='text-align: left; width: 925px;']//child::tbody)[1]/tr")
	public List<WebElement> firstTable;

	@FindBy(xpath = "//ul[@class='button']/li")
	List<WebElement> paraBankNavLogo;

	@FindBy(linkText = "https://parabank.parasoft.com/parabank/services/bank?_wadl&type=xml")
	WebElement linkWADL;

	@FindBy(className = "button")
	WebElement loginBtn;

	@FindBy(linkText = "Register")
	WebElement register;

	// Constructor //
	public ServicePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions //

	public void openWADLLink() {
		linkWADL.click();
	}

	public boolean verifyNavLogo() {
		boolean flag = false;
		for (int i = 1; i <= paraBankNavLogo.size(); i++) {
			String text = driver.findElement(By.xpath("//ul[@class='button']/li[" + i + "]")).getText();
			if (text.equalsIgnoreCase("home")) {
				flag = true;
			}

		}
		return flag;
	}

	

}
