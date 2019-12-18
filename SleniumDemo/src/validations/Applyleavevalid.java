package validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Applyleavevalid {
public WebDriver driver;
	
	@BeforeTest
	
	public void login() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","D:\\Practice Selenium\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);	
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	
	driver.get("http://testingmasters.com/hrm");
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	Thread.sleep(3000);	
																			}

	@Test
	public void applyleave(){	
		
	driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).click();					
	driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();	
	
	
	boolean b= driver.findElement(By.xpath("//div[@id='content']/div[@id='apply-leave']/div[1]/h1[text()='Apply Leave']")).isDisplayed();
	Assert.assertEquals(b,true);
	
	//if(driver.findElement(By.xpath("//div[@id='content']/div[@id='apply-leave']/div[1]/h1[text()='Apply Leave']")).isDisplayed())
	//{System.out.println("Apply Leave Page is displyed");	}
	//else {System.out.println("failed");	}
	
	//Select s1=new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
	//s1.selectByVisibleText("Personal Leave");
	
	
	
	
	}

	
	@AfterTest
	
	public void logoff() throws InterruptedException {	
	driver.findElement(By.xpath("//a[@id='welcome']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@href='/hrm/symfony/web/index.php/auth/logout']")).click();
	
	driver.close();}

}
