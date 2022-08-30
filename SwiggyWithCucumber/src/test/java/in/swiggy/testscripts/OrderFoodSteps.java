package in.swiggy.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends DriverT {
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
		
	   	}

	@When("the user type the location\\/place for food delivery")
	public void the_user_type_the_location_place_for_food_delivery() {
		landingpage.typeTheText();
		
	}

	@When("the user clicks on the location from the displayed list of location")
	public void the_user_clicks_on_the_location_from_the_displayed_list_of_location() {
		landingpage.clickOnBangalore();
		
	    
	}

	@When("the user clicks on the first avaliasble restaurant")
	public void the_user_clicks_on_the_first_avaliasble_restaurant() {
		restaurant.selectTheFirstRestaurant();
	    
	}

	@When("the user sees the first avaliable food in the restaurant and clicks on the add button")
	public void the_user_sees_the_first_avaliable_food_in_the_restaurant_and_clicks_on_the_add_button() {
     	menu.firstFoodItem();
     	//menu.addFood();
	}



	@When("the user clicks on the checkout button")
	public void the_user_clicks_on_the_checkout_button() {
		menu.foodCheckout();
	    
	}

	@Then("the user should be able to order a food sucessfully")
	public void the_user_should_be_able_to_order_a_food_sucessfully() {
     	String expectedTitle = "SECURE CHECKOUT";
		String actualTitle = text.secureCheckout();
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}


}
