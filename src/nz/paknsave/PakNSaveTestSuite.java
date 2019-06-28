package nz.paknsave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import nz.paknsave.pages.HomePage;

public class PakNSaveTestSuite 
{
	WebDriver driver;
	String APP_URL = "https://www.paknsaveonline.co.nz/?_ga=2.62074348.1541430577.1556862836-983877644.1556862836";
	HomePage HomePO;

	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\eclipse neon\\drivers\\chromedriver.exe"); 		
		driver = new ChromeDriver(); 
		
		HomePO = new HomePage(driver);
	}
	

	@Test
	public void verifyMilkSearchTest() throws Exception
	{
		String testItem = "milk";

		HomePO.LaunchHomePage(APP_URL);
		
		HomePO.ClosePopup();
		
		HomePO.SearchItem(testItem);
	}

	
	@Test
	public void verifyBreadSearchTest() throws Exception
	{
		String testItem = "bread";
		
		HomePO.LaunchHomePage(APP_URL);
		
		HomePO.ClosePopup();

		HomePO.SearchItem(testItem);
	}
	
	@Test
	public void pantryTests() throws Exception
	{
		HomePO.LaunchHomePage(APP_URL);
		
		HomePO.ClosePopup();
		
		HomePO.GotoPantryPage();
	}
	
}
