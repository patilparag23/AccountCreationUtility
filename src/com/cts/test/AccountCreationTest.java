package com.cts.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cts.beans.CreateAccountPage;
import com.cts.beans.Driver;
import com.cts.beans.NextPage;
import com.cts.beans.SignUpPage;
import com.cts.beans.VerifyPhonePage;

public class AccountCreationTest {

	public WebDriver driver;

	@Before
	public void intialization() {

		driver = Driver.getDriver();
		String baseUrl = "https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@Test
	public void signUpTest() throws InterruptedException {
		System.out.println("driver is " + driver.getTitle());
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);

		createAccountPage.clickOnLink();
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.enterFirstName("parag");
		signUpPage.enterLastName("patil");

		signUpPage.enterDesiredUsername("mnbcfdjsadsds");
		signUpPage.enterPassword("pioneer123#");
		signUpPage.reEnterPassword("pioneer123#");
		signUpPage.clickOnBirthMonth();
		signUpPage.selectBirthMonthByInt(2);
		signUpPage.enterBirthDay("16");
		signUpPage.enterBirthYear("1999");
		int birthYear = Integer.parseInt(signUpPage.getBirthYear()
				.getAttribute("value"));
		if (birthYear > 2000 || birthYear == 2000) {
			Assert.assertTrue(false);
		}
		signUpPage.clickOnGender();
		signUpPage.enterGenderAlphabet("f");
		signUpPage.enterRecoveryPhoneNumber("9604966400");
		signUpPage.enterRecoveryEmailAddress("patil.parag23@gmail.com");
		Thread.sleep(10000);
		System.out
				.println("Enter the capcha manually and wait for 10 seconnds");
		Thread.sleep(10000);
		signUpPage.clickOnTermOfService();
		signUpPage.clickOnSubmitButton();
		NextPage nextPage = new NextPage(driver);
		nextPage.clickOnNextPage();
		System.out
				.println("Enter the verification code sent on ur registered mobile number");
		Thread.sleep(25000);
		VerifyPhonePage verifyPhonePage = new VerifyPhonePage(driver);
		verifyPhonePage.clickVerify();
		System.out.println("your id is sucessfuly created");

	}

}
