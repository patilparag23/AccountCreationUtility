package com.cts.beans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextPage {

	 WebDriver driver ;
	
	
	public NextPage(WebDriver webDriver) {
		
		this.driver = webDriver;
	}


	public void clickOnNextPage() {
		driver.findElement(By.id("next-button")).click();
		
	}
}
