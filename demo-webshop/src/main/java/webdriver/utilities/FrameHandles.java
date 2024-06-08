package webdriver.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demowebshopbase.BaseClass;
/**
 * @author Abeshakekumaur R S
 */
public class FrameHandles extends BaseClass {

	public void framehandlebyindex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void framehandlebyid(WebDriver driver,String text)
	{
		driver.switchTo().frame(text);
	}
	
	public void framehandlebywebelement(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void framehandletodefault(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void framehandletoparentframe(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
}
