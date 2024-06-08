package demowebshopbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.Status;

import demoweb.listners.ListnersImplimentator;
import demoweb.objectutilities.LoginCredentials;
import demoweb.objectutilities.LoginPage;
import demowebshop.fileutiities.ReadProperties;
import webdriver.utilities.Actionclass;
import webdriver.utilities.Webdriverutilities;
/**
 * @author Abeshakekumaur R S
 */


public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	ReadProperties read=new ReadProperties();
	public static Webdriverutilities utilities=new Webdriverutilities();
	public static Actionclass action=new Actionclass();
	@BeforeClass
	public void openBrowser()
	{
		String url=read.fetchProperties("url");
		driver=new ChromeDriver();
		sdriver=driver;
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		Reporter.log("browser successfully opened",true);
	}
	
	@BeforeMethod
	public void login()
	{
		String username=read.fetchProperties("username");
		String password=read.fetchProperties("password");
		
		LoginPage login=new LoginPage(driver);
		
		utilities.click(login.getLogin());
		
		LoginCredentials loginc=new LoginCredentials(driver);
		utilities.sendtext(loginc.getEmailTextfield(), username);
		utilities.sendtext(loginc.getPasswordTextfield(), password);
		utilities.click(loginc.getLoginbutton());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("logged out successfully",true);
	}
	
	@AfterMethod
	public void logout()
	{
		demoweb.objectutilities.logout logout=new demoweb.objectutilities.logout(driver);
		
		utilities.click(logout.getLogout());
		
		Reporter.log("logged out successfully",true);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		utilities.close(driver);
		Reporter.log("browser closed",true);
	}
	

}
