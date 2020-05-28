package com.generic.code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.page.object.model.PaymentPage;
import com.page.object.model.ProductPagexxx;
import com.util.Highlighter;
import com.util.ScreenShot;

public class Payment {
	
	public static WebDriver getPayment(WebDriver driver) throws Throwable {
		
		PaymentPage pf = new PaymentPage(driver);
		new Highlighter().getcolor(driver, pf.getPaymentModule().get(0), "red");
		pf.getPaymentModule().get(0).click();
		new Highlighter().getcolor(driver, pf.getConfirmationBtn(), "red");
		pf.getConfirmationBtn().click();
		System.out.println(pf.getConfirmationMsg().getText());
		ScreenShot.getScreenShot(driver, "Order Receipt");
		return driver;
	}
}
