package com.generic.code;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.DressSelectionPage;
import com.page.object.model.ProductPagexxx;
import com.util.Highlighter;
import com.util.ScreenShot;
import com.util.Wait;

public class DressSelection {	
		public static WebDriver getDress(WebDriver driver) throws Throwable{
				
			DressSelectionPage pf = new DressSelectionPage(driver);
			pf.getDresses().click();
			int totalNo = pf.getDressesCount().size();
			System.out.println("Total Displayed= "+totalNo);		
					
		//	list.foreach(e->e0{ }  // this loop is 100 times faster or fastest loop
			pf.getAllDressName().forEach(name->{
				System.out.println("Found Dress Name: "+name.getText());
			});
			
			pf.getAddDressPrice().forEach(price->{
				System.out.println("Found Price: "+price.getText());
			});
			
			// Click 5th dress
			new Highlighter().getcolor(driver, pf.getAllDressName().get(4), "red");
			pf.getAllDressName().get(4).click();
			//Add quantity
			
			pf.getQuantityInputBox().clear();
			pf.getQuantityInputBox().sendKeys("4");
			

			//Select Size		
			Select select = new Select(pf.getDressSizeDropDown());
		
			select.selectByIndex(1);
			select.selectByValue("2");
			select.selectByVisibleText("M");
			ScreenShot.getScreenShot(driver, "Dress Selection");
			pf.getAddCartBtn().click();
			return driver;
	}
}
