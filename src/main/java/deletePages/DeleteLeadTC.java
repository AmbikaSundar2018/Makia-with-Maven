package deletePages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class DeleteLeadTC extends PreAndPost {

	@BeforeTest 
	public void setValue()
	{
		testCaseName= "Delete Lead";
		testDesc = "Deleting a new lead";
		nodeName ="Delete Lead";
		author ="Ambika S";
		category = "Regression";
		excelfilename ="DeleteLead";
	}
	
	@Test(dataProvider="dp")
	public void DeleteLead(String Fname) throws InterruptedException {
		
		new MyhomePageFind(driver, test)
		.clickLeads()//Clicking Leads in my home page
		.clickFindLeads()
		.typeFirstName(Fname)
		.clickFL()
		.clickFirstLead().verifyPartialText(Fname)
		.clickDelete();

	}

	}

	

