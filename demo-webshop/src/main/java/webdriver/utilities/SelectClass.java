package webdriver.utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import demowebshopbase.BaseClass;
/**
 * @author Abeshakekumaur R S
 */
public class SelectClass extends BaseClass {
	
	public boolean ismultiple(WebElement dropDown)
	{
		Select slt=new Select(dropDown);
		return slt.isMultiple();
	}

	public void selectbyindex(WebElement dropDown,int index)
	{
		Select slt=new Select(dropDown);
		slt.selectByIndex(index);
	}
	
	public void selectbyvalue(WebElement dropDown,String value )
	{
		Select slt=new Select(dropDown);
		slt.selectByValue(value);
		
	}
	
	public void selectbyvisibletext(WebElement dropDown,String text)
	{
		Select slt=new Select(dropDown);
		slt.selectByVisibleText(text);
	}
	
	public void deselectall(WebElement dropDown)
	{
		Select slt=new Select(dropDown);
		slt.deselectAll();
	}
	
	public void deselectbyindex(WebElement dropDown,int index)
	{
		Select slt=new Select(dropDown);
		slt.deselectByIndex(index);
	}
	
	public void deselectbyvalue(WebElement dropDown,String value)
	{
		Select slt=new Select(dropDown);
		slt.deselectByValue(value);
	}
	
	public void deselectbyvisibletext(WebElement dropDown,String text)
	{
		Select slt=new Select(dropDown);
		slt.deselectByVisibleText(text);
	}
	
	public void getoptions(List<WebElement> dropDown)
	{
		Select slt=new Select((WebElement) dropDown);
		slt.getOptions();
	}
	
	public void getfirstselected(WebElement dropDown)
	{
		Select slt=new Select(dropDown);
		slt.getFirstSelectedOption();
	}
	
	public void getallselected(List<WebElement> dropDown)
	{
		Select slt=new Select((WebElement) dropDown);
		slt.getAllSelectedOptions();
	}
}
