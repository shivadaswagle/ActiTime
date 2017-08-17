package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage{
	
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement helpMenu;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTIMEMenu;
	
	@FindBy(css=".productVersion")
	private WebElement productVersion;

	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeBTN;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickHelpMenu(){
		sleep(2);
		helpMenu.click();
	}
	
	public void clicAboutActiTIMEMenu(){
		sleep(1);
		aboutActiTIMEMenu.click();
	}
	
	public void verifyProductVersion(String expected){
		String actual=productVersion.getText();
		Assert.assertEquals(actual, expected);
	}
	
	public void clickCloseButton(){
		sleep(1);
		closeBTN.click();
	}
	
	public void clickLogout(){
		sleep(1);
		logoutLink.click();
	}
}
