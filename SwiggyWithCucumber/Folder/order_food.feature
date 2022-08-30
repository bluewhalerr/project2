Feature: Order Food

@TC_102

Scenario: A user should be able to order a food sucessfully on Swiggy
Given a user is on the landing page of Swiggy
When the user type the location/place for food delivery
And the user clicks on the location from the displayed list of location
And the user clicks on the first avaliasble restaurant
And the user sees the first avaliable food in the restaurant and clicks on the add button
And the user clicks on the checkout button
Then the user should be able to order a food sucessfully