Feature: Functionalities of flyus seat booking
@FlyusBooking
Scenario Outline: FlyusBooking
Given user launches chrome and navigate to url
When user enters source and destination and click search
|source|destination|
|<Source>|<Destination>|
When user select the flight
When enter the below passenger information
|firstname|lastname|
|Vaishnavi|Rangabashyam|
When user select the seat
Then print the price

Examples:

|Source|Destination|
|Rotterdam, Netherlands - Rotterdam (RTM)|New Delhi, India - Indira Gandhi International Airport (DEL)|
|Chennai, India - Chennai (MAA)|New Delhi, India - Indira Gandhi International Airport (DEL)|

#|FirstName|LastName|
#|Vaishnavi|Rangabashyam|
#|Sangavi|Rangabashyam|