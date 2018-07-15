package editpages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class EditPage extends WebDriverServiceImpl{


	@FindBy(id = "updateLeadForm_companyName")
	WebElement  elCompany;

	@FindBy(className = "smallSubmit")
	WebElement  eleSubmit;

	public EditPage(EventFiringWebDriver driver,ExtentTest test) {

		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);

	}	
	public EditPage typeCompanyName(String Cname) {
		type(elCompany,Cname);
		return this;
	}


	public ViewleadPage clickbutton() {

		click(eleSubmit);

		return new ViewleadPage(driver, test);
	}


}