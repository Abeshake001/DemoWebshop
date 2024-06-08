package demoweb.objectutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Abeshakekumaur R S
 */
public class Books extends BasePage {

	public Books(WebDriver drive) {
		super(drive);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[1]/a")
	private WebElement books;
	
	@FindBy(id = "products-orderby")
	private WebElement sortby;
	
	@FindBy(xpath = "//a[text()='Fiction']")
	private WebElement fictionbook;
	
	@FindBy(id = "add-to-cart-button-45")
	private WebElement bookaddtocart;
	
	@FindBy(xpath = "//a[text()='Science']")
	private WebElement sciencebook;
	
	@FindBy(xpath = "//strong[text()='Newsletter']")
	private WebElement newsletter;
	
	
	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getSciencebook() {
		return sciencebook;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getFictionbook() {
		return fictionbook;
	}

	public WebElement getBookaddtocart() {
		return bookaddtocart;
	}

	

}
