package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.LoginPage;

public class TestCase_LoginPage extends BaseClass {
	
	
@Test(priority=1)
	public void TC01_Login() {
		
		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);
		
		//launching the browser
		obj.Launch();
		
		//login the app's
		obj.LogintoApp();
	}


@Test(priority=2)

public void TC02_Apply(){
	
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	Home home = PageFactory.initElements(driver, Home.class);
	ApplyLeave applyleave = PageFactory.initElements(driver, ApplyLeave.class);
			
	//Step 1: Login as a team member
	login.LogintoApp();
	
	//Step 2: Navigate Apply Leave page
	home.navApplyLeave();
	
	//Step 3: Enter leave details and click save
	applyleave.ApplyLeavePage();
	
	//Step 4: Logout
	home.LogOut();
	
}

@Test(priority=3)

public void TC03_MyLeave(){
	
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	Home home = PageFactory.initElements(driver, Home.class);
	MyLeave myleave = PageFactory.initElements(driver, MyLeave.class);
			
	//Step 1: Login as a team member
	login.LogintoApp();
	
	//Step 2: Navigate Apply Leave page
	home.navMyLeave();
	
	//Step 3: Enter leave details and click save
	myleave.MyLeavePage();
	
	//Step 4: Verify leave details in My Leave page
	
	
	//Step 5: Logout
	home.LogOut();
	
}


}




