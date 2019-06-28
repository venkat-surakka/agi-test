package nz.agi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homePageSuite 
{
  @Test
  public void verifyHeaderTest()
  {
	  String expHeader1 = "Radioss";
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\eclipse neon\\drivers\\chromedriver.exe"); 		
	  WebDriver driver = new ChromeDriver();  
	  
	  driver.get("https://www.radionz.co.nz/");
	  Assert.assertTrue(driver.getTitle().contains(expHeader1));

	  // Header links
	  String actualHeader1 = driver.findElement(By.xpath("//ul[@class='nav-menu']//a[@href='/radio']")).getText();
	  Assert.assertEquals(actualHeader1, expHeader1);
	  
  }

}
