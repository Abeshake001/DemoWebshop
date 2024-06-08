package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Abeshakekumaur R S
 */
public class ShoppingCart extends BasePage{

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public ShoppingCart(WebDriver drive) {
		super(drive);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcart;
	

}
