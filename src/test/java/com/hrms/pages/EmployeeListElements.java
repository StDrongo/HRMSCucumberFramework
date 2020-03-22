package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListElements {
	
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='middleName']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement save;
	
	@FindBy(linkText = "Personal Details")
	public WebElement personalDetails;
	
	@FindBy(css = "div:nth-child(3) div.box.pimPane:nth-child(1) div:nth-child(1) div:nth-child(1) > h1:nth-child(1)")
	public WebElement emloyeesName;
	
	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
		
	public EmployeeListElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}	
	
