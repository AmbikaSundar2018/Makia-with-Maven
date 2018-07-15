package leaf.leads;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class CreateLead1 extends PreAndPost{

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
	public void createLead(String cName,String fName,String lName,
			String email,String phone){		
		click(locateElement("link", "Leads"));		
		click(locateElement("link", "Create Lead"));		
		type(locateElement("id", "createLeadForm_companyName"), cName);		
		type(locateElement("id", "createLeadForm_firstName"), fName);		
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phone);
		click(locateElement("class", "smallSubmit"));				
	}
	
		
	}
	
	
	
	





