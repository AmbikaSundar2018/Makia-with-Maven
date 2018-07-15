package leaf.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class DuplicateLead extends PreAndPost {

	@BeforeTest 
	public void setValue()
	{
		testCaseName= "Duplicate Lead";
		testDesc = "Creating a Duplicate lead";
		nodeName ="Leadnew";
		author ="Ambika R";
		category = "Funct";
		excelfilename ="DuplicateLead";
	}
	
	@Test(dataProvider ="dp")
	public void duplicateLead(String fname,String cName) throws InterruptedException {
		
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));		
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name", "emailAddress"), "gopinath@testleaf.com");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String leadName = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));		
		click(locateElement("link", "Duplicate Lead"));
		type(locateElement("id", "createLeadForm_firstName"), fname);
		click(locateElement("class", "smallSubmit"));		
		String leadID = getText(locateElement("id", "viewLead_companyName_sp")).replaceAll("\\D", "");
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), leadID);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		verifyExactText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"), "Gopi");
		
		
		
	}
}
