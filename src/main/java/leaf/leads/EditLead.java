package leaf.leads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost {

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
	public void editLead(String fname,String cName) throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));				
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), fname);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Edit"));	
		/*clear(locateElement("id", "updateLeadForm_companyName"));*/
		type(locateElement("id", "updateLeadForm_companyName"), cName);
		click(locateElement("class", "smallSubmit"));
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), leadID);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), cName);
		
				
	}

	}

	

