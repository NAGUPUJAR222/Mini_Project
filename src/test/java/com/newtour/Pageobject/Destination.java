package com.newtour.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Destination {
	
	 WebDriver driver;
	 
	 
		//creating constructor
		public Destination(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Destinations")
		WebElement dest;
		
		public void clickDest()
		{
			dest.click();
			String dt = driver.findElement(By.xpath("//p[@align='left']")).getText();
			System.out.println(dt);
		}
		
		@FindBy(xpath="//img[@src='images/home.gif']")
		WebElement back;
		
		public void backHome()
		{
			back.click();
			
		}

}
