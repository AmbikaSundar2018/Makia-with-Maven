package duplicatePages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class Duplicatepage extends WebDriverServiceImpl{


	@FindBy(id = "createLeadForm_companyName")
	WebElement  elCompany;

	@FindBy(className = "smallSubmit")
	WebElement  eleSubmit;

	public Duplicatepage(EventFiringWebDriver driver,ExtentTest test) {

		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);

	}	
	public Duplicatepage typeCompanyName(String Cname) {
		type(elCompany,Cname);
		return this;
	}


	public Duplicateviewleadpage clickbutton() {

		click(eleSubmit);

		return new Duplicateviewleadpage(driver, test);
	}


}