package com.cts.beans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyPhonePage {

	WebDriver driver ;
	
	public VerifyPhonePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickVerify() {
		driver.findElement(By.name("VerifyPhone")).click();
		
	}

	

}
