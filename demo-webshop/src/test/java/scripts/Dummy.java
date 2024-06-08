package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Dummy {

	@Test
	public void demo()
	{
	ExtentSparkReporter spark=new ExtentSparkReporter("./AdvancedReports/Dummy.html");
	ExtentReports report=new ExtentReports();
	report.attachReporter(spark);
	ExtentTest test=report.createTest("TextName");
	test.log(Status.INFO, "Demo Reports");
	test.log(Status.INFO, "Demo Reports");
	test.log(Status.INFO, "Demo Reports");
	report.flush();
	}
}
