
@tag
Feature: Title of your feature
  I want to use this template for my feature filer

 
   Scenario: Verify Shop by Department sidebar
   Given    User is on retail website
   When     User click on All section
   Then     below options are present in Shop by Department sidebar
|Electronics|Computers|Smart Home|Sports|Automative|
Scenario Outline: Verify department sidebar options
   Given    User is on retail website
   When     User click on All section
   And      User on <department>
   Then     below options are present in department
|<optionOne>|<optionTwo>|
Examples:
   |department| optionOne | optionTwo|
   | Electronics| TV & Video | Video Games|
   |Computers |Accessories |Networking |
   |Smart Home| Smart Home Lightning | Plugs and Outlets|
   |Sports | Athletic Clothing | Exercise & Fitness|
   |Automotive| Automative Parts & Accessories| MotorCycle & Powersports|
Scenario: Verify User can add an item to cart
   Given   User is on retail website
   When    User click on Sign in option
   And     User enter email 'khatira.moradi@tekschool.us' and password 'Khatira@1234'
   And     User click on login button
   And     User should be logged in into Account
   And     User change the category to 'Smart Home'
   And     User search for an item ' kasa outdoor smart plug'
   And     User click on Search icon
   And     User click on item
   And     User select quantity ‘2’
   And     User click add to Cart button
   Then    the cart icon quantity should change to ‘2’
Verify User can place an order without Shipping address and payment Method on file
    Given   User is on retail website
    When    User click on Sign in option
    And     User enter email 'EmailValue' and password 'PasswordValue'
    And     User click on login button
    And     User should be logged in into Account
    And     User change the category to 'Smart Home'
    And     User search for an item ' kasa outdoor smart plug'
    And     User click on Search icon
    And     User click on item
    And     User select quantity ‘2’
    And     User click add to Cart button
    Then    the cart icon quantity should change to ‘2’
    And     User click on Cart option
    And     User click on Proceed to Checkout button
    And     User click Add a new address link for shipping address
    And     User fill new address form with below information
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|united states | khatira moradi| 5714777286 | 6318 S kings Hwy |T2 | ELEXANDRIA | VIRGINIA | 22306 |
    And     User click Add Your Address button
    And     User click Add a credit card or Debit Card for Payment method
    And     User fill Debit or credit card information
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|4400660523736196 | ZIKRIYA QASIMI | 6 |2023 | 978 |
    And     User click on Add your card button
    And     User click on Place Your Order
    Then    a message should be displayed ‘Order Placed, Thanks’
Verify User can place an order with Shipping address and payment Method on file
    Given   User is on retail website
    When    User click on Sign in option
    And     User enter email 'EmailValue' and password 'PasswordValue'
    And     User click on login button
    And     User should be logged in into Account
    And     User change the category to 'Electronics
    And     User search for an item ' Apex Legends '
    And     User click on Search icon
    And     User click on item
    And     User select quantity ‘5’
    And     User click add to Cart button
    Then    the cart icon quantity should change to ‘5’
    And     User click on Cart option
    And     User click on Proceed to Checkout button
    And     User click on Place Your Order
    Then    a message should be displayed ‘Order Placed, Thanks’