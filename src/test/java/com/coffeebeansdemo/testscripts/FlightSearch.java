package com.coffeebeansdemo.testscripts;

import org.testng.annotations.Test;
import com.coffeebeansdemo.driver.BaseClass;
import com.coffeebeansdemo.pageobjects.HomePage;
import com.coffeebeansdemo.pageobjects.ResultPage;

public class FlightSearch extends BaseClass{
	
	HomePage hm = new HomePage();
	ResultPage rp = new ResultPage();
	
	@Test(priority=0)
	public void navigateToApplication(){
		hm.successfullylauchedApplication();
	}
	
	@Test(priority=1)
	public void selectDestination(){
		hm.click_flightOption();
		hm.select_roundtripOption();
		hm.selectFromOption("Delhi");
		hm.selectToOption("Mum");
	}
	
	@Test(priority=2)
	public void selectDate_Price_Stoppage_roundtrip(){
		hm.selectFromDate();
		hm.selectreturnDate();
		hm.click_srchbuton();
		rp.compatePriceInDepartSearchedResult();
	}
	
	@Test(priority=3)
	public void selectFligtfromResutlt_roundtrip(){
		
	}
	
	@Test(priority=4)
	public void validate_pricesSumOfBooking_roundtrip(){
		
	}

}
