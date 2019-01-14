Feature: User wants to buy perfume

@BuyPerfume
Scenario: Clicking on perfume link on Flaconi Home Page

Given user in on Flaconi website
When the user selects the perfume link
And chooses a perfume that he wishes to buy
Then the user is successfully able to buy the perfume

@BuyPerfume
Scenario: Search for a brand of perfume in the search box 

Given user in on Flaconi website
When the user searches for a perfume
And chooses the perfume she wishes to buy
Then the user is successfully able to buy the perfume