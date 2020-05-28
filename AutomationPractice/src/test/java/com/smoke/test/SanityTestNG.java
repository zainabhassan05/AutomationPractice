package com.smoke.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.CartFunction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class SanityTestNG {
	static WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
		driver = BaseLogin.getLogin();
	}
	
	@Test
	public void sanity1() throws Throwable {
		DressSelection.getDress(driver);
	}
	
	@Test
	public void sanity2() {
		CartFunction.addToCard(driver);
	}
	@Test
	public void sanity3() throws Throwable {
		Payment.getPayment(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
