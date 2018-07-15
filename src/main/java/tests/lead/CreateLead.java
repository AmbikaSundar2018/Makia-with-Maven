package tests.lead;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataReader.ReadExcel;
import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@Test(dataProvider="TST")
	public void createLead(String cName,String fName,String lName,
			String email,String phone){		
		click(locateElement("link", "Leads"));		
		click(locateElement("link", "Create Lead"));		
		type(locateElement("id", "createLeadForm_companyName"), cName);		
		type(locateElement("id", "createLeadForm_firstName"), fName);		
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "");
		click(locateElement("class", "smallSubmit"));				
	}
	@DataProvider(name="TST")
	public String[][] getData() throws IOException {
		
		ReadExcel excel = new ReadExcel();
		String[][] data = excel.readExcel(excelfilename);
			
		return data;
		
	
	
}
}




