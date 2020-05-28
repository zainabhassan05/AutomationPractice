package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressSelectionPage {
	public DressSelectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//*[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath="//*[@class='left-block']")  // dress = 5
	private List<WebElement> dressesCount;	
	
	@FindBy(xpath="//*[@class='right-block']//*[@class='product-name']")	
	private List<WebElement> allDressName;
	
	@FindBy(xpath="//*[@class='right-block']//*[@class='price product-price']")
	private List<WebElement> addDressPrice;
	
	@FindBy(xpath="//*[@id='quantity_wanted']")
	private WebElement quantityInputBox;
	
	@FindBy(xpath="//*[@id='group_1']")
	private WebElement dressSizeDropDown;
	
	@FindBy(xpath="//*[@name='Submit']")
	private WebElement addCartBtn;
	
	
	public WebElement getDresses() {
		return dresses;
	}

	public List<WebElement> getDressesCount() {
		return dressesCount;
	}

	public List<WebElement> getAllDressName() {
		return allDressName;
	}

	public List<WebElement> getAddDressPrice() {
		return addDressPrice;
	}

	public WebElement getQuantityInputBox() {
		return quantityInputBox;
	}

	public WebElement getDressSizeDropDown() {
		return dressSizeDropDown;
	}

	public WebElement getAddCartBtn() {
		return addCartBtn;
	}

}
