package duplicatePages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class DuplicateLeadsTC extends PreAndPost {

	@BeforeTest 
	public void setValue()
	{
		testCaseName= "Duplicate Lead";
		testDesc = "Duplicate a new lead";
		nodeName ="Duplicate Lead";
		author ="Ambika S";
		category = "Sanity";
		excelfilename ="DuplicateLead";
	}
	
	@Test(dataProvider="dp")
	public void DeleteLead(String Fname,String Cname) throws InterruptedException {
		
		new MyhomePageFind(driver, test)
		.clickLeads()//Clicking Leads in my home page
		.clickFindLeads()
		.typeFirstName(Fname)
		.clickFL()
		.clickFirstLead().verifyPartialText(Fname)
		.clickDuplicate()
		.typeCompanyName(Cname)
		.clickbutton();

	}

	}

	

