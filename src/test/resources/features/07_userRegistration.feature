Feature:

  @UserRegister
 Scenario Outline: fill the form
    Given user visits "https://claruswaysda.github.io/form.html"
    When user enter Ssn "<Ssn>"
    And user enter fname "<Fname>"
    And user enter lname "<Lname>"
    And user enter address "<Address>"
    And user enter phone number "<phoneNumber>"
    And user enter username "<userName>"
    And user enter email "<email>"
    And user enter password "<password>"
    And user enter confirm password "<confirmPassword>"
    And user click register button
    Then user should see registration success message
    Examples:
      | Ssn  |  Fname| Lname | Address | phoneNumber |   userName        | email          | password | confirmPassword |
      | 1111 | Kevin     | Black    | Riyadh  | 9663895789  |  @ Kevin2       | kevin@gmail.com | K123KKk  |K123KKk    |
      | 2222 | Sean      | Loe        |USA   | 9663785449  | @Sean1          | Sean@gmail.com | SE9988a  | SE9988a     |
      | 3333 | Ali      | Luff        |USA   | 9663785489  | @Luf1          | LufAli@gmail.com | LE9988a  | LE9988a     |
      | 4444 | Nour      | Amir        |UK   | 9663785481  | @Nour9          | Nur6@gmail.com | NO9988a  | NO9988a     |
      | 5555 | Sami      | Amar        |Yeman| 9660785481  | @Sami6          | Sami5@gmail.com | SA9988a  | SA9988a     |
