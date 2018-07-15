package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lib.selenium.WebDriverServiceImpl;

public class CreateleadPage1 extends WebDriverServiceImpl{
  
	@FindBy(id = "createLeadForm_companyName")
	WebElement  elCompany;
	@FindBy(id = "createLeadForm_firstName")
	WebElement  eleFName;
	@FindBy(id = "createLeadForm_lastName")
	WebElement  eleLName;
	
	@FindBy(className = "smallSubmit")
	WebElement  eleSubmit;
	
	public CreateleadPage1(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
			}	
	@Given ("Enter the company Name as (.*)")
	public CreateleadPage1 typeCompanyName(String Cname) {
		type(elCompany,Cname);
		return this;
	}
	
	@And ("Enter the first Name as (.*)")
	
	public CreateleadPage1 typeFirstName(String Fname) {
		type(eleFName,Fname);
		return this;

	}
	
	@And ("Enter the last Name as (.*)")
	
	public CreateleadPage1 typeLastName(String Lname) {
		type(eleLName,Lname);
		return this;

	}
			public ViewleadPage1 clickCreateLead() {
			
			click(eleSubmit);
			
			return new ViewleadPage1(driver, test);
		}
		
					
	}
	

