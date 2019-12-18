package com.tm.Libraries;

import org.openqa.selenium.WebElement;

import com.tm.BaseClass.BaseClass;

public class Custommethods extends BaseClass {
	
	public static boolean selectRadioButton(WebElement element){
		boolean status;
	try	{	element.isDisplayed();
			element.click();
			status = true;
	}
	
	catch(Exception e)	{
							status=false;
							
	}		
				return status;
	}
	
	
	
	
	
	

}
