//package com.hrms.steps;
//
//import org.junit.Assert;
//
//import com.hrms.pages.DashboardPageElements;
//import com.hrms.pages.ReportPageElements;
//import com.hrms.utils.CommonMethods;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ReportSearchSteps extends CommonMethods{
//	
//	ReportPageElements report;
//	
//	@Given("I navigated to the Reports Page")
//	public void i_navigated_to_the_Reports_Page() {
//	    DashboardPageElements dashboard = new DashboardPageElements();
//	    dashboard.navigateToSearchReport();
//	}
//
//	@When("I enter invalid report")
//	public void i_enter_invalid_report() {
//	    report = new ReportPageElements();
//	    report.search.sendKeys("qwerq");
//	}
//
//	@When("I click search button")
//	public void i_click_search_button() {
//	    report = new ReportPageElements();
//	    click(report.clickSearch);
//	}
//
//	@Then("I see no record found message")
//	public void i_see_no_record_found_message() {
//		report = new ReportPageElements();
//	    report.noRecord.isDisplayed();
//	}
//
//	@When("I enter valid report")
//	public void i_enter_valid_report() {
//	    report = new ReportPageElements();
//	    report.search.sendKeys("PIM Sample Report");
//	}
//
//	@Then("I see the search report is displayed")
//	public void i_see_the_search_report_is_displayed() {
//	    report = new ReportPageElements();
//	    report.founded.isDisplayed();
//	}
//
//}
