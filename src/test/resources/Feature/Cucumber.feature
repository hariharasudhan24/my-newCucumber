@regression
Feature: Booking for a trip
Scenario Outline: Entering neccessry details needed for traveling 
	Given user is on home page 
	When user enters "<from-place>" , "<to-place>" , "<month>" and <date>    
	Then user can able to find flights 
	
	Examples:
	| from-place | to-place | month  | date |
	| Cooktown | Kowanyama | December| 7 |
	| Coconut Island | Kubin Village | January | 14 |
	| Horn Island | Darnley Island | October | 17 |
	| Townsville | Mabuiag Island | November | 30 |
	| Yam Island | Saibai Island | December | 25 |
	
