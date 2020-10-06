@smoke  @sanity 
Feature: Finding flights for the trip
Scenario: finding flights with respect to origin and destination
Given user is on findingflights page
When user provides "<origin>" and "<destination>"
| origin | destination |
| Coconut Island (CNC) | Cairns (CNS) |
| Pormpuraaw (EDR) | Horn Island (HID) |
| Lockhart River (IRG) | Kowanyama (KWM) |
Then user can able into flight booking page
