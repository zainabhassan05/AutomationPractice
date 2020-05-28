package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;
import com.generic.code.CartFunction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class SanityTest {

	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		driver = BaseLogin.getLogin();
		DressSelection.getDress(driver);
		CartFunction.addToCard(driver);
		Payment.getPayment(driver);
		driver.quit();
	}

}
