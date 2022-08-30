package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTheText {
	
	@FindBy(xpath = " //span[contains(@class,'_2EQ3T')]")
	private WebElement checktext;
	
	public VerifyTheText(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	public String secureCheckout() {
		String title = checktext.getText();
		return title;
		
	}

}
