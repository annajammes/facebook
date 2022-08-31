Feature:  Login functionality of Facebook.
  @smoke @login
  Scenario: Login action
  Given User on Facebook website.
  When User enter username in username field.
  And User  enter Password in password field.
    And User click on Login Button.
    Then Post a status message Hello World.