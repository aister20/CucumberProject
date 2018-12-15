Feature: SignUp

Scenario: SignUp without keyword example

Given I open browser
And I navigate to the FreeCrm
And I click oon SignUo
When I enter <firstName> and <lastName> and <email>
And I enter credentials <userName> and <password>
And I check conditions and click submit
Then I enter company information <company> and <phone>
And I click on continue
Then I click on complete Registration
Then I close browser

