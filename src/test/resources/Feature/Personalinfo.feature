@smoke
Feature: providing personal information 
Scenario:  providing only mandatory details
Given user is on Passengers Info page
When user enters "<firstName>", "<lastName>", "<emailid>", "<phoneNo>", "<mobileNo>", "<address>", "<address2>", "<city>" and "<postalCode>"   
| firstname | lastname | emailid | phoneNo | mobileNo | address | address2 | city | postal |
| Prabhu | deva | prabhu@gmail.com | 7564809876 | 7564809876 | addressline1 | addressline2 | cityName | 600075 |
Then User can able to know the total fare 
