
Background:
   Given   User is on retail website
   When    User click on Sign in option
   And     User enter email 'khatira.moradi@tekschool.us' and password 'Khatira@1234'
   And     User click on login button
   And     User should be logged in into Account
   
   @test
Scenario: Verify User can update Profile Information
   When   User click on Account option
   And    User update Name ‘khatira’ and Phone ‘Khatira@1234’
   And    User click on Update button
   Then   user profile information should be updated
   
   
Scenario: Verify User can Update password
    When   User click on Account option
    And    User enter below information
    |previousPassword| newPassword|confirmPassword|
    |Khatira@1234|kh@5714777286Z |kh@5714777286Z |
    And    User click on Change Password button
    Then   a message should be displayed ‘Password Updated Successfully’
    
    
Scenario: Verify User can add a payment method
    When    User click on Account option
    And     User click on Add a payment method link
    And     User fill Debit or credit card information
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
| cardNumber | fullName | 6 | 2023 | securityCode |
    And     User click on Add your card button
    Then    a message should be displayed ‘Payment Method added successfully’
    
    
Scenario: Verify User can edit Debit or Credit card
    When    User click on Account option
    And     User click on Edit option of card section
    And     user edit information with below data
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|4400660523736196 | ZIKRIYA QASIMI| 6 | 2023 | 978|
    And     user click on Update Your Card button
    Then    a message should be displayed ‘Payment Method updated Successfully’
    
    
Scenario: Verify User can remove Debit or Credit card
    When    User click on Account option
    And     User click on remove option of card section
    Then    payment details should be removed
    
    
Scenario: Verify User can add an Address
    When    User click on Account option
    And     User click on Add address option
    And     user fill new address form with below information
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|united states | khatira moradi| 5714777286 | 6318 S kings Hwy | T2 | ELEXANDRIA | VIRGINIA | 22306 |
    And     User click Add Your Address button
    Then    a message should be displayed ‘Address Added Successfully’
    
    
Scenario: Verify User can edit an Address added on account
    When    User click on Account option
    And     User click on edit address option
    And     user fill new address form with below information
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|united states | khatira M| 5714777266 | 6318 S kings Hwy| T6 |ELEXANDRIA | VIRGINIA | 22366 |
    And     User click update Your Address button
    Then    a message should be displayed ‘Address Updated Successfully’
    
    
Scenario: Verify User can remove Address from Account
    When    User click on Account option
    And     User click on remove option of Address section
    Then    Address details should be removed
