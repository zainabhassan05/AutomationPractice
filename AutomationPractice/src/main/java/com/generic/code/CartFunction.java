package com.generic.code;

import org.openqa.selenium.WebDriver;

import com.page.object.model.CartFunctionPage;
import com.page.object.model.ProductPagexxx;
import com.util.Highlighter;
import com.util.Wait;

public class CartFunction {
	
	public static WebDriver addToCard(WebDriver driver) {
		//Add to cart
		CartFunctionPage pf = new CartFunctionPage(driver);		
		new Wait().getExplicitWait(driver, pf.getProceedToCheckOut());
		pf.getProceedToCheckOut().click();
		new Wait().getExplicitWait(driver, pf.getSummaryProceedToCheckOut());
		new Highlighter().getcolor(driver, pf.getSummaryProceedToCheckOut(), "red");
		pf.getSummaryProceedToCheckOut().click(); // Summary
		new Wait().getExplicitWait(driver, pf.getAddressProceedToCheckOut());	
		new Highlighter().getcolor(driver, pf.getAddressProceedToCheckOut(), "red");
		pf.getAddressProceedToCheckOut().click(); // Address
		new Highlighter().getcolor(driver, pf.getAgreeTermCheckBox(), "yellow");
		pf.getAgreeTermCheckBox().click(); // Agree term and condition
		new Highlighter().getcolor(driver, pf.getShippingProceedToCheckOut(), "red");
		pf.getShippingProceedToCheckOut().click(); // Shipping

		return driver;

	}

}
