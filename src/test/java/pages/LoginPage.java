package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utils.Base;

public class LoginPage extends Base  {
WebDriver Driver;
	public LoginPage(WebDriver Driver)
	{

		
PageFactory.initElements(Driver,this);


	}
	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getTech() {
		return tech;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath = "//input[@name='name'][1]")
	private WebElement name;
	
	@FindBy(xpath = "//input[@class='wpcf7-form-control wpcf7-text wpcf7-email'][1]")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder='Contact No*'][1]")
	private WebElement contact;
	
	@FindBy(name = "comments")
    private WebElement tech;
	
	@FindBy(xpath = "//input[@type='submit'][1]")
	private WebElement submit;

}
