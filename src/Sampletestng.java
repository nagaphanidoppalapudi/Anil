import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Sampletestng {

	public WebDriver driver;
	
	@BeforeMethod
	
	public void login(){
		
    System.setProperty("webdriver.chrom.driver","D:\\TESTING\\chromedriver_win32.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
    
    driver.get("http://www.testingmasters.com/hrm");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	}
	
	
    @Test(priority=1)
    public void applayleave(){
    driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();	
    driver.findElement(By.xpath("//a[text()='Apply']")).click();	  
    }
    
}
