package demoweb.listners;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import demowebshopbase.BaseClass;
import webdriver.utilities.JavaUtility;
/**
 * @author Abeshakekumaur R S
 */
public class ListnersImplimentator  implements ISuiteListener,ITestListener {
	
	public static ExtentSparkReporter spark;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		spark=new ExtentSparkReporter("./AdvancedReports/"+suite.getName()+".html");
		reports=new ExtentReports();
		reports.attachReporter(spark);
		Reporter.log(suite.getName()+"Suite successfully started",true);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getName());
		test.log(Status.INFO, result.getName()+"Test script has started execution");
		Reporter.log(result.getName()+"Test script has started execution",true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getName()+"Test script has successfully passed");
		Reporter.log(result.getName()+"Test script successfully passed",true);
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getName()+"Tst script has skipped");
		Reporter.log(result.getName()+"Test script has Skipped",true);
		
	}
	
	@Override
	public void onFinish(ISuite suite) {
		reports.flush();
		Reporter.log(suite.getName()+"Suite has successfully executed",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"Test script has failed and successfully captured the screenshot ",true);
		JavaUtility jav=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File path=new File("./FailedScreenshot/"+result.getName()+jav.dateandtime()+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(img, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(Status.FAIL,result.getName()+"Test script has failed and successfully captured the screenshot");
	}

}
