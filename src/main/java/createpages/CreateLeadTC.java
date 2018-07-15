package createpages;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.ClickingLeadlink;

public class CreateLeadTC extends PreAndPost{

	@BeforeTest 
	public void setValue()
	{
		testCaseName= "Create Lead";
		testDesc = "Creating a new lead";
		nodeName ="Lead";
		author ="Ambika";
		category = "Regression";
		excelfilename ="CreateLead";
	}
		
	@Test(dataProvider="dp")
	public void createLead(String Cname,String fName,String lName
			){		
		
		new ClickingLeadlink(driver, test)
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(Cname)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLead().verifyPartialText(fName);
		
		
	}

}




