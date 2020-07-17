Feature: As a new User, I would like to register and create an account

  Scenario: Validate user details for registration

    Given I on the registration page "https://www.instagram.com//"
    And I add my email "vicon58331@gmail.com"
    And I add my full name "Man Sion A"
    And I add my username "mansionerp1_123"
    And I add my password "123456!A1@"
    When I click the button Next
    When I should see the birthday page and I add my month of birth "July"
    When I add my day of birth "16"
    When I add my year of birth "2000"
    And I click the Next button
    Then I should be able to see the message "Resend Code."
#  Enter the confirmation code we sent to vicon58331@gmail.com.