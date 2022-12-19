package com.aspire.Framwork.POM_Pagefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
{
	System.setProperty("webdriver.chrome.driver", "E:\\manjula\\Eclipsefiles\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	
	// get URL
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(2000);
	
	
	String ExpTitle = "Your store. Login";
	boolean ExpChkResult1 = true;
	boolean VerifyWebPage1 = true;
	boolean VerifyWebPage2 = true;
	boolean expLogoResult = true;
//	FileInputStream file = new FileInputStream("E:\\manjula\\Eclipsefiles\\Selenium\\TestData\\Test2.xlsc");
//      Workbook wbf = WorkbookFactory.create(file);
//      
//      wbf.getSheet("Sheet1").getRow()
//	
	
	
	// create object of POM class
	LoginWebPage lp =  new LoginWebPage(driver);
	//lp.TitleVerify(ExpTitle);
	lp.VerifyCheckBox(ExpChkResult1);
	lp.LoginVerifiction(VerifyWebPage1,VerifyWebPage2);
	
	DashBoard db = new DashBoard(driver);
	db.LogoVerification(expLogoResult);
	
	driver.close();
}
}
