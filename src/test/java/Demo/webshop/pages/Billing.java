package Demo.webshop.pages;




import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Demo.webshop.Commons.Common;





public class Billing {


	WebDriver driver;
	@FindBy(name="BillingNewAddress.FirstName")
	WebElement firstname;
	@FindBy(name="BillingNewAddress.LastName")
	WebElement lastname;
	@FindBy(name="BillingNewAddress.Email")
	WebElement email;
	@FindBy( name="BillingNewAddress.Company")
	WebElement company;
	@FindBy(name="BillingNewAddress.CountryId")
	WebElement countryid;
	@FindBy(name="BillingNewAddress.StateProvinceId")
	WebElement state;
	@FindBy(name="BillingNewAddress.City")
	WebElement city;
	@FindBy(name="BillingNewAddress.Address1")
	WebElement addr1;
	@FindBy(name="BillingNewAddress.Address2")
	WebElement addr2;
	@FindBy(name="BillingNewAddress.ZipPostalCode")
	WebElement zip;
	@FindBy(name="BillingNewAddress.PhoneNumber")
	WebElement phone;
	@FindBy(name="BillingNewAddress.FaxNumber")
	WebElement faxno;

	public Billing(WebDriver driver) throws IOException 
	{
		this.driver=driver;
		Common.fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		Common.	wb=new XSSFWorkbook(Common.fs);
		Common.	sh=Common.wb.getSheet("Sheet2");
		Common.rw=Common.sh.getRow(0);
		Common.cll=Common.rw.getCell(0);
	}

	public void bill() throws IOException, InterruptedException 
	{
		//		String fn=Common.FirsnameM();
		//		
		//		String ln=Common.LastnameM();
		//	
		//
		//		String   em=Common.EmailM();


		String comp= Common.CompanyM();
		System.out.println(comp);
		String contry= Common.countryM();
		System.out.println(contry);

		String sta= Common.stateM();
		System.out.println(sta);
		String cit=Common.CityM();
		System.out.println(cit);
		String	ad=Common.Add2M();
		System.out.println(ad);
		String ad2=Common.Add1();
		System.out.println(ad2);
		String zp=Common.ZipM();
		System.out.println(zp);
		String phon=Common.PhoneM();
		System.out.println(phon);

		String	fx=Common.FaxNoM();
		System.out.println(fx);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//		Thread.sleep(1000);
		//		firstname.sendKeys(fn);
		//		Thread.sleep(1000);
		//		lastname.sendKeys(ln);
		//		Thread.sleep(1000);
		//		email.sendKeys(em);
		Thread.sleep(1000);
		company.sendKeys(comp);

		Thread.sleep(1000);
		countryid.sendKeys(contry);
		Thread.sleep(1000);
		state.sendKeys(sta);
		Thread.sleep(1000);
		city.sendKeys(cit);
		Thread.sleep(1000);
		addr1.sendKeys(ad);
		Thread.sleep(1000);
		addr2.sendKeys(ad2);
		Thread.sleep(1000);
		zip.sendKeys(zp);
		Thread.sleep(1000);
		phone.sendKeys(phon);
		Thread.sleep(1000);
		faxno.sendKeys(fx);


	}


}
