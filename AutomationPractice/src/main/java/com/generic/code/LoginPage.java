package com.synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {  //Page Object Model -- Pagefactory	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signInLink;
	@FindBy(xpath="//*[@id='email']")
	private WebElement userName;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement passWord;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signInBtn;
	
	public WebElement getSignInLink() {
		return signInLink;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	
}
