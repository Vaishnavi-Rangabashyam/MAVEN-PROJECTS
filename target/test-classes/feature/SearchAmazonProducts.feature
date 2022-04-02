Feature: Feature containing searching amazon product functionalities 
Scenario Outline: Launch amazon website
Given user launches chrome and navigate to url
When user enters product name as "<ProductName>"
Then search should be successful
Examples:
        |ProductName|
        |iphone|
        |RedMi|
        |WashingMachine|