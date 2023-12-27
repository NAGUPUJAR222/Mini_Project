package com.newtour.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_Rentals {
	

	 WebDriver driver;
	 
	 
		//creating constructor
		public Car_Rentals(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Hotels")
		WebElement carRental;
		
		public void clickCarRentals()
		{
			carRental.click();
			String cr = driver.findElement(By.xpath("//p[@align='left']")).getText();
			System.out.println(cr);
		}
		
		@FindBy(xpath="//img[@src='images/home.gif']")
		WebElement back;
		
		public void backHome()
		{
			back.click();
			
		}

}
