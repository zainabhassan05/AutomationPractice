package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartFunctionPage {
	public CartFunctionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@title='Proceed to checkout']") 
	private WebElement proceedToCheckOut;
	
	@FindBy(xpath="(//*[@title='Proceed to checkout'])[2]") 
	private WebElement summaryProceedToCheckOut;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement addressProceedToCheckOut;	
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement shippingProceedToCheckOut;
	
	@FindBy(xpath="//input[@name='cgv']")
	private WebElement agreeTermCheckBox;
	
	public WebElement getProceedToCheckOut() {
		return proceedToCheckOut;
	}
		
	public WebElement getSummaryProceedToCheckOut() {
		return summaryProceedToCheckOut;
	}

	public WebElement getAddressProceedToCheckOut() {
		return addressProceedToCheckOut;
	}

	public WebElement getShippingProceedToCheckOut() {
		return shippingProceedToCheckOut;
	}

	public WebElement getAgreeTermCheckBox() {
		return agreeTermCheckBox;
	}


}
