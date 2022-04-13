

Feature: Log in into DemoWebShop

  Scenario Outline: User log in into DemoWebShop
    Given User launches DemoShop home page
    When User clicks on log in link
    Then User in Log in page
    When User enters <username> log in and pass <password> and clicks log in btn
    Then User should logged in
    Examples:
      | username               | password    |
      | "john1234@gmail.com" | "john1234" |



  Scenario Outline: Log in into DemoWebShop with wrong Login and Pass
    Given User launches DemoShop home page
    When User clicks on log in link
    Then User in Log in page
    When User enters <username> log in and pass <password> and clicks log in btn
    Then User shouldn't logged in
    Examples:
      | username              | password    |
      | "john12342@gmail.com" | "john12342" |