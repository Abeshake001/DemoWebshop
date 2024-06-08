package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
/**
 * @author Abeshakekumaur R S
 */
public class LoginPage extends BasePage{

	public LoginPage(WebDriver drive) {
		super(drive);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//a[text()='Log in']" )
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
