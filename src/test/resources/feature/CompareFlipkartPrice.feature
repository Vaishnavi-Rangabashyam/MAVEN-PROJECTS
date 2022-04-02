Feature: Functionalities of flipkart compare values

@Flip
Scenario Outline: Flipkart Compare price

Given user launches url
When enter user and pwd and login
|user|pwd|
|<UserName>|<Password>|
When user enters search element
When user click price low to high and sort
When Select Highest price
When verify the actual price
When compare to the expected price and print the price
And add to cart and check the name of the product and price is same or not in selected page


Examples:
|UserName|Password|
|9360330288|Pik@chu5|

