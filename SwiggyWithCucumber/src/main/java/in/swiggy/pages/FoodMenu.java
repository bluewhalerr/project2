package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodMenu {
	@FindBy(xpath = "(//div[contains(@class,'_1RPOp')])[1]")
	private WebElement ADD;
	//@FindBy(xpath = "//div[contains(@class,'_3coNr')]")
	//private WebElement added;
	
	@FindBy(xpath = "//button[contains(@class,'_1gPB7')]")
	private WebElement checkout;
	
	 
	
	public FoodMenu(WebDriver driver)  {
		PageFactory.initElements(driver,this);
	
	}
	
	public void firstFoodItem() {
	ADD.click();
	}
	public void addFood() {
		//added.click();
	}
	
	public void foodCheckout() {
		checkout.click();
		}
		
}
