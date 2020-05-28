package com.generic.code;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.Highlighter;
import com.util.ScreenShot;
import com.util.Wait;

public class BaseLogin {	
	
	protected static WebDriver driver;
	
	public static WebDriver getLogin() throws Throwable {		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		driver = new ChromeDriver();
		LoginPage login = new LoginPage(driver);
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.get(BaseConfig.getConfig("URL"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		new Highlighter().getcolor(driver, login.getSignInLink());
		ScreenShot.getScreenShot(driver, "Sign In");
		login.getSignInLink().click();
		System.out.println(driver.getTitle());
		
//		new Wait().getExplicitWait(driver, By.xpath("//*[@id='email']"));
	//	new Wait().getExplicitWait(driver, By.xpath(login.getUserName()));  //wrong
		new Wait().getExplicitWait(driver, login.getUserName());  // by
		
		new Highlighter().getcolor(driver, login.getUserName(), "red");
		login.getUserName().sendKeys(BaseConfig.getConfig("email"));

		new Highlighter().getcolor(driver, login.getPassWord(), "yello");		
		login.getPassWord().sendKeys(BaseConfig.getConfig("pass"));
				
		new Highlighter().getcolor(driver, login.getSignInBtn(), "Black");
		ScreenShot.getScreenShot(driver, "Login");
		login.getSignInBtn().click();
		System.out.println(driver.getTitle());	
		return driver;
	}

}
