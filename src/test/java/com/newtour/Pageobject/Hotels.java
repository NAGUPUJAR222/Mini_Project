package com.newtour.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotels {
	
	 WebDriver driver;
	 
	 
		//creating constructor
		public Hotels(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Hotels")
		WebElement hotels;
		
		public void clickHotel()
		{
			hotels.click();
			String ht = driver.findElement(By.xpath("//p[@align='left']")).getText();
			System.out.println(ht);
		}
		
		@FindBy(xpath="//img[@src='images/home.gif']")
		WebElement back;
		
		public void backHome()
		{
			back.click();
			
		}
		
		

}
