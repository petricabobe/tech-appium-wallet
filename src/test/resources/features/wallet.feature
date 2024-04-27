Feature: TrustWallet app

  @Manual
  Scenario: Check welcome screen for new users
    Given new users
    When app opens
    Then welcome screen with Get Started button is shown
    And image animation is playing
    And Terms of Service and Privacy Policy links are visible

  Scenario: Check welcome screen for new users
    Given app is opened
    When new user clicks Get Started button
    Then user is redirected to the next step
