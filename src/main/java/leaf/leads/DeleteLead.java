package leaf.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class DeleteLead extends PreAndPost {

	@BeforeTest 
	public void setValue()
	{
		testCaseName= "Delete Lead";
		testDesc = "Deleting a new lead";
		nodeName ="Leadnew";
		author ="Mack";
		category = "Sanity";
		excelfilename ="DeleteLead";
	}
	@Test(dataProvider="dp")
	public void deleteLead(String fName) throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));	
		Thread.sleep(5000);
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), fName);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
     String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		click(locateElement("link", "Delete"));
		
	}
}
