#
#Feature: Login to OrangeHRM
#
#  Scenario: Valid Login
#    Given I navigate to the orangeHRM login page
#    When I enter valid credentials
#    And I click the login button
#    Then I should be logged in successfully
#
#  Scenario: Invalid login
#    Given I have navigate to the OrangeHRM login page
#    When I enter invalid credentials
#    And I click the login button
#    Then I should see an error message

#Feature: OrangeHRM Login
#
#  Scenario Outline: User logs in with valid credentials
#    Given The user is on the OrangeHRM login page
#    When the user enters "<username>" and "<password>"
#    And clicks the login button
#    Then the user should be logged in successfully
#
#    Examples:
#      | username  | password |
#      | admin     | admin123 |

Feature: SauceLabs login

  Scenario Outline: User logs into Sauce Labs with valid credentials
    Given The user is on the Sauce Labs login page
    When the user enters the "<username>" and "<password>"
    And clicks the Sauce Labs login button
    Then the user should be logged into Sauce Labs successfully
    Examples:
      | username | password |
      | standard_user | secret_sauce |