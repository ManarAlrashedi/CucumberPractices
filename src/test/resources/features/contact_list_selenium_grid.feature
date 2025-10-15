@ContactList
Feature: Contact List Selenium Grid


  @createUser
  Scenario: Create user account
    Given user visits "https://thinking-tester-contact-list.herokuapp.com/addUser"
    When user enters firstName "Hans"
    And user enters lastName "Leo"
    And user enter contact list email "hannsleosda@sda.com"
    And user enter contact list password "hans123"
    And user clicks on submit button
    Then assert that user is created

  @AddContact
  Scenario: Add new contact
    #Given user visits "https://thinking-tester-contact-list.herokuapp.com/login"
    #When user enter email "hansleo@sda.com"
    #And user enter password "hans123"
    #And user clicks on login button
    #Then assert that user is logged in
    When user clicks on add contact button
    And user enters firstName "hadi"
    And user enters lastName "mahdi"
    And user clicks on submit button
    Then assert that contact "hadi mahdi" is added

  @EditContact
  Scenario: Edit contact
    When user edits the contact contains "hadi"
    And user clicks on edit button
    And user enter contact list email "hadi@sda.com"
    And user clicks on submit button
    Then assert that contact "hadi@sda.com" is edited

  @DeleteContact
  Scenario: Delete contact
    When user click on cotact contains "hadi"
    And user clicks on delete button
    Then assert that contact "hadi" is deleted
    And close browser



