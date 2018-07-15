package basicReport;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import lib.selenium.PreAndPost;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//Set HTML reporting file location
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		html.loadXMLConfig("./src/main/resources/extent-config.xml");
		
	}
	
	
		
		/*ExtentTest testSuite = extent.createTest("TC001_CreateLeat", "Create a new Lead in leaftaps");
		ExtentTest test = testSuite.createNode("Leads");
		test.assignCategory("smoke");
		test.assignAuthor("sarath");
		*/
		

	}











