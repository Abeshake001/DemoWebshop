package scripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import demoweb.listners.ListnersImplimentator;
import demoweb.objectutilities.ShoppingCart;
import demowebshopbase.BaseClass;
import webdriver.utilities.JavaUtility;
import webdriver.utilities.ScreenshotsImplementation;
import webdriver.utilities.Webdriverutilities;
/**
 * @author Abeshakekumaur R S
 */

@Listeners(demoweb.listners.ListnersImplimentator.class)
public class AddToCart extends BaseClass{
	
	@Test//(retryAnalyzer = demoweb.listners.RetryListners.class)
	public void addToCart()
	{
		demoweb.objectutilities.AddToCart1 add=new demoweb.objectutilities.AddToCart1(driver);
		ShoppingCart shop=new ShoppingCart(driver);
		action.javascriptscroll(driver, add.getLaptop());
		//action.scrolltoelement(driver, add.getLaptop());
		utilities.click(add.getLaptop());
		utilities.click(add.getAddtocart());
		ListnersImplimentator.test.log(Status.INFO,"laptop selected");
		utilities.click(shop.getShoppingcart());
		ListnersImplimentator.test.log(Status.INFO,"Shopping cart clicked");
	}

}
