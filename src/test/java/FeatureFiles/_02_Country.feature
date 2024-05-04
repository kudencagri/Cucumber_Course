Feature: Country Functionality
 # ************************ ilk *************
 # Login Kontrol senaryosu
 # siteye git,
 # login bilgilerini gir,
 # giriş yaptığını doğrula.
 # ************************ iki *************




  Scenario: Creat a Country
    Given Navigate to Campus
    When Enter username and password and click login Button
    Then user should login successfully
    And Navigate to country
    When Create county
    Then Success message should be displayed
