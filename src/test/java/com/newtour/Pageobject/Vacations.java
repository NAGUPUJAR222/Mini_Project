package com.newtour.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vacations {
	
	WebDriver driver;
	 
	 
	//creating constructor
	public Vacations(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Vacations")
	WebElement vacc;
	
	public void clickVaccation()
	{
		vacc.click();
		String vac = driver.findElement(By.xpath("//p[@align='left']")).getText();
		System.out.println(vac);
	}
	
	@FindBy(xpath="//img[@src='images/home.gif']")
	WebElement back;
	
	public void backHome()
	{
		back.click();
		
	}

}
