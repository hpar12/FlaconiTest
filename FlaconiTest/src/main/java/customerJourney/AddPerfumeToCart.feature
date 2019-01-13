Feature: User adds perfume to the cart
@Tag3
Scenario: Choosing a perfume from the beauty bazaar  

Given user launches the Flaconi website 
When the user selects perfume for women 
Then the perfume is added to the cart

@Tag4
Scenario: User logs in and buys a perfume

Given user logs into flaconi website
When the user selects a perfume 
Then the perfume is added to the cart 