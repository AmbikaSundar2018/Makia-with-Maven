package duplicatePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class Duplicateviewleadpage extends WebDriverServiceImpl{
  
	@FindBy(id = "viewLead_firstName_sp")
	WebElement  eleMyLead;
	@FindBy(linkText="Duplicate Lead")
	WebElement  DuplicateLead;
	
	public Duplicateviewleadpage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
		public Duplicateviewleadpage verifyPartialText(String Fname) {
			
			verifyExactText(eleMyLead, Fname);
			System.out.println(Fname);
			return this;
		}
		public Duplicatepage clickDuplicate() throws InterruptedException{
			
			click(DuplicateLead);
			return new Duplicatepage(driver, test);
		}
		
	}
	

