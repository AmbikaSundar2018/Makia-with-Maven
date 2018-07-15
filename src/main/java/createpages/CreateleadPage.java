package createpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;
import pages.ViewleadPage1;

public class CreateleadPage extends WebDriverServiceImpl{
  
	@FindBy(id = "createLeadForm_companyName")
	WebElement  elCompany;
	@FindBy(id = "createLeadForm_firstName")
	WebElement  eleFName;
	@FindBy(id = "createLeadForm_lastName")
	WebElement  eleLName;
	
	@FindBy(className = "smallSubmit")
	WebElement  eleSubmit;
	
	public CreateleadPage(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}	
	public CreateleadPage typeCompanyName(String Cname) {
		type(elCompany,Cname);
		return this;
	}
	public CreateleadPage typeFirstName(String Fname) {
		type(eleFName,Fname);
		return this;

	}
	public CreateleadPage typeLastName(String Lname) {
		type(eleLName,Lname);
		return this;

	}
			public ViewleadPage1 clickCreateLead() {
			
			click(eleSubmit);
			
			return new ViewleadPage1(driver, test);
		}
		
					
	}
	

