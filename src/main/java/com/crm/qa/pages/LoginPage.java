package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR:
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(className = "button")
	WebElement loginBtn;

	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(className = "logo")
	WebElement paraBankLogo;

	@FindBy(className = "visit")
	WebElement parasoftLink;

	@FindBy(xpath = "//ul[@class='leftmenu']/li")
	public
	List<WebElement> menuList;
	
	@FindBy(xpath = "//ul[@class='leftmenu']/li/a[text()='Services']")
	
	WebElement servicesLink;
	
	
	@FindBy(linkText = "Admin Page")
	WebElement adminLink;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateParaImage() {
		return paraBankLogo.isDisplayed();
	}

	/*public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		// loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

		return new HomePage();
	}
*/
	public void clickRegisterButton() {
		register.click();

	}

	public ParaSoftPage clickParaSoftLink() {
		parasoftLink.click();
		return new ParaSoftPage();
	}

	public boolean findElementInList() {
		boolean flag = false;
		int listSize = menuList.size();
		
		for (int i = 0; i < listSize; i++) {
			String element = menuList.get(i).getText();
			if (element.equalsIgnoreCase("Services")) {
				flag = true;
			}

		}
		return flag;
	}
	
	
		
	public ServicePage serviceLinkClick() {
		servicesLink.click();
		return new ServicePage();
		
	}
	public AdminPage clickAdminLink(){
		adminLink.click();
		return new AdminPage();
		
	}
}
