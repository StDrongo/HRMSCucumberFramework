package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ReportPageElements {
	
	@FindBy(id = "search_search")
	public WebElement search;
	
	@FindBy(xpath = "//input[@name='_search']")
	public WebElement clickSearch;
	
	@FindBy(xpath = "//td[contains(text(),'No Records Found')]")
	public WebElement noRecord;
	
	@FindBy(xpath = "//td[contains(text(),'PIM Sample Report')]")
	public WebElement founded;
	
	public ReportPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	

}
