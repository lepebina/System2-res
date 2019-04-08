Feature: As QA Engineer I want to Add Credit Card to Wallet, Update or Edit Credit Card Information, Get number of Credit Cards in the Wallet
 & it's Info and Delete Credit Card from the Wallet, in order to Validate the End to End Testing of Submitting orders and Make Payments.

#@chosen
 @original
Scenario: Add credit card to wallet using sps wallet services
As a SPS User I want to add credit card to wallet using sps wallet services - "Create user, Access to Account & Add Credit Card to Wallet". 
	Given I am Using SPS Wallet Service to "Add Crdit Card" 
	When I am Calling the Add Credit Card to Wallet Service End Point 
	Then Should Get the "Added Credit Card In the Wallet" in response.

#@chosen
@target-wallet
Scenario: Get the number of cards in wallet and its Info using sps wallet services
As a SPS User I want to get the number of cards in wallet and its Info using sps wallet services - "Create user, Access to Account, Add Credit Card & Get the Card Info". 
	Given I am Using SPS Wallet Service to "Get Crdit Card Info" 
	When I am Calling the Get Credit Card Service End Point 
	Then Should Get the "Credit Card Info from the Wallet" in response.
	
	@injected
	Scenario: retrieve number of cards in a wallet and their info using sps wallet services-5
	Given sps wallet services are up and running
	And i have right to access sps wallet services
	And i am authorised to view card and wallet details
	When i am calling sps wallet service
	Then a number of cards is displayed
	And information of each card is printed along with it
	
	@injected 
	Scenario: The task to Get the number of cards in wallet and its Info using sps wallet services-7
	Given SPS Wallet Service is the choice used to "Get Crdit Card Info"
	When I am peforming the Get Credit Card Service End Point
	Then my reply should be "Credit Card Info from the Wallet"	
	
	@injected
	Scenario: User cards details-6
    Given The link to user cards
    When I am requesting user cards
	Then I should receive the number cards and their details
	
 @original
Scenario: Delete a credit card from the wallet using sps wallet services
As a SPS User I want to delete a credit card from the wallet using sps wallet services - "Create user, Access to Account, Add Credit Card & Delete the Card". 
	Given I am Using SPS Wallet Service to "Delete Crdit Card" 
	When I am Calling the Delete Credit Card Service End Point 
	Then Should Get the "Deleted - No Credit Card Info" in response. 