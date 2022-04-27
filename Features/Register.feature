Feature:
  Scenario:success Registeration
    Given user launch the chrome browser
    When user opens url "https://demo.nopcommerce.com/"
    And the user click to register button
    And the user Check the gender and enter the Firstname as "walled" and Lastname as "mahmoud" and Email as "walled@gmail.com" and Password as"123456789" and Confirmapassword as "123456789"
    And click to Register button
    And verify the message of complete register
    Then close the browser