package com.newtour.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOff {
	
	
	WebDriver driver;
	public  SignOff(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="SIGN-OFF")
	WebElement sgbtn;
	
	public void clickSignoff()
	{
		sgbtn.click();
		System.out.println("SUCCESSFULLY LOGGED OFF");
	}
	
	

}
