package com.coffeebeansdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.coffeebeansdemo.driver.BaseClass;
import com.coffeebeansdemo.modular.Modular;
import com.coffeebeansdemo.utility.Utilityfunctions;

public class HomePage extends BaseClass {

	// Page Object Property
	By logo = By.xpath("//span[@class='cleartripLogo']");
	By flight_lnk = By.xpath("//*[@id='Home']/div/aside[1]/nav/ul[1]/li[1]/a[1]");
	By roundtrip = By.xpath("//*[@id='RoundTrip']");
	By from_entervalue = By.xpath("//input[@id='FromTag']");
	By fromoSelectption = By.xpath("//*[@id='ui-id-1']/li[1]/a");
	
	By Totag = By.xpath("//input[@id='ToTag']");
	By ToSelectption = By.xpath("//*[@id='ui-id-2']/li[1]/a");
	
	//date picker
	By departtag = By.xpath("//input[@id='DepartDate']");
	By retruntag = By.xpath("//*[@id='ReturnDate']");
	
	//search button
	By srchbtn = By.xpath("//*[@id='SearchBtn']");
	
	// Modular Actions
	Modular md = new Modular();

	// check successful launched application
	public void successfullylauchedApplication() {
		WebElement ele = driver.findElement(logo);
		boolean resutl = ele.isDisplayed();
		if(resutl!=true){
			System.out.println("Application is not lauched !!");
		}else{
			System.out.println("Application is lauched successfully!!");
		}
	}
	
	public void click_flightOption(){
		WebElement ele = driver.findElement(flight_lnk);
		ele.click();
		System.out.println("clicked on flight option");
	}
	
	public void select_roundtripOption(){
		WebElement ele = driver.findElement(roundtrip);
		ele.click();
		System.out.println("round trip option is selected");
	}
	
	public void selectFromOption(String city){
		WebElement fromfield = driver.findElement(from_entervalue);
		fromfield.sendKeys(city);
		md.wait_(4);
		WebElement fromfield_ = driver.findElement(fromoSelectption);
		fromfield_.click();
		System.out.println("From value is entered");
	}
	
	public void selectToOption(String city){
		WebElement fromfield = driver.findElement(Totag);
		fromfield.sendKeys(city);
		md.wait_(4);
		WebElement fromfield_ = driver.findElement(ToSelectption);
		fromfield_.click();
		System.out.println("To value is entered");
	}
	
	public void selectFromDate(){
		WebElement fromdate = driver.findElement(departtag);
		fromdate.clear();
		String date = Utilityfunctions.getTodysDate();
		fromdate.sendKeys(date);
		md.wait_(4);
		System.out.println("from date is entered "+date);
	}
	
	public void selectreturnDate(){
		WebElement returnfield = driver.findElement(retruntag);
		returnfield.clear();
		String date = Utilityfunctions.getFutureDate(7);
		returnfield.sendKeys(date);
		md.wait_(4);
		System.out.println("return date is entered "+date);
	}
	
	public void click_srchbuton(){
		WebElement src = driver.findElement(srchbtn);
		src.click();
		md.wait_(20);
		System.out.println("Search button is clicked");
	}
	
	


}
