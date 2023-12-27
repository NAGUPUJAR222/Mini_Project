package com.newtour.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsRegister {
	
	 WebDriver driver;
	 
	 
		//creating constructor
		public FlightsRegister(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Flights")
		WebElement flight;
		
		public void clickFlight()
		{
			flight.click();
		}
		
		
		//FILLING THE FLIGHT DETAILS
		
		@FindBy(xpath="(//input[@name='tripType'])[2]" )
		WebElement rdbtn;
		
		public void type()
		{
			rdbtn.click();
			
		}
		
		
		@FindBy(name="passCount" )
		WebElement passcnt;
		
		public void passCount(String pc)
		{
			passcnt.click();
			
		}

		
		
		@FindBy(name="fromPort" )
		WebElement frmport;
		
		public void departFrom(String df)
		{
			frmport.click();
			
		}

		
		
		@FindBy(name="fromMonth" )
		WebElement frmmonth;
		
		public void month(String month)
		{
			frmmonth.click();
			
		}

		
		
		@FindBy(name="fromDay" )
		WebElement frmday;
		
		public void day(String day)
		{
			frmday.click();
			
		}
		
		@FindBy(name="toPort" )
		WebElement toPort;
		
		public void toport(String ar)
		{
			toPort.click();
			
		}
		
		
		@FindBy(name="toMonth" )
		WebElement tomnth;
		
		public void tomonth(String mn)
		{
			tomnth.click();
			
		}
		
		@FindBy(name="toDay" )
		WebElement toDay;
		
		public void today(String dr)
		{
			toDay.click();
			
		}
		
		
		//PREFERNCES FOR THE CUSTOMER TO SELECT THE FLIGHT
		
		@FindBy(xpath="(//input[@name='servClass'])[3]" )
		WebElement fstclass;
		
		public void firstClass()
		{
			fstclass.click();
			
		}
		
		@FindBy(name="airline" )
		WebElement airline;
		
		public void airLine(String al)
		{
			airline.click();
			
		}
		
		@FindBy(name="findFlights" )
		WebElement cont;
		
		public void ClickCont()
		{
			cont.click();
			String text = driver.findElement(By.xpath("//p[@align='left']")).getText();
			System.out.println(text);
			
			
		}
		
		@FindBy(xpath="//img[@src='images/home.gif']")
		WebElement back;
		
		public void backHome()
		{
			back.click();
		}
		
		


}
