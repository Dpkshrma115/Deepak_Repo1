package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AdminPage  extends TestBase{
	
	Select select;
	
	@FindBy (xpath="(//input[@class='input'])[6]")
	WebElement jdbcOption;
	

	@FindBy (xpath="(//input[@class='input'])[5]")
	WebElement jsonRestOption;
	

	@FindBy (xpath="(//input[@class='input'])[4]")
	WebElement jsonXMLOption;
	

	@FindBy (xpath="(//input[@class='input'])[3]")
	WebElement soapOption;
	
	@FindBy (id="soapEndpoint1")
	WebElement soapEndPoint;
	
	@FindBy (id="restEndpoint")
	WebElement restEndpoint;
	
	@FindBy (id="endpoint")
	WebElement endpoint;
	
	@FindBy (id="initialBalance")
	WebElement initialBalance;
	
	@FindBy (id="minimumBalance")
	WebElement minimumBalance;
	
	@FindBy (id="loanProvider")
	WebElement loanProvider;
	

	@FindBy (id="loanProcessor")
	WebElement loanProcessor;


	@FindBy (id="loanProcessorThreshold")
	WebElement loanProcessorThreshold;
	
	@FindBy (xpath= "(//input[@class='button'])[3]")
	WebElement submitButton;
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectJDBOption() {
		jdbcOption.click();
	}
	
	public void emptySoapEnpointValue() {
		soapEndPoint.clear();
		}
	
	public void enterSoapEnpointValue(String sepoint) {
		soapEndPoint.sendKeys(sepoint);
	}
	
	public void emptyRestEnpointValue() {
		restEndpoint.clear();
	}
	
	public void enterRestEnpointValue(String repoint) {
		restEndpoint.clear();
	}
	
	public void emptyEnpointValue() {
		endpoint.clear();
	}
	
	public void enterEnpointValue(String ePoint) {
		restEndpoint.sendKeys(ePoint);
	}
	
	public void emptyInitBalanceValue() {
		initialBalance.clear();
	
	}
	
	public void enterInitBalanceValue(String initBal) {
		initialBalance.sendKeys(initBal);
	
	}
	
	public void emptyMinBalanceValue() {
		minimumBalance.clear();
	
	}
	
	public void enterMinBalanceValue(String initBal) {
		minimumBalance.sendKeys(initBal);
	
	}
	
	public void selectLoanProviderValue(String provider) {
		select = new Select(loanProvider);
		select.selectByVisibleText(provider);
	
	}
	
	public void selectLoanProcessorValue(String processor) {
		select = new Select(loanProcessor);
		select.selectByVisibleText(processor);
	
	}
	public void emptyThresholdValue() {
		loanProcessorThreshold.clear();
	
	}
	
	public void enterThresholdValue(String percent) {
		loanProcessorThreshold.sendKeys(percent);
	
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	

	
	

}
