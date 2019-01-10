Feature: User wants to buy perfume

Scenario: Buy a perfume Test Scenario

Given user launches the Flaconi website on a Chrome browser
When user is on the Flaconi home page
Then user clicks on the Parfum link
Then on the perfume list page selects a perfume by clicking on it
Then adds the perfume to the cart
Then close the browser


Scenario: View selected item in the cart Test Scenario
Given user has added a perfume to the cart
When the user wants to view the cart
Then clicks on the view cart icon
Then the selected perfume is displayed in the cart
Then close the browser