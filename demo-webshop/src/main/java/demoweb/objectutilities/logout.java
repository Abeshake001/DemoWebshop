package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Abeshakekumaur R S
 */
public class logout extends BasePage {

	public logout(WebDriver drive) {
		super(drive);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//a[text()='Log out']" )
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
