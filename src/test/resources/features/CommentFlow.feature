Feature: Comment Flow

@comment
  Scenario Outline: positive case for given <user>

    Given user opens Mercari app
    And user should be login successfully with valid credentials
      | username | <user>     |
      | password | <password> |
    Then user should be in the home page.
    When user open a random product page.
    And user clicks on comments text-box.
    Then user should see the popped up keyboard input.
    When user adds comment and clicks the submit button.
    Then user should see that the "Successful" message appears in the screen.
    Examples:
      | user     | password     |
      | user123  | love123      |
      | buyer123 | happiness123 |

@comment
  Scenario: negative case

    Given user opens Mercari app
    Then user should be in the home page.
    When user open a random product page.
    And user clicks on comments text-box.
    Then user should see the popped up keyboard input.
    When user adds comment and clicks the submit button.
    Then user should see that the "You should log-in to add a comment" message appears in the screen.