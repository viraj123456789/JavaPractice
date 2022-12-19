package com.aspire.Framwork.POM_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard
{
	@FindBy (xpath="(//img[@alt='logo.png'])[2]") private WebElement logo;
	
	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LogoVerification(boolean expLogoResult2)
	{
	// Verify Logo After Login
    boolean ExpLogoResult = true;
    boolean ActLogoResult = logo.isDisplayed();
    if(ExpLogoResult == ActLogoResult)
    {
   	 System.out.println("Logo verifiction test case is pass"); 
    }
    else
    {
   	 System.out.println("logo verifiction test case is fail"); 
    }
}
}
