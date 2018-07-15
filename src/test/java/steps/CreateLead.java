package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	ChromeDriver driver;

	@Given("Open the browser")
	public void openbrowser() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@And("Launch the URL")
	public void url() {

		driver.get("http://leaftaps.com/opentaps");

	}

	@And("Set the timouts")
	public void timeout() {

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	@And("maximise the browser")
	public void maxWindow() {

		driver.manage().window().maximize();
	}

	@And("enter the username as (.*)")
	public void username(String Username) {

		driver.findElementById("username").sendKeys(Username);
		
	}

	@And("Enter the password as (.*)")
	public void password(String Password) {

		driver.findElementById("password").sendKeys(Password);

	}

	@And("click on login button")
	public void login() {

		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("click on crmsfa")
	public void linkClick() {

		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click on Leads button")
	public void clickLead() {

		driver.findElementByLinkText("Leads").click();
			}
	

	@And("Click on create Lead")
	public void clickCreateLead() {

		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter the company Name as (.*)")
	public void companyName(String CName) {

		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
				
	}

	@And("Enter the first Name as (.*)")
	public void firstName(String Fname) {

		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}

	@And("Enter the last Name as (.*)")
	public void lastName(String Lname) {

		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
	}

	@When("click on Create lead button")
	public void createLeadButton() {

		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("Lead should be created successfully.")
	public void loginResult() {

		System.out.println("Lead created successfully");
	}

	

}
