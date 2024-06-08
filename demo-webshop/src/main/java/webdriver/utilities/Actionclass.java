package webdriver.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demowebshopbase.BaseClass;

/**
 * @author Abeshakekumaur R S
 */
public class Actionclass extends BaseClass {

	public void movetoelement(WebDriver driver,WebElement element)
	{
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();	
	}
	
	public void click(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).doubleClick().perform();
	}
	
	public void rightclick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void dragandhold(WebDriver driver,WebElement element,WebElement element1)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(element, element1).perform();
	}
	
	public void clickandhold(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	public void release(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.release(element).perform();
	}
	public void scrolltoelement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	public void javascriptscroll(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element );
	}
	
	public void javascriptclick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
}
