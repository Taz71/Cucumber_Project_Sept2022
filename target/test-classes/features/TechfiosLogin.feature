@LoginFeature
Feature:Techfios functionality validation

@Scenario1
Scenario:SkyBlue Background
Given "Set Blue Background" button exists
When I click on the button
Then the background colour will change to sky blue

@Scenario2
Scenario: White Background Change
Given "Set SkyWhite Background" button exists
When I click on the button 
Then the background colour will change to white.