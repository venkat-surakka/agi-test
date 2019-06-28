package nz.paknsave.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantryPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Breakfast Cereals'") WebElement lnkCereals;
	
	public PantryPage(WebDriver pDriver)
	{
		this.driver = pDriver;
		PageFactory.initElements(driver, this);
	}
	

	public void GoToCereals()
	{
		lnkCereals.click();
	}
}
