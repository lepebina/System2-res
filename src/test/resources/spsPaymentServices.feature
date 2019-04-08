Feature: As a QA Engineer I want to Add, Edit Credit Cards for Subscription and Capture and Sign in Payments.

#@chosen
@target-H1-yet-another
  Scenario: Capture payment from the payment Services 
    As a SPS User I want to capture payment from the payment Services - "Capture Paments".

    Given I am Utilizing SPS Payment Service to Get "Capture Payment"
    When I am Calling The Capture Payment Service End Point
    Then I Should Suppose to Get "Success Capture Payment" in response.   
   
   @injected
   Scenario: Grasp payment from the payment Services-10
   Given SPS Payment Service is being executed to gain "Capture Payment"
   When The Capture Payment Service End Point is being invoked
   Then "Success Capture Payment" is received as the result
    
    @injected
    Scenario: Tracking payment-8
     Given I use SPS Payment Service to track payment
     When Capture payment Service end point is initiated
     Then the payment is tracked
     And the process confirmation message is displayed
    

  @original
  Scenario: Sign in payment from the sign in Payment Services 
    As a SPS User I want myself sign in payment from the sign in Payment Services - "Sign in Payment".

    Given I am Utilizing SPS Payment Service to Get "Sign in Payment"
    When I am Calling The Sign in Payment Service End Point
    Then I Should Suppose to Get "Sign in Payment Info" in response.

  #@chosen
@target
  Scenario: Add credit card from the subscription Services 
    As a SPS User I want to add credit card from the subscription Services - "Add Credit Card".

    Given I am Utilizing SPS Service to "Add Credit Card".
    When I am Calling Add Credit Card to Subscription Service End Point
    Then I Should Suppose to Get "Success - Credit Card Added" in response.
    
    @injected
    Scenario: Add credit card from the subscription service-5
	Given credit card expire date is not passed
	And is enabled for online transactions
    When I add credit card from the subscription services
    Then my card is added
    
    @injected
    Scenario: The process of adding credit card from the subscription Services-7   
   Given I issue SPS Service command to "Add Credit Card".
   When "Add Credit Card to Subscription Service End Point" called
   Then  "Success - Credit Card Added" should be the notification
    
    @injected
    Scenario:  Payment services Credit card option
    Given Links to update existing credit card, add credit card and delete credit card-6
    When I click credit card option
    Then  The failed or Success message should be displayed after selected  transaction
