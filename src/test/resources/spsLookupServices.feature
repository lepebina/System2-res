Feature: As a SPS User I want to verify all the lookup services.

  @original
  Scenario: Get all states from the lookup Services 
    As a SPS User I want to get all states from the lookup Services - "Get All States".

    Given I am Using SPS Service to Get "All States"
    When I am Calling The Get All States Service End Point
    Then I should Get all States in response.

  @original
  Scenario: Get all cities by state from the lookup Services 
    As a SPS User I want to get all cities by state from the lookup Services - "Get All Cities by State".

    Given I am Using SPS Service to Get "All Cities by State"
    When I am Calling Get All Cities by State Service End Point
    Then I should Get all Cities in response.

  @original
  Scenario: Get all countries from the lookup Services 
    As a SPS User I want to get all countries from the lookup Services - "Get All Country".

    Given I am Using SPS Service to Get "All Countries"
    When I am Calling Get All Countries Service End Point
    Then I should Get all Countries in response.

  @original
  Scenario: Get all schools by country from the lookup Services 
    As a SPS User I want to get all schools by country from the lookup Services - "Get All Schools by Country".

    Given I am Using SPS Service to Get "All Schools by Country"
    When I am Calling Get All Schools by Country Service End Point
    Then I should Get all Schools by Country in response.

   #@chosen
   
   @original-7-1
  Scenario: Get all schools by zipcode from the lookup Services 
    As a SPS User I want to get all schools by zipcode from the lookup Services - "Get All Schools by Zip Code".

    Given I am Using SPS Service to Get "All Schools by Zip Code"
    When I am Calling Get All Schools by Zip Code Service End Point
    Then I should Get all Schools by Zip Code in response.
    
    @injected-7-1
    Scenario: Using lookup services to get all schools by zipcode-7-1
    Given SPS Service has been used to call "All schools by Zip Code"
    When End Point Zip Code service issued
    Then the result should be all schools by Zip Code
    
    
    @injected-6-1
    Scenario: Using zip code to search all schools which are looking for the services. 
    Given A text field to enter a "Zip code"
    When I am selecting search button/link of all schools using zip code
    Then I must receive a list of schools corresponding to the zip code    

  @original
  Scenario: Get all schools by state and city from the lookup Services 
    As a SPS User I want to get all schools by state and city from the lookup Services - "Get All Schools by State & City".

    Given I am Using SPS Service to Get "All Schools by State and City"
    When I am Calling Get All Schools by State and City Service End Point
    Then I should Get all Schools by State and City in response.

  #@chosen
  @original
  Scenario: Get all teachers of a school from the lookup Services 
    As a SPS User I want to get all teachers of a school from the lookup Services - "Get All Teachers".

    Given I am Using SPS Service to Get "All Teachers"
    When I am Calling Get All Teachers Service End Point
    Then I should Get all Teachers in response.
    
    @injected-7-2
    Scenario: All school teachers querying service-7-2
    Given SPS Service has been used to call "All Teachers"
    When I am performing End Point Zip Code service 
    Then this should return all Teachers
    

  #@chosen
  @original
  Scenario: Get all alternate teachers of a school from the lookup Services 
    As a SPS User I want to get all alternate teachers of a school from the lookup Services - "Get All Alternate Teachers".

    Given I am Using SPS Service to Get "All Alternate Teachers"
    When I am Calling Get All Alternate Teachers Service End Point
    Then I should Get all Alternate Teachers in response.

  @original
  Scenario: Get consumers exposed data from the lookup Services 
    As a SPS User I want to get consumers exposed data from the lookup Services - "Expose Consumer".

    Given I am Using SPS Service to Get "Expose Consumer"
    When I am Calling Expose Consumer Service End Point
    Then I should Get all Expose Consumer data in response.

#@chosen
@original
  Scenario: Get educators exposed data from the lookup Services 
    As a SPS User I want to get educators exposed data from the lookup Services - "Expose Educator".

    Given I am Using SPS Service to Get "Expose Educator"
    When I am Calling Expose Educator Service End Point
    Then I should Get all Expose Educator data in response.

  #@chosen
  @original
  Scenario: Get primary School address from the lookup Services 
    As a SPS User I want to get primary School address from the lookup Services - "Get Primary School Address".

    Given I am Using SPS Service to Get "Primary School Address"
    When I am Calling Get Primary School Address Service End Point
    Then I should Get all Primary School Address in response.

  @original
  Scenario: Get existing shipping address from the lookup Services 
    As a SPS User I want to get existing shipping address from the lookup Services - "Get Existing Shipping Address".

    Given I am Using SPS Service to Get "Existing Shipping Address"
    When I am Calling Get Existing Shipping Address Service End Point
    Then I should Get all Existing Shipping Address in response.

  @original
  Scenario: Get only reading club teachers from the lookup Services 
    As a SPS User I want to get only reading club teachers from the lookup Services - "Get Only Teachers logged in Reading Club".

    Given I am Using SPS Service to Get "Only Reading Club Teachers"
    When I am Calling Get Only Reading Club Teachers Service End Point
    Then I should Get all Reading Club Teachers in response.

  @original
  Scenario: Get all greades and class sizes from the lookup Services 
    As a SPS User I want to get all greades and class sizes from the lookup Services - "Get All Grades and Class Sizes".

    Given I am Using SPS Service to Get "All Grades And Class Sizes"
    When I am Calling Get All Grades And Class Sizes Service End Point
    Then I should Get all Grades And Class Sizes in response.

  @original
  Scenario: Get all credit cards in wallet from the lookup Services 
    As a SPS User I want to get all credit cards in wallet from the lookup Services - "Get All Credit Cards in Wallet".

    Given I am Using SPS Service to Get "All Credit Cards In Wallet"
    When I am Calling Get All Credit Cards In Wallet Service End Point
    Then I should Get all Credit Cards In Wallet in response.

  #@chosen
  @original
  Scenario: get all existing associated social media accounts from the lookup Services 
    As a SPS User I want to get all existing associated social media account from the lookup Services - "Get All Existing Associated Social Media Accounts".

    Given I am Using SPS Service to Get "All Existing Associated Social Media Accounts"
    When I am Calling Get All Existing Associated Social Media Accounts Service End Point
    Then I should Get all Existing Associated Social Media Accounts in response.

  @original
  Scenario: Get all child users from the lookup Services 
    As a SPS User I want to get all child users from the lookup Services - "Get All Child Users".

    Given I am Using SPS Service to Get "All Child Users"
    When I am Calling Get All Child Users Service End Point
    Then I should Get all Child Users in response.
