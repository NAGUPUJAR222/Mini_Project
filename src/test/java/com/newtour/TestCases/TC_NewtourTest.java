package com.newtour.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.newtour.Pageobject.Car_Rentals;
import com.newtour.Pageobject.FlightsRegister;
import com.newtour.Pageobject.RegistarationPage;
import com.newtour.Pageobject.SignOff;
import com.newtour.Pageobject.SigninPage;

public class TC_NewtourTest  extends BaseClass{
	
	@Test(priority = 1)
	public void verifyRegister()
	{
		
		
		
		RegistarationPage rp=new RegistarationPage(driver);
		rp.clickReg();
		
		//contact information 
		
		rp.ContactInfo("Nagaraj", "Pujar", "8217754683", "02nagarajpujar@gmail.com");
		
		//mailing informations
		
		rp.Mailing("LP TOWER MADHAPUR", "HYDERABAD", "KARNATAKA", "56000180","INDIA");
		
		
		//USER INFORMTION
		
		rp.UserInfo("Nagu", "Nagupujar@22", "Nagupujar@22");
	}
	
	
	@Test(priority = 2)
	public void clickOnSignOff()
	{
		SignOff so=new SignOff(driver);
		so.clickSignoff();
		
	}
	
	@Test(priority = 3)
	public void clickOnSignin()
	{
		SigninPage sp=new SigninPage(driver);
		
		sp.sgClick();
		sp.Sigin("Nagu", "Nagupujar@22");
	}
	
	@Test(priority = 4,description = "This is for Flight Registerations")
	public void Flight()
	{
		FlightsRegister fr=new FlightsRegister(driver);
		fr.clickFlight();
		fr.type();
		fr.passCount("2");
		fr.departFrom("New York");
		fr.month("October");
		fr.day("22");
		fr.toport("Paris");
		fr.tomonth("December");
		fr.today("02");
		fr.firstClass();
		fr.airLine("Blue Skies Airlines");
		fr.ClickCont();
		fr.backHome();
		
	}
	
	@Test(priority = 5,description = "This site is for Hotel Enquiries")
	public void Hotels()
	{
		com.newtour.Pageobject.Hotels h=new com.newtour.Pageobject.Hotels(driver);
		h.clickHotel();
		h.backHome();
	}
	
	
	@Test(priority = 6,description = "This site is for Car Rental Enquiries")
	public void carRent()
	{
		Car_Rentals crent=new Car_Rentals(driver);
		crent.clickCarRentals();
		crent.backHome();
	}
	
	
	@Test(priority = 7,description = "This site is for Destination Enquiries")
	public void Destination()
	{
		com.newtour.Pageobject.Destination d=new com.newtour.Pageobject.Destination(driver);
		d.clickDest();
		d.backHome();
				
	}
	
	
	
	@Test(priority = 8,description = "This site is for Vacations Enquiries")
	public void Vacations()
	{
		com.newtour.Pageobject.Vacations vc=new com.newtour.Pageobject.Vacations(driver);
		vc.clickVaccation();
		vc.backHome();
	}
	
	

}
