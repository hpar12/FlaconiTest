# Flaconi Customer Journey
The application when executed runs a test suite that ensures that the following scenarios is working as expected

    user visits https://www.flaconi.de
    user wants to buy perfume
    user adds perfume to cart
 
## Prerequisites
Eclipse IDE or IntelliJ IDE
GitHub Repository : git@github.com:hpar12/FlaconiTest.git
Download the repository to a specified directory in your system.

Maven dependencies are specified in the pom.xml file (i.e. junit, selenium-java, cucumber-reporting etc.)

## Assumptions
The user already has a registered account with Flaconi updated with address details.
The user will enter his/her date of birth before making the payment.
The user has a preferred method of payment to complete the transaction.

## Running the Application
Goto the TestRunner.java and Run As JUnit Test.

Note: Before running the test make sure to set/change the directory to where the customer journey file is located.
i.e. features = "/Users/Hariharan/git/FlaconiTest/FlaconiTest/src/main/java/customerJourney"

Right click and select 'Run As' and click on 'JUnit Test'

You will notice that the tests will start executing one after the other and will display the test passed message once completed.

By default the entire customer journey (split into 2 scenarios will execute). If you need to run tests under one particular scenario, then change the tag (remove either one of the scenarios) in the TestRunner.java file 
tags = { "@BuyPerfume, @AddToCart" }

## Test Report
After the tests have been executed , navigate to /FlaconiTest/target/test-output/ and double-click on the 'index.html' to view the test report for the customer journey.

### Author
Hariharan Parasuraman

### References
https://www.toolsqa.com/
Naveen Automation Labs - https://www.youtube.com/channel/UCXJKOPxx4O1f63nnfsoiEug