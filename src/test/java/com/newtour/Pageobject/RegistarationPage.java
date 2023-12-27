package com.newtour.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistarationPage {
	
	 WebDriver driver;
	 
	 
	//creating constructor
	public RegistarationPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//CLICKING ACTIONS ON WEB ELEMENTS
	
	@FindBy(linkText="REGISTER")
	WebElement reg;
	
	public void clickReg() 
	{
		reg.click();
	}
	
	//FILLING ON CONTACT INFORMATION
	
	@FindBy(name="firstName")
	WebElement fsttbx;
	
	
	@FindBy(name="lastName")
	WebElement lasttbx;
	
	
	@FindBy(name="phone")
	WebElement phtbx;
	
	
	@FindBy(name="userName")
	WebElement emailtbx;
	
	
	public void ContactInfo(String fname,String lname, String ph, String email)
	{
		fsttbx.sendKeys(fname);
		lasttbx.sendKeys(lname);
		phtbx.sendKeys(ph);
		emailtbx.sendKeys(email);
		
	}
	
	//MAILING INFORMATION
	
	@FindBy(name="address1")
	WebElement addtbx1;
	
	
	@FindBy(name="city")
	WebElement citytbx;
	
	
	@FindBy(name="state")
	WebElement statetbx;
	
	
	@FindBy(name="postalCode")
	WebElement postaltbx;
	
	
	@FindBy(name="country")
	WebElement countrytbx;
	
	
	public void Mailing(String add, String city,String state,String pc ,String country)
	{
		addtbx1.sendKeys(add);
		citytbx.sendKeys(city);
		statetbx.sendKeys(state);
		postaltbx.sendKeys(pc);
		countrytbx.click();
	}
	
	//USER INFORMATIONS
	
	@FindBy(name="email")
	WebElement untbx;
	
	@FindBy(name="password")
	WebElement pwtbx;
	
	@FindBy(name="confirmPassword")
	WebElement cptbx;
	
	@FindBy(name="submit")
	WebElement Clickbtn;
	
	public void UserInfo(String un, String pwd,String cp)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		cptbx.sendKeys(cp);
		Clickbtn.click();
		System.out.println("SUCCESSFULLY COMPLETED REGISTRAION");
		
	}
	
	
	
	
	

}
