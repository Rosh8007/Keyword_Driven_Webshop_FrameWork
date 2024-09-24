package Demo.webshop.Commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Common {

	public static FileInputStream fs;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow rw;
	public static XSSFCell cll;

	public static FileInputStream getdata() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(0);
		cll=rw.getCell(0);

		return fs;

	}

	public static  String FirsnameM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(0);
		String fname	=cll.getStringCellValue();
		return fname;
	}
	public static  String LastnameM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(1);
		String lname	=cll.getStringCellValue();
		return lname;
	}
	public static  String EmailM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(2);
		String  email =cll.getStringCellValue();
		return email;
	}
	public static  String CompanyM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(3);
		String company=cll.getStringCellValue();
		return company;
	}
	public static String countryM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(4);
		String country=cll.getStringCellValue();
		return country;
	}
	public static String stateM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(5);
		String state=cll.getStringCellValue();
		return state;
	}
	public static String  CityM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(6);
		String City=cll.getStringCellValue();
		return City;
	}
	public static String Add1() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(7);
		String add1=cll.getStringCellValue();
		return add1;
	}
	public static String Add2M() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(8);
		String add2=cll.getStringCellValue();
		return add2;
	}
	public static String ZipM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(9);
		String ZipM=cll.getStringCellValue();
		return ZipM;
	}
	public static String PhoneM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(10);
		String PhoneM=cll.getStringCellValue();
		return PhoneM;
	}
	public static String FaxNoM() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet2");
		rw=sh.getRow(0);
		cll=rw.getCell(11);
		String faxno=cll.getStringCellValue();
		return faxno;
	}
	public static String fistnameReg() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(1);
		cll=rw.getCell(0);
		String fnreg=cll.getStringCellValue();
		
		
		return fnreg;
		
	}
	
	public static String lastnameReg() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(1);
		cll=rw.getCell(1);
		String lastnreg=cll.getStringCellValue();
		
		
		return lastnreg;
		
	}
	
	public static String EmailReg() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(1);
		cll=rw.getCell(2);
		String emailReg=System.currentTimeMillis()+cll.getStringCellValue();
		
		
		return emailReg;
		
	}
	
	public static String pass() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(1);
		cll=rw.getCell(3);
		String passreg=cll.getStringCellValue();
		
		
		return passreg;
		
	}
	public static String conpass() throws IOException 
	{
		fs=new FileInputStream("src//test//resources//Excel//DemoWebShopLeyworddr.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Sheet1");
		rw=sh.getRow(1);
		cll=rw.getCell(4);
		String conpass=cll.getStringCellValue();
		
		
		return conpass;
		
	}

	public static void main(String[] args) throws IOException {
		
//	    	String a=Common.fistnameReg();
//	    	System.out.println(a);
//	    	String bString= Common.lastnameReg();
//	    	System.out.println(bString);
//	    	String c =Common.PhoneM();
//	    System.out.println(c);
		
	String	fn=Common.CompanyM();
	System.out.println(fn);
	  String       zip=Common.ZipM();
	  System.out.println(zip);
	}

}
