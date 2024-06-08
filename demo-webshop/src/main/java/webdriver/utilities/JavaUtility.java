package webdriver.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.testng.ISuiteListener;
import org.testng.ITestListener;

import demowebshopbase.BaseClass;

/**
 * @author Abeshakekumaur R S
 */
public class JavaUtility {
	
	public int generateRandomNum(int range)
	{
		Random ran=new Random();
		int randomNumber=ran.nextInt(range);
		return range;
	}
	
	public String dateandtime()
	{
		Date dateof=new Date();
		String date=dateof.toString();
		return date.replace(" ", "_").replace(":", "_");
		
	}
	
	public void getSystemDateInDD_MM_YYY()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		Date dateobj=new Date();
		String date=sdf.format(dateobj);
		System.out.println(date);
		
	}

}
