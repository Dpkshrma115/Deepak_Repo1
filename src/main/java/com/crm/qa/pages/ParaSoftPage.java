package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ParaSoftPage extends TestBase {

	@FindBy(xpath = "(//div[@role='button'])[2]")
	WebElement helpBot;

	@FindBy(xpath = "(//div[@role=\"button\"])[1]")
	WebElement botCross;

	@FindBy(xpath = "//a[@title='Solutions']")
	WebElement solutionList;

	@FindBy(xpath = "//li[@id='menu-item-21413']//child::ul[@class='sub-menu']/li")
	public List<WebElement> solutionByTestingNeedList;

	@FindBy(xpath = "//button[@type='button']//parent::div[contains(@class,'iframe-wrapper ub-emb-visible')]")
	List<WebElement> popUp;

	//////////////// Constructor /////////////////
	public ParaSoftPage() {
		PageFactory.initElements(driver, this);
	}

/////////////////  Actions ////////////////////
	public void popUPClose() {
		if (popUp.size() > 0) {
			driver.findElement(
					By.xpath("//button[@type='button']//parent::div[contains(@class,'iframe-wrapper ub-emb-visible')]"))
					.click();
		}
	}

	public int solutionListSize() {

		int listSize = solutionByTestingNeedList.size();
		return listSize;
	}

	public boolean testingNeedList() {
		boolean flag = false;
		for (int i = 0; i < solutionListSize(); i++) {
			String list = solutionByTestingNeedList.get(i).getText();
			if (list.equalsIgnoreCase("Reporting & Analytics")) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void moveToSolutionList() {
		Actions action = new Actions(driver);
		action.moveToElement(solutionList);

	}
	public void closeBot() {
		explicitWait(helpBot);
		helpBot.click();
		botCross.click();
	}

}
