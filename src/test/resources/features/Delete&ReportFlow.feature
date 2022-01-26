Feature: Comment Report and Delete Flow

  @comment_actions
  Scenario Outline: Delete comment flow for given user

    Given user opens Mercari app
    And user should be login successfully with valid seller credentials
    Then user should be in the home page.
    When user open a random product page.
    And user clicks on show menu button.
    Then user should see the following options.
      | Delete Comment |
      | Report Comment |
    When user click on <possible_options> button.
    Then user should see that the <Optional Alert> message appears in the screen.
    Examples:
      | possible_options | Optional Alert   |
      | Delete Comment   | Comment Deleted  |
      | Report Comment   | Comment Reported |