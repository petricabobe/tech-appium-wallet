Feature: TrustWallet app

  @Manual
    @wip
  @Manual-result:Passed
  Scenario: Check welcome screen for new users
    When app opens
    Then welcome screen with Get Started button is shown
    And image animation is playing
    And Terms of Service and Privacy Policy links are visible

  @smoke
  Scenario: Check welcome screen for new users
    When new user clicks Get Started button
    Then user is redirected to the next step

  @smoke
  Scenario: Check create new wallet
    When users creates new wallet
    Then user is redirected to the back up screen

  @smoke
  Scenario: Enter passcode
    When user enters passcode
    And user confirms passcode
    Then welcome message is displayed
    And user is redirected to wallet page

  @Manual
  @wip
  @Manual-result:Passed
  Scenario: Check popular token
    When users is redirect to create new wallet
    Then user can see and scroll through popular coins

  @Manual
    @wip
    @Manual-result:Passed
  Scenario Outline: back up screen
    When user clicks Create new Wallet
    Then backup page is shown
    And <button> is visible
    Examples:
      | button               |
      | back up Manually     |
      | back to Google Drive |
      | skip                 |

  @Manual
  @wip
  @Manual-result:Passed
  Scenario: text on backup screen
    When user clicks Create new Wallet
    Then backup page is shown
    And back up secret phrase text is visible

  @Manual
  @wip
  @Manual-result:Passed
  Scenario: User can enter passcode
    When passcode screen is visible
    Then user can select 6 digits

  @Manual
  @wip
  @Manual-result:Passed
  Scenario: fingerprint on passcode screen
    When user is redirected to passcode screen
    Then digits are visible
    And fingerprint is visible

  @Manual
  @wip
  @Manual-result:Passed
  Scenario: text on passcode screen
    When user is redirected to oasscode screen
    Then passcode security message is displayed