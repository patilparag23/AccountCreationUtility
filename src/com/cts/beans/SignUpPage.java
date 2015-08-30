package com.cts.beans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
  WebDriver driver ;
	// WebElement firstName=driver.findElement(By.id("FirstName"));
//	 WebElement lastName=driver.findElement(By.id("LastName"));
//	 WebElement GmailAddress=driver.findElement(By.id("GmailAddress"));
//	 WebElement Passwd=driver.findElement(By.id("GmailAddress"));
//	 WebElement PasswdAgain=driver.findElement(By.id("GmailAddress"));
//	 WebElement birthMonth=driver.findElement(By.id("GmailAddress"));
//	 WebElement birthMonthSelect=driver.findElement(By.id("GmailAddress"));
//	 WebElement BirthDay=driver.findElement(By.id("GmailAddress"));
//	 WebElement BirthYear=driver.findElement(By.id("GmailAddress"));
//	 WebElement gender=driver.findElement(By.id("GmailAddress"));
//	 WebElement genderSelect=driver.findElement(By.id("GmailAddress"));
//
//	 WebElement RecoveryPhoneNumber=driver.findElement(By.id("GmailAddress"));
//	 WebElement RecoveryEmailAddress=driver.findElement(By.id("GmailAddress"));
//	 WebElement TermsOfService=driver.findElement(By.id("GmailAddress"));
//	 WebElement submitbutton=driver.findElement(By.id("GmailAddress"));
//	
//	
public SignUpPage(WebDriver webDriver) {
	this.driver = webDriver;
}

	public void enterText(String text)
	{
		
	}

	public  void enterFirstName(String fName) {
		driver.findElement(By.id("FirstName")).sendKeys(fName);
		
	}
	
	public  void enterLastName(String lName) {
		driver.findElement(By.id("LastName")).sendKeys(lName);
			
		}

	public void enterDesiredUsername(String username) {
		driver.findElement(By.id("GmailAddress")).sendKeys(username);
		
	}

	public void enterPassword(String password) {
		driver.findElement(By.id("Passwd")).sendKeys(password );
		
	}

	public void reEnterPassword(String rePass) {
		driver.findElement(By.id("PasswdAgain")).sendKeys(rePass);
		
	}

	public void clickOnBirthMonth() {
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		
	}

	public void selectBirthMonthByInt(int i) {
		driver.findElement(By.xpath(".//*[@id=':"+i+"']/div")).click();
		
	}

	public void enterBirthDay(String date) {
		driver.findElement(By.id("BirthDay")).sendKeys(date);
		
	}

	public void enterBirthYear(String year) {
		driver.findElement(By.id("BirthYear")).sendKeys(year);
		
	}
	public WebElement getBirthYear()
	{
		return driver.findElement(By.id("BirthYear"));
	}

	public void clickOnGender() {
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
		
	}

	public void enterGenderAlphabet(String gender) {
		driver.findElement(By.xpath(".//*[@id='Gender']/div[2]/div[@id=':"+gender+"']")).click();
		
	}

	public void enterRecoveryPhoneNumber(String phone) {
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(phone);
		
	}

	public void enterRecoveryEmailAddress(String email) {
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(email);
		
	}

	public void clickOnTermOfService() {
		driver.findElement(By.id("TermsOfService")).click();
		
		
	}

	public void clickOnSubmitButton() {
		driver.findElement(By.id("submitbutton")).click();
		
	}
}
