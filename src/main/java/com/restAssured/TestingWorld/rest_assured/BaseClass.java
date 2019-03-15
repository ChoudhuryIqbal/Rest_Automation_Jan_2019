package com.restAssured.TestingWorld.rest_assured;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {
	public ExtentReports extentReport;
	public ExtentTest extentTest;
	
	@BeforeTest
	public void beforeTestClass() {
		
		extentReport=new ExtentReports("./Report.report.html",true);
		extentReport.addSystemInfo("Author Name","Testing World");
		extentTest=extentReport.startTest("Mango");
		
	}

	
	@AfterTest
	public void extentReport() {
		extentTest.log(LogStatus.PASS,"Halluluah");
		extentReport.endTest(extentTest);
		extentReport.flush();
	}

}
