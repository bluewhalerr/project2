package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopularRestaurants {
	
	@FindBy(xpath = "//div[contains(@class,'_1HEuF')]")
	private WebElement allrestaurants;
	
	public PopularRestaurants(WebDriver driver)  {
		PageFactory.initElements(driver,this);
	
	}
	public void selectTheFirstRestaurant() {
		allrestaurants.click();
	}
}
