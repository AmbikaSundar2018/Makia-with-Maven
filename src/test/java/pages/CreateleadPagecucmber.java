package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import createpages.ViewleadPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateleadPagecucmber extends WebDriverServiceImpl{
  
	@FindBy(id = "createLeadForm_companyName")
	WebElement  elCompany;
	@FindBy(id = "createLeadForm_firstName")
	WebElement  eleFName;
	@FindBy(id = "createLeadForm_lastName")
	WebElement  eleLName;
	
	@FindBy(className = "smallSubmit")
	WebElement  eleSubmit;

	public CreateleadPagecucmber(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}	
	@And("Enter the company Name as (.*)")
	public CreateleadPagecucmber typeCompanyName(String Cname) {
		type(elCompany,Cname);
		return this;
	}
	@And("Enter the first Name as (.*)")
	public CreateleadPagecucmber typeFirstName(String Fname) {
		type(eleFName,Fname);
		return this;

	}
	@And("Enter the last Name as (.*)")
	public CreateleadPagecucmber typeLastName(String Lname) {
		type(eleLName,Lname);
		return this;

	}
	@When("click on Create lead button")
			public ViewleadPage clickCreateLead() {
			
			click(eleSubmit);
			
			return new ViewleadPage(driver, test);
		}
		
					
	}
	

