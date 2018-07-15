package editpages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.aventstack.extentreports.ExtentTest;


import lib.selenium.WebDriverServiceImpl;

public class FindingleadtoEdit extends WebDriverServiceImpl{


	@FindBy(xpath = "(//input[@name='firstName'])[3]")
	WebElement  elFName;
	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement  eleFindLead;
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement  eleSelect;

	
	public FindingleadtoEdit(EventFiringWebDriver driver,ExtentTest test) {

		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);

	}	

	public FindingleadtoEdit typeFirstName(String Fname) {
		type(elFName,Fname);
		return this;
	}	
	public FindingleadtoEdit clickFL() {

		click(eleFindLead);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
		return this;
	}

	public ViewleadPage clickFirstLead() {

		click(eleSelect);

		return new ViewleadPage(driver, test);
	}

}