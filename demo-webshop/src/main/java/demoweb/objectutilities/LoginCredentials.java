package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
/**
 * @author Abeshakekumaur R S
 */
public class LoginCredentials extends BasePage{

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public LoginCredentials(WebDriver drive) {
		super(drive);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindAll({@FindBy(id = "Email"),@FindBy(xpath ="//input[@class='email']" )})
	private WebElement emailTextfield;
	
	@FindAll({@FindBy(id = "Password"),@FindBy(xpath ="//input[@class='password']" )})
	private WebElement passwordTextfield;
	
	@FindAll({@FindBy(xpath ="//input[@class='button-1 login-button']" ),@FindBy(xpath ="//input[@value='Log in']" )})
	private WebElement loginbutton;

}
