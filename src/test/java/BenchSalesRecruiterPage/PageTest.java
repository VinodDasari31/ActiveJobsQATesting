package BenchSalesRecruiterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTest 
{

	WebDriver driver;
	
	ProfilePage profile;
	
	@BeforeClass
	public void SetUp() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uatapp.activejobs.us/");
		driver.manage().window().maximize();	
		
		profile = new ProfilePage(driver);
	}
	@Test
	void Profile() 
	{
		profile.header();
		profile.layout();
		profile.Email("vinodd.prajosh@gmail.com");
		profile.Password("vinod");
		profile.LoginBtn();
		
		profile.BenchProfile();
		
		profile.RecName("vinod");
		profile.RecMail("vinodd.prajosh@gmail.com");
		profile.RecCode("+91");
		profile.RecContact("987654321");
		profile.WhattsAppNum("987654321");
		profile.RecCompanyName("Pt");
		profile.RecState("AP");
		profile.RecCountry("India");
		profile.RecCity("Gnt");
		profile.LinkedIn("NA");
		profile.RecExperience("10");
		
		
	}
	
	@AfterClass
	void TearDown() {
		
		driver.close();
	}
	
}
