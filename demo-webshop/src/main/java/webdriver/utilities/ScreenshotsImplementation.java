package webdriver.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import demowebshopbase.BaseClass;
/**
 * @author Abeshakekumaur R S
 */
public class ScreenshotsImplementation {
	
	
	
		public void onTestSuccess(WebDriver driver, String text) {
		Reporter.log(" Test script is executed",true);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File path=new File("./TakeScreenshot/"+text+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(img, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void onTestFailure(WebDriver driver,String text) {
		Reporter.log(" Test script has faieled",true);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File path=new File("./FailedScreenshot/"+text+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(img, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void captureWebElementScreenshot(WebElement element,String text) {
		Reporter.log(" Test script has faieled",true);

		File img=element.getScreenshotAs(OutputType.FILE);
		File path=new File("./TakeScreenshot/"+text+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(img, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
