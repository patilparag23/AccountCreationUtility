package com.cts.beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver = null;

	

	public static WebDriver getDriver() {
		return new FirefoxDriver();
	}

	
}
