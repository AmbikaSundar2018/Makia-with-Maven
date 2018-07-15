package pages;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class CreateLeadTC1 extends PreAndPost{

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




