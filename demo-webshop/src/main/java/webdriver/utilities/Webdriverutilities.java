package webdriver.utilities;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demowebshopbase.BaseClass;
/**
 * @author Abeshakekumaur R S
 */
public class Webdriverutilities extends BaseClass {
	
	public void gettitle(WebDriver driver)
	{
		driver.getTitle();
	}
	
	public void geturl(WebDriver driver,String text)
	{
		driver.get(text);
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void sendtext(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public void close(WebDriver driver)
	{
		driver.close();
	}
	
	public void allertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void allertdismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void allertgettext(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	
	public void allertsendtext(WebDriver driver,String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	

}
