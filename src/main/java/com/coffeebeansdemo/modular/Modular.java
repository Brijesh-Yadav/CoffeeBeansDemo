package com.coffeebeansdemo.modular;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.coffeebeansdemo.driver.Driver;

public class Modular extends Driver{
	
	//Highlight webElement
	public void highLightElement(By by){
		WebElement ele = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
	
	public void wait_(int sec){
		try{
			Thread.sleep(sec*1000);
			System.out.println("waited for "+sec+" sec");
		}catch(Exception e){
			e.getMessage();
		}
	}
	
	public void waitForElement(By by, int time){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public void custom_waitForElement(By by, int time){
		int rst = 0;
		for(int i=0; i<=time; i++){
			List<WebElement> listobjs = driver.findElements(by);
			if(listobjs.size()>0){
				System.out.println("Element found!!");
				rst =1;
				break;
			}else{
				System.out.println("waiting for element to present !!..");
				wait_(1);
			}
		}
		
		if(rst!=1){
			System.out.println("Element not found!!");
		}
	}

	
}
