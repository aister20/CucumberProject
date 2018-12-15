#Author: andreco06@hotmail.com
Feature: SignUpWithDT

  Scenario: Sign Up to the FreeCRM
    Given: I open browser

    And I navigate to the FreeCrm
    When I provide the following details
      | Edition      | FirstName | LastName | Email         | ConfirmEmail  | UserName   | Password | ConfirmPassword |
      | Free Edition | John      | Doe      | jdoe@test.com | jdoe@test.com | jdoe123456 | test     | test            |
      | Free Edition | Jimm      | Doe      | jdoe@test.com | jdoe@test.com | jdoe123456 | test     | test            |
    Then I close the browser
