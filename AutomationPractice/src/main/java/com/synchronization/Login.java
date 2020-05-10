package com.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Wait;


public class Login {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		
		WebElement signInLink = driver.findElement(By.xpath("//a[@class='login']"));
		signInLink.click();
		
		new Wait().getExplicitWait(driver, By.xpath("//*[@id='email']"));	
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("sarowerny@gmail.com");
	
		new Wait().getExplicitWait(driver, driver.findElement(By.xpath("//input[@id='passwd']")));
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='passwd']"));
		new Wait().getExplicitWait(driver, passWord);  // use either line 39 or this one
		passWord.sendKeys("student");
		
		WebElement signInBtn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	//	signInBtn.click();

		System.out.println(driver.getTitle());
	}

}
