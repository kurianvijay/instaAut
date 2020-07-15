Feature: As a new User, I would like to register and create an account

  Scenario: Validate user details for registration

    Given I on the registration page "https://www.instagram.com//"
    And I add my email "vicon58331@gmail.com"
    And I add my full name "Man Sion A"
    And I add my username "mansionerp1_123"
    And I add my password "123456!A1@"
    When I click the button Next
    And I should see the birthday page "https://www.instagram.com/accounts/emailsignup/"
#    And I add my month of birth "Jan"
#    And I add my day of birth "1"
#    And I add my year of birth "2000"
#    And I click the button Next
#    Then I should see the registration page "https://www.instagram.com/accounts/"
