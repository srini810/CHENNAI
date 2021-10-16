package greens;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utils.Base;

public class FirstBaseClass extends Base {
	 static WebDriver Driver;
	static LoginPage lp;
	
	@BeforeClass
public static void sample1()
{
Driver=launchBrowser();
 lp = new LoginPage(Driver);



}
	@AfterClass
	public static void sample2()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			closeBrowser();
	}
	@Before
	public  void sample3()
	{
		openUrl("http://www.greenstechnologies.in/");
			
	}
@Test
	public  void sample4()
	{
		//WebElement name=Driver.findElement(By.xpath("//input[@name='name'][1]"));
		send(lp.getName(),"Srinivasan A");
		
		//WebElement email=Driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-text wpcf7-email'][1]"));
		send(lp.getEmail(),"srini@gmail.com");
		
	//	WebElement contact=Driver.findElement(By.xpath("//input[@placeholder='Contact No*'][1]"));
				send(lp.getContact(),"1234567891");
	
				//WebElement tech =Driver.findElement(By.name("comments"));
				send(lp.getTech(),"Selenium");
				
				screenshot("D:\\Screenshot\\Base.png");
		//WebElement submit=Driver.findElement(By.xpath("//input[@type='submit']["));
		tap(lp.getSubmit());
		}	
@Test

public  void sample6()
{
	//WebElement name=Driver.findElement(By.xpath("//input[@name='name'][1]"));
	send(lp.getName(),"Shankar");
	
	//WebElement email=Driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-text wpcf7-email'][1]"));
	send(lp.getEmail(),"shankar@gmail.com");
	
	//WebElement contact=Driver.findElement(By.xpath("//input[@placeholder='Contact No*'][1]"));
			send(lp.getContact(),"1234554321");

			//WebElement tech=Driver.findElement(By.name("comments"));
			send(lp.getTech(),"JAVA");
			screenshot("D:\\\\Screenshot\\Base1.jpg");
			
	//WebElement submit=Driver.findElement(By.xpat("//input[@type='submit'][1]"));
	tap(lp.getSubmit());
	
}
	
@After
public  void sample5()
{
System.out.println("Validation");		

}	
}
