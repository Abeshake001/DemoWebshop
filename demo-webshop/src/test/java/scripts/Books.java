package scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demowebshopbase.BaseClass;
import webdriver.utilities.SelectClass;

/**
 * @author Abeshakekumaur R S
 */
//@Listeners(webdriver.utilities.ListnersImplimentator.class)
public class Books extends BaseClass {

	@Test//(retryAnalyzer = demoweb.listners.RetryListners.class)
	public void selectbook()
	{
		demoweb.objectutilities.Books book=new demoweb.objectutilities.Books(driver);
		SelectClass slt=new SelectClass();
		utilities.click(book.getBooks());
		slt.selectbyindex(book.getSortby(), 2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.javascriptscroll(driver, book.getNewsletter());
		action.javascriptclick(driver, book.getFictionbook());
		utilities.click(book.getBookaddtocart());
		
	}
}
