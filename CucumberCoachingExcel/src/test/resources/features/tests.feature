#Selenium Coaching final project - Form
#Jessica Garza Montemayor
#May 2nd, 2023

Feature: Automation Practice Site
         As a user I want to perform some action on this website
         
@FinalProject
	@test03
  	Scenario: As a user on MyAccount page I will provide my email and password to log in

    Given The user is in MyAccount page
    Then The user verifies that is in MyAccount page
    When The user provide email and password and click submit
    Then The user is directed to next page
    
  @test04
	  Scenario: As a user on MyAccount page I will provide an invalid email and password to register and receive a warning message

    Given The user is in MyAccount page
    Then The user verifies that is in MyAccount page
    When The user provide an invalid email and password and click on register
    Then Registration must fail with a warning message
    
   @test05
   	Scenario: As a user on Shop page I will click on a category product link

    Given The user is in Shop page
    Then The user verifies that is in Shop page
    When The user clicks on link
    Then The user can see the products of that category
    
   @test06
    Scenario: As a user I will log in and then click on Orders link

    Given The user is in MyAccount page
    Then The user verifies that is in MyAccount page
    When The user provide email and password and click submit
    When The user is directed to next page
    When The user clicks on orders link
    Then The user can see their orders
    
   @test07
    Scenario: As a user I will log in and log out

    Given The user is in MyAccount page
    Then The user verifies that is in MyAccount page
    When The user provide email and password and click submit
    When The user is directed to next page
    When The user click on Sign out
    Then The user verifies that is in MyAccount page