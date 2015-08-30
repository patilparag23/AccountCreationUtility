package com.cts.beans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccountPage {
	WebDriver driver;
	

	public CreateAccountPage(WebDriver webDriver) {
		driver = webDriver;

	}

	public void clickOnLink() {
		driver.findElement(By
				.linkText("Create account")).click();
	}

}
