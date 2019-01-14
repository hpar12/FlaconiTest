Feature: User adds perfume to the cart
@AddToCart
Scenario: A user buys a women's perfume and adds it to cart

Given user launches the Flaconi website
When the user selects perfume for women
And adds it to the cart
Then the perfume is added to the cart

@AddToCart
Scenario: A registered Flaconi user buys a perfume and adds it to the cart

Given user logs into flaconi website
When the user selects a perfume
And adds it to the cart
Then the perfume is added to the cart

@AddToCart
Scenario: User selects a perfume and views the cart continuing shopping

Given user launches the Flaconi website
When the user selects perfume for women
And adds it to the cart
Then checks to see if the perfume selected is in the cart