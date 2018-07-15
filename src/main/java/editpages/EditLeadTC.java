package editpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLeadTC extends PreAndPost {

	@BeforeTest 
	public void setValue()
	{
		testCaseName= "Edit Lead";
		testDesc = "Editing a new lead";
		nodeName ="Edit Lead";
		author ="Ambika S";
		category = "Smoke";
		excelfilename ="EditLead";
	}
	
	@Test(dataProvider="dp")
	public void editLead(String Fname, String Cname) throws InterruptedException {
		
		new MyhomePageFind(driver, test)
		.clickLeads()//Clicking Leads in my home page
		.clickFindLeads()
		.typeFirstName(Fname)
		.clickFL()
		.clickFirstLead().verifyPartialText(Fname)
		.clickEdit()
		.typeCompanyName(Cname)
		.clickbutton();
	
				
	}

	}

	

