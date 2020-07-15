Feature: As a new User, I would like to register and create an account

  Scenario: Validate user details for registration

    Given I on the registration page
    And I add my email "123456!A@gmail.com"
    And I add my full name "Man Sion"
    And I add my username "mansion123"
    And I add my password "123456!A1@"
    And I click the button "Next"
    Then I should see the birthday page
