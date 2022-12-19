package com.aspire.Framwork.POM_Pagefactory;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage
{
	@FindBy (xpath="//input[@type='checkbox']") private WebElement CheckBox;
	@FindBy (xpath="//input[@type='email']")    private WebElement UN;
	@FindBy (xpath="//input[@type='password']") private WebElement PassWord;
	@FindBy (xpath="//button[@type='submit']")  private WebElement Login;
	
       public LoginWebPage(WebDriver driver)
         {
	           PageFactory.initElements(driver, this);
         }
      // public void TitleVerify(String ExpTital )
    //   {
//			// Verify Title
//			String ExpTitle = "Your store. Login";
//		    // String ActTitle= driver.getTitle();
//		    // System.out.println(ActTitle);
//		     if(ExpTitle.equals( ActTitle))
//		     {
//		    	System.out.println("Title verification test case is pass"); 
//		    	 
//		     }
//		     else
//		     {
//		    	 System.out.println("Title verification test case is Fail"); 
//		     }
//		     Thread.sleep(2000);
//       }
	public void VerifyCheckBox(boolean ExpChkResult) 
	{
		//Verify CheckBox
	     boolean ExpChkResult1 = true;
	     CheckBox.click();
	     boolean ActResult = CheckBox.isDisplayed();
	     if(ExpChkResult == ActResult)
	     {
	    	 System.out.println("CheckBox verifiction test case is pass"); 
	    	 
	     }
	     else
	     {
	    	 System.out.println("CheckBox verifiction test case is fail"); 
	    	  
	     }
	    
	}
     
	public void LoginVerifiction(boolean VerifyLoginPaga,boolean VerifyLoginPaga1) throws InterruptedException
	{
		boolean VerifyLoginPage = true;
		// enter Email 
	     UN.clear();
	     UN.sendKeys("admin@yourstore.com");
	     Thread.sleep(2000);
	     
		//enter Password
	     PassWord.clear();
	     PassWord.sendKeys("admin");
	     Thread.sleep(2000);
	     
		//Click oN login
	    Login.click();
	     Thread.sleep(2000);
	}
}
