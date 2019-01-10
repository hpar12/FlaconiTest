Feature: User wants to view the cart

Scenario: View selected item in the cart Test Scenario

Given user has added a perfume to the cart
When the user wants to view the cart
Then clicks on the view cart icon
Then the selected perfume is displayed in the cart
Then close the browser