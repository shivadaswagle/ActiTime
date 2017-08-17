package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class LoginPage extends BasePage{

	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,' invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un){
		unTB.sendKeys(un);
	}

	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin(){
		sleep(1);
		loginBTN.click();
	}
	
	public void verifyErrMsgIsDisplayed(){
		sleep(2);
		Assert.assertTrue(errMsg.isDisplayed());
		
	}
}
