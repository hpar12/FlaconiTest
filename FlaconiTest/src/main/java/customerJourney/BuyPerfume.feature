Feature: User wants to buy perfume

@Tag1
Scenario: Buy a perfume by clicking on Parfum link on Flaconi Home Page

Given user in on Flaconi website 
When the user selects the Parfum link
Then chooses a perfume that he wishes to buy

@Tag2
Scenario: Buy a perfume by entering a brand name in the search box 

Given user in on Flaconi website 
When the user searches for a perfume
Then chooses the perfume she wishes to buy
