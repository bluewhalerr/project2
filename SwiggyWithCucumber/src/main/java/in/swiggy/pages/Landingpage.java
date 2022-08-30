package in.swiggy.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Landingpage {

	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(xpath = "//span[contains(text(),'Bangalore, Karnataka, India')]")
	 List<WebElement> list;
	
	
	public Landingpage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	public void typeTheText()  {
		location.sendKeys("Bangalore");
	}
	
	public void clickOnBangalore() {
		
		//tabindex.findElements((By) tabindex);
		
		List <WebElement> list1= list;
		
		String select = "Bangalore";
		
		for (WebElement ele: list1) {
			
			String getOptions = ele.getText();
			
			if(getOptions.contains(select)) {
				
				ele.click();
				break;
			}
		}
		
	}
	
		
	}
	
		

