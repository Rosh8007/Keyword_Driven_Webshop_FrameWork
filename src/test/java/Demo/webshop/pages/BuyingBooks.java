package Demo.webshop.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BuyingBooks {


	WebDriver driver;

	@FindBy(xpath  ="/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
	WebElement booksbotton;

	@FindBy(xpath="//h2[@class='product-title']//a")
	WebElement book;

	@FindBy(xpath = "//*[@id=\"add-to-cart-button-13\"]")
	WebElement addtocart;
	@FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement opencart;
	@FindBy(css = "[id='termsofservice']")
	WebElement TOS;
	@FindBy(css = "[id=\"checkout\"]" )
	WebElement checkout;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]" )
	WebElement checkoutasguest;
//	@FindBy(name="Email")
//	WebElement emaElement;
//	@FindBy(name="Password")
//	WebElement pas;
//	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
//	WebElement lobut;
//	
	
	public BuyingBooks(WebDriver driver) throws IOException 
	{
		this.driver=driver;
		

	}

	public void BuyM() throws InterruptedException {
		Thread.sleep(1000);
		booksbotton.click();
		book.click();
		
		addtocart.click();
		Thread.sleep(3000);
		
		WebDriverWait wb=new WebDriverWait(driver, 10);
		//Here Notification bar that pop up hides addto cart link
		// so ive used webdriver waits till it becomes invisible
		WebElement notificationBar = driver.findElement(By.id("bar-notification"));
        wb.until(ExpectedConditions.invisibilityOf(notificationBar));
		wb.until(ExpectedConditions.elementToBeClickable(opencart));
		opencart.click();
		TOS.click();
		checkout.click();
//		emaElement.sendKeys();
//		pas.sendKeys();
//		lobut.click();
		
		
		
//		Thread.sleep(1000);
//		checkoutasguest.click();
	}

}
