package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public void getExplicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);	
		wait.until(ExpectedConditions.elementToBeClickable(element));			
	}
	
	public void getExplicitWait(WebDriver driver, By xpath) {
		WebDriverWait wait = new WebDriverWait(driver,10);	
		wait.until(ExpectedConditions.elementToBeClickable(xpath));			
	}

}
