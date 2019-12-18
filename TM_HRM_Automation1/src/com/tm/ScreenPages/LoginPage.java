package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.tm.Libraries.Weblibrary;

public class LoginPage extends Weblibrary{
	
	//Login panel webelement in the Homepage
	@FindBy(xpath = "//div[text()='LOGIN Panel']")
	public static WebElement Elm_LoginPanel;
		
	//Username Field Webelement
	@FindBy(xpath = "//input[@id='txtUsername']")
	public static WebElement Edit_username;
	
	//Password field Webelement
	@FindBy(xpath = "//input[@id='txtPassword']")
	public static WebElement Edit_Password;

	//Login button Webelement
	@FindBy(xpath = "//input[@id='btnLogin']")
	public static WebElement Btn_Login;		

	//Login button Webelement
	@FindBy(xpath = "//a[@id='welcome']")
	public static WebElement Elm_Welcome;	

	public void Launch(){
		boolean status;		
	
		status=launchApplication(appURL);
		logEvent(status, "Application launched Sucessfully", "Unable to launch the Application");
		
		status=isExist(Elm_LoginPanel);
		logEvent(status, "Login home page displyed sucessfully", "Login page is not displyed");
		
	}
	
	public void LogintoApp(){
		boolean status;			
		
		status=setText(Edit_username, "user02");
		logEvent(status, "User Name data entered Sucessfully", "Unable to Enter the data into user name feild");
		
		status=setText(Edit_Password, "TM1234");
		logEvent(status, "Pass Word data entered Sucessfully", "Unable to Enter the data into Pass Word feild");
		
		status=clickElement(Btn_Login);
		logEvent(status, "Login Button clicked Sucessfully", "Login button is not clicked");
		
		status=isExist(Elm_Welcome);
		logEvent(status, "Welcome page displyed sucessfully", "Welcome page is not displyed");
		
	}
	

}
