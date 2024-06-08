package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
/**
 * @author Abeshakekumaur R S
 */
public class AddToCart1 extends BasePage{

	public AddToCart1(WebDriver drive) {
		super(drive);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="//strong[text()='Featured products']" )
	private WebElement featuredproduct;
	
	@FindBy(xpath ="//div[@class='product-grid home-page-product-grid']/descendant::div[13]/descendant::div[3]/descendant::a" )
	private WebElement laptop;
	
	@FindBy(id ="add-to-cart-button-31" )
	private WebElement addtocart;

	public WebElement getFeaturedproduct() {
		return featuredproduct;
	}

	public WebElement getLaptop() {
		return laptop;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
