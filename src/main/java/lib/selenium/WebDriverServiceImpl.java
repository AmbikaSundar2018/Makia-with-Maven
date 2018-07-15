package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));

			case "name": return driver.findElement(By.name(locValue));

			case "class": return driver.findElement(By.className(locValue));

			case "link" : return driver.findElement(By.linkText(locValue));

			case "xpath": return driver.findElement(By.xpath(locValue));

			default:
				break;
			}

		} catch (NoSuchElementException e) {
			reportSteps("Element not found","fail");

			e.printStackTrace();

		}		return null;

	}



	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportSteps("The Data "+data+" is Entered Successfully", "pass");
		} catch (Exception e) {
			reportSteps("The Data "+data+" is not Entered Successfully", "fail");
		}		
	}


	public void click(WebElement ele) {
		try {
			ele.click();
			reportSteps("The Data "+ele+" is clicked Successfully", "pass");
		} catch (Exception e) {
			reportSteps("The Data "+ele+" is not clicked Successfully", "fail");
		}

	}

	public String getText(WebElement ele) {
		String textcheck;	
		try {
			textcheck = ele.getText();
			reportSteps("The text "+ele+" returned in correct", "pass");
			return textcheck;
		} catch (Exception e) {
			reportSteps("The Data "+ele+" returned in not correct", "fail");
		}
		return null;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		try {
			Select dropdown = new Select(ele);
			dropdown.selectByVisibleText(value);
			reportSteps("The Data "+value+" is selected Successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportSteps("The Data "+value+" is not selected Successfully", "fail");
		}

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		try {
			Select dropdown = new Select(ele);
			dropdown.selectByValue(value);
			reportSteps("The Data "+value+" is selected Successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportSteps("The Data "+value+" is not selected Successfully", "fail");
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);

	}

	public boolean verifyExactTitle(String expectedTitle) {

		String actualTitle = driver.getTitle();

		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title matches");
			return true;
		}

		else {
			System.out.println("Title does not matches");
		}

		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle1) {

		try {
			String actualParTitle = driver.getTitle();

			if(actualParTitle.contains(expectedTitle1)) {
				System.out.println("Partial Title matches");
				return true;
			}

			else {
				System.out.println("Partial Title does not matches");
			}


		} catch (WebDriverException e) {

			System.err.println("Exemption not found");
			e.printStackTrace();
		}

		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {

		try {
			String exactText = ele.getText();

			if (exactText.equalsIgnoreCase(expectedText)) {
				//System.out.println("text"+exactText);
				reportSteps("Displayedtext matches"+exactText, "pass");
			}
			else {
				System.out.println("text doesnot match");
				
			}
		} catch (Exception e) {
			reportSteps("No Such text", "fail");
			e.printStackTrace();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String partialText = ele.getText();

			if (partialText.equalsIgnoreCase(expectedText)) {
				reportSteps("Displayedtext matches"+partialText, "pass");
			}
			else {
				System.out.println("text doesnot match");
				
			}
		} catch (Exception e) {
			reportSteps("No Such text", "fail");
			e.printStackTrace();
		}

	}
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		/*String price = ele.getText();

		if (price.equals()) {
			System.out.println("text"+accname);

		}
		else {
			System.out.println("text doesnot match");
		}*/

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {

		try {
			Set<String> windowHandles = driver.getWindowHandles();

			List<String> allWindows = new ArrayList<String>();

			allWindows.addAll(windowHandles);

			driver.switchTo().window(allWindows.get(index));

		} catch (NoSuchWindowException e) {
			System.out.println("No windows found");
			e.printStackTrace();
		}

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
