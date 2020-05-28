package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[@class='payment_module']")
	private List<WebElement> paymentModule;
	
	@FindBy(xpath="//*[@class='button btn btn-default button-medium']")
	private WebElement confirmationBtn;
	
	@FindBy(xpath="//*[@class='box']")
	private WebElement confirmationMsg;

	public List<WebElement> getPaymentModule() {
		return paymentModule;
	}

	public WebElement getConfirmationBtn() {
		return confirmationBtn;
	}

	public WebElement getConfirmationMsg() {
		return confirmationMsg;
	}

}
