package Demo.webshop.test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Demo.webshop.listners.DemoIsuitWebShop;
import Demo.webshop.pages.Billing;
import Demo.webshop.pages.BuyingBooks;
import Demo.webshop.pages.Payment;
import Demo.webshop.pages.RegisterDemo;


@Listeners(DemoIsuitWebShop.class)
public class NewTest {

	WebDriver driver;
	static Logger log=Logger.getLogger(NewTest.class.getName());
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Keyword_Driven_Webshop_FrameWork\\cmd\\chromedriver.exe");
		driver=new ChromeDriver();
        Layout lay=new PatternLayout();
        Appender ap=new FileAppender(lay,"Cook.txt");
        log.addAppender(ap);

	}
	@BeforeTest
	public void BT()
	{
		driver.get("https://demowebshop.tricentis.com");
		
         log.info("Url Passed");
        // Assert.assertEquals(driver.getCurrentUrl(),url );
	}
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
       log.info("Window Maximize");
	}
	@BeforeMethod
	public void cookies()
	{
		Set<Cookie>	Scookies=driver.manage().getCookies();
		System.out.println(Scookies.size()); 
		for(Cookie cookie:Scookies)
		{
			log.info(cookie.getName());
		    log.info(cookie.getClass());
		    log.info(cookie.getDomain());
		    log.info(cookie.getPath());
		    log.info(cookie.getName());
		    log.info(cookie.getExpiry());
		    
		}
		
	}
	@Test(priority = 1)
	public void Regclass() throws IOException, InterruptedException 
	{
		Thread.sleep(2000);
		 RegisterDemo demo=PageFactory.initElements(driver,RegisterDemo.class);
		 
		demo.RegisteDem();
	}
	@Test( priority =2)
	public void BookBuy() throws InterruptedException 
	{
		BuyingBooks bo=PageFactory.initElements(driver, BuyingBooks.class);
		bo.BuyM();
	}
	@Test(priority = 3)
	public void Biling() throws IOException, InterruptedException 
	{
		Billing bil=PageFactory.initElements(driver, Billing.class);
		bil.bill();
	}
	@Test(priority = 4)
	public void payment() throws InterruptedException 
	{
		Payment pay=PageFactory.initElements(driver, Payment.class);
		pay.click();
	}
	

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

	@AfterMethod
	public void screenshot() throws IOException {
	    // Capture screenshot
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);

	    // Generate a timestamp for unique file names
	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	    // Define the destination path, using timestamp for uniqueness
	    File des = new File("src/test/resources/Screenshot/Screen_" + timestamp + ".JPG");

	    // Create directories if they don't exist
	    des.getParentFile().mkdirs();

	    FileUtils.copyFile(source, des);

	    System.out.println("Screenshot saved at: " + des.getAbsolutePath());
	}

	
	
	
	
	
	
	
	
	

}
