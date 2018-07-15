package deletePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class Deleteviewleadpage extends WebDriverServiceImpl{
  
	@FindBy(id = "viewLead_firstName_sp")
	WebElement  eleMyLead;
	@FindBy(linkText="Delete")
	WebElement  Deletebutton;
	
	public Deleteviewleadpage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
		public Deleteviewleadpage verifyPartialText(String Fname) {
			
			verifyExactText(eleMyLead, Fname);
			System.out.println(Fname);
			return this;
		}
public MyleadFindPage clickDelete() throws InterruptedException{
			
	click(Deletebutton);
	return new MyleadFindPage(driver, test);
		}
		
	}
	

