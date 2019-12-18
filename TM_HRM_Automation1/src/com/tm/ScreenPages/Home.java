package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Home extends Weblibrary{
	
	//===========Elements section===================
	//Leave menu Field
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement link_Leave;
	
	@FindBy(xpath = "//a[@id='menu_leave_applyLeave']")
	public static WebElement link_ApplyLeave;
	
	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement link_MyLeave;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	
	@FindBy(xpath = "//a[@id='welcome']")
	public static WebElement link_Welcome;
	
	@FindBy(xpath = "//a[@href='/hrm/symfony/web/index.php/auth/logout']")
	public static WebElement link_Logout;
	
	
	//============Methods section==============
	public static void navApplyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);		
		status = clickElement(link_ApplyLeave);	
		logEvent(status, "Apply leave menu link clicked", "Apply leave menu link not clicked");
	}
	
	public static void navMyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);
		status = clickElement(link_MyLeave);	
		logEvent(status, "MyLeave menu link clicked", "MyLeave menu link not clicked");
	}
	
	public static void navMyInfo(){			
		boolean status = clickElement(link_MyInfo);	
		logEvent(status, "MyInfo menu link clicked", "MyInfo menu link not clicked");		
	}
	
	public static void navWelcome(){	
		boolean status;
		status = moveToElement(link_Welcome);
		logEvent(status, "mouse hover to Welcome is successful", "mouse hover to Welcome is unsuccessful");
		wait(2);		
		status = clickElement(link_Welcome);	
		logEvent(status, "Welcome link clicked", "Welcome link not clicked");
		
	}
	
	public static void LogOut(){	
		boolean status;
		status = moveToElement(link_Logout);
		logEvent(status, "mouse hover to Logout link is successful", "mouse hover to Logout link is unsuccessful");
		wait(2);		
		status = clickElement(link_Logout);	
		logEvent(status, "Logout link clicked successfully", "Logout link not clicked");
		
	}
	
	
	//=====================================

}





