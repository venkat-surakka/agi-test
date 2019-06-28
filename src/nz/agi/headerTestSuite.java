package nz.agi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class headerTestSuite 
{
	WebDriver driver;
	
	// Comments added by Venkat Surakka

	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\eclipse neon\\drivers\\chromedriver.exe"); 		
		driver = new ChromeDriver();  
	}
	
	@Test
	public void verifyHomePageImageTest() 
	{
		String expectedImageSrc = "https://www.radionz.co.nz/x/logos/rnz-1f117f9f2e66fb9e1c6c1f94daaffc079c4bee6bbfb68590bd63edce24b0dd17.svg";


		driver.get("https://www.radionz.co.nz/");
		Assert.assertTrue(driver.getTitle().contains("Radio"));

		// Company Logo
		String actualImgSrc = driver.findElement(By.xpath("//img[@alt='RNZ']")).getAttribute("src");
		Assert.assertEquals(actualImgSrc, expectedImageSrc);
	}


	@Test
	public void verifyHeaderTest()
	{
		String expHeader1 = "NewsXYZ";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\eclipse neon\\drivers\\chromedriver.exe"); 		
		driver = new ChromeDriver();  

		driver.get("https://www.radionz.co.nz/");
		Assert.assertTrue(driver.getTitle().contains("Radio"));

		// Header links
		String actualHeader1 = driver.findElement(By.xpath("//ul[@class='nav-menu']//a[@href='/news']")).getText();
		Assert.assertEquals(actualHeader1, expHeader1);

	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver = null;
		
	}
}
