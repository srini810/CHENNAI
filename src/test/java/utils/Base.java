package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base{

static WebDriver Driver;

	public static WebDriver launchBrowser()
	{	
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();	
		return Driver;
	}
	
	public void openUrl(String url)
	{
		Driver.manage().window().maximize();
		Driver.get(url);		
	}
	
	public void send(WebElement Element,String Value)
	
	{
		Element.sendKeys(Value);
	}
	
	public void tap(WebElement Element)
	{
		Element.click();
	}
	
	public static void closeBrowser()
	{
		Driver.quit();
	}
	
	public void screenshot(String path)
	{
		TakesScreenshot tk=(TakesScreenshot)Driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dest = new File(path);
try {
	FileHandler.copy(src, dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	}
	
}



 