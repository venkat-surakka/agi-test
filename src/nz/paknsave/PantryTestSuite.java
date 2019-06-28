package nz.paknsave;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import nz.agi.utils.AGIUtilities;
import nz.paknsave.pages.HomePage;
import nz.paknsave.pages.PantryPage;

public class PantryTestSuite 
{
	/*
	WebDriver driver;
	String APP_URL = "https://www.paknsaveonline.co.nz/?_ga=2.62074348.1541430577.1556862836-983877644.1556862836";
	HomePage HomePO;
	PantryPage PantryPO;

	@BeforeSuite
	public void setup()
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\eclipse neon\\drivers\\chromedriver.exe"); 		
//		driver = new ChromeDriver(); 
		
		HomePO = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Test
	public void pantryTests() throws Exception
	{
		HomePO.LaunchHomePage(APP_URL);
		
		HomePO.ClosePopup();
		
		PantryPO = HomePO.GotoPantryPage();
		
		PantryPO.GoToCereals();
	}
	*/
	
	
	@Test
	public void testDates()
	{
		System.out.println("Date returned is: " + AGIUtilities.getData(0));

		System.out.println("Date returned is: " + AGIUtilities.getData(1));

		System.out.println("Date returned is: " + AGIUtilities.getData(-1));
	}
	
}
