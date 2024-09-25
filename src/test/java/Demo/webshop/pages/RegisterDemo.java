package Demo.webshop.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Demo.webshop.Commons.Common;

public class RegisterDemo {

WebDriver driver;

	
@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
WebElement register;

@FindBy(css = "[id=\"gender-male\"]")
WebElement gendermale;

@FindBy(xpath = "//*[@id=\"FirstName\"]")
WebElement firstname;


@FindBy(name="LastName")
WebElement lastnmae;

@FindBy(name = "Email")
WebElement email;

@FindBy(xpath = "//*[@id=\"Password\"]")
WebElement pass;


@FindBy(xpath="//*[@id=\"ConfirmPassword\"]" )
WebElement conpas;
@FindBy(xpath = "//*[@id=\"register-button\"]")
WebElement registerButton;

public RegisterDemo(WebDriver driver) throws IOException 
{
	this.driver=driver;
	Common. fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
	Common. wb=new XSSFWorkbook(Common. fs);
	Common. sh=Common. wb.getSheet("Sheet1");
	Common. rw=Common. sh.getRow(0);


}
public void RegisteDem() throws IOException, InterruptedException 
{
   String	fn=Common.fistnameReg();
   System.out.println(fn);
   String    la=Common.lastnameReg();
   System.out.println(la);
   String   emai=Common.EmailReg();
   System.out.println(emai);
   String pas=Common.pass();
   System.out.println(pas);
   String conpass=Common.conpass();
   System.out.println(conpass);
   
   
   
   
   
	register.click();
	gendermale.click();
	firstname.sendKeys(fn);
	lastnmae.sendKeys(la);
	email.sendKeys(emai);
	pass.sendKeys(pas);
	conpas.sendKeys(conpass);
	registerButton.click();
	

//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File source	=ts.getScreenshotAs(OutputType.FILE);
//	File des=new File("src//test//resources//Screenshot//Screen.JPG");
//	FileUtils.copyDirectory(des, source);
//	
	
//	File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFileToDirectory(src1, new File("src//test//resources//Screenshot"));
}
}
