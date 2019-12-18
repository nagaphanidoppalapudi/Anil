package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyLeave extends Weblibrary {
	//Leave Type field
		
		//from date field
		@FindBy(xpath = "")
		public static WebElement edit_fromDate;
		
		//To date field
		@FindBy(xpath = "")
		public static WebElement edit_toDate;
		
		//Checkbox field
		@FindBy(xpath = "//textarea[@id='applyleave_txtComment']")
		public static WebElement insert_toComment;
		
		//Search button field
		@FindBy(xpath = "//input[@id='applyBtn']")
		public static WebElement btn_Apply;
		
		//Reset button field
		@FindBy(xpath = "//input[@id='applyBtn']")
		public static WebElement btn_Apply;
				
		
		
		

		//==============================================
		
		public static void MyLeavePage(){
			boolean status;
			
			status = selectByText(dd_LeaveType, "Annual Leave");
			logEvent(status, "Leave type selected", "Leave type not selected");
			
			status = setTextandEscape(edit_fromDate, "2019-10-26");
			logEvent(status, "From date entered", "From date not entered");
			
			status = setTextandEscape(edit_toDate, "2019-10-26");
			logEvent(status, "To date entered", "To date not entered");
			
			status = setTextandEscape(insert_toComment, "This is is annual leave page");
			logEvent(status, "Comments entered successfully", "Comments not entered");
			
			status = clickElement(btn_Apply);
			logEvent(status, "Apply button clicked", "Apply button not clicked");
			
		}
		
		//==============================================
		
	
	
	

}
