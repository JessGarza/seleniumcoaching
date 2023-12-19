#Selenium Coaching final project - Form
#Jessica Garza Montemayor
#May 2nd, 2023

Feature:  Registration form

@FinalProject
	@test01

Scenario: Fill a form with personal data

Given The user is in Register page
Then The user verifies that is in Register page
When The user provides name and lastname
When The user provides an address in three lines
When The user provides an invalid email
When The user select a gendre
When The user selects some hobbies randomly
When The user selects Dutch Estonian and English as language and then eliminates Estonian
When The user selects iOS as skill
When The user selects South Africa as a country
When The user selects their date of birth
When The user type a password and confirm the password
When The user clicks on submit button
Then The user validates the email invalid error message
When The user provides a valid email
When The user eliminates lastname
When The user clicks on submit button
Then The user validates the lastname error message
When The user provides the lastname and eliminates the address
When The user provides only letters on the phone field
When The user clicks on submit button
Then The user validates the phone number error message
When The user provides a valid phone number
When The user clicks on submit button
Then The user validates the country error message

   @test02
  Scenario: Upload a picture
  
Given The user is in Upload page
Then The user verifies that is in Upload page
When The user clicks on Browser button
When The user select a picture and uploads it
Then The user validates that the picture is uploaded
When The user clicks on Remove button
Then The user validates that the pciture is removed
