package com.newtour.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "SIGN-ON")
	WebElement sigin;
	
	public void sgClick()
	{
		sigin.click();
		
		
	}
	
	@FindBy(name="userName")
	WebElement untbx;
	
	@FindBy(name="password")
	WebElement pwtbx;
	
	@FindBy(name="submit")
	WebElement submitbtn;
	
	public void Sigin(String un, String pwd)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		submitbtn.click();
		String a = driver.findElement(By.xpath("//h3[.='Login Successfully']")).getText();
		String b = driver.findElement(By.xpath("//b[.=' Thank you for Loggin. ']")).getText();
		System.out.println(a);
		System.out.println(b);
	}
}
