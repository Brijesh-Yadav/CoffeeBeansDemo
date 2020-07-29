package com.coffeebeansdemo.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.coffeebeansdemo.driver.BaseClass;
import com.coffeebeansdemo.modular.Modular;

public class ResultPage extends BaseClass {

	// Page Object Property
	By departTable = By.xpath("(//*[@id='flightForm']/section[2]/div[4]/div[1]/nav/ul)[2]");
	By returntable = By.xpath("//*[@id='flightForm']/section[2]/div[4]/div[2]/nav/ul");
	
	Modular md = new Modular();
	
	public void compatePriceInDepartSearchedResult(){
		System.out.println("compatePriceInDepartSearchedResult ");
		md.custom_waitForElement(departTable,10);
		WebElement element = driver.findElement(departTable);
		List<WebElement> listelement = element.findElements(By.tagName("li"));
		System.out.println("Total Flights "+listelement.size());
		
		for(int i=0; i<listelement.size(); i++){
			WebElement flightObj = listelement.get(i);
			List<WebElement> listchilds = flightObj.findElements(By.xpath("div/label/table/tbody/tr[1]/th"));
			System.out.println("TH size "+listchilds.size());
			System.out.println("Price "+listchilds.get(5).getText());
			
//			for(int j=0; j<listchilds.size(); j++){
//				System.out.println("Col "+j);
//				WebElement flightdetails = listchilds.get(j);
//				String data = flightdetails.getText();
//				System.out.println("details "+data);
//			}
		}
	}
	
	
	public void returnWebElementRef_flightResult(){
		String ele1  = "//*[@id='root']/div/main/div/div/div[2]/div[2]/div[10]/div[1]/div[1]/div/div/div[1]";
		
	}

}
