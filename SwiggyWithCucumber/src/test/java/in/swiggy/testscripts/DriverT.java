package in.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.FoodMenu;
import in.swiggy.pages.Landingpage;
import in.swiggy.pages.PopularRestaurants;
import in.swiggy.pages.VerifyTheText;

public class DriverT extends ToolsT {
	 protected static Landingpage landingpage;
	 protected static PopularRestaurants restaurant;
	 protected static FoodMenu menu;
	 protected static VerifyTheText text;
	 public static void init() {
	 
	System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	driver = new ChromeDriver();
	 landingpage = new Landingpage(driver);
	 restaurant = new PopularRestaurants(driver);
	 menu = new FoodMenu(driver);
	 text = new VerifyTheText(driver);
	
	 }

}
