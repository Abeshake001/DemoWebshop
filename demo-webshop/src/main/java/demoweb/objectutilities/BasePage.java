package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Abeshakekumaur R S
 */
public class BasePage {
	
	public BasePage(WebDriver drive)
	{
		PageFactory.initElements(drive, this);
	}

}
