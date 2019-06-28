package nz.paknsave.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='fs-tooltip__close-btn']") WebElement btnPopup;
	@FindBy(xpath="//input[@class='fs-search-autocomplete__input']") WebElement txtSearch;
	@FindBy(xpath="//a[@class='fs-search-autocomplete__search-btn']") WebElement lnkSearch;
	@FindBy(xpath="//span[text()='Login or register']") WebElement lnkLogin;
	@FindBy(xpath="//span[text()='Pantry']") WebElement lnkPantry;
	
	public HomePage(WebDriver pDriver)
	{
		this.driver = pDriver;
		PageFactory.initElements(driver, this);
	}
	
	public void LaunchHomePage(String pURL) throws Exception
	{
		driver.get(pURL);
		// Thread.sleep(2000);
	}
	
	public void ClosePopup()
	{
		// Close popup
		btnPopup.click();
	}
	
	public void SearchItem(String searchItem)
	{
		// Enter item
		txtSearch.sendKeys(searchItem);
		
		// Click search button
		lnkSearch.click();
	}
	
	public void ClickLoginResiter()
	{
		lnkLogin.click();
	}
	
	public PantryPage GotoPantryPage()
	{
		lnkPantry.click();
		
		return new PantryPage(driver);
	}
}
