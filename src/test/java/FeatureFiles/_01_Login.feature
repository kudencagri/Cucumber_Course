#Login Kontrol senaryosu
#  siteye git,
#  login bilgilerini gir,
#  giriş yaptığını doğrula.


  Feature: Login Functionality

    Scenario: Login with valid username and password

      Given Navigate to Campus
      When Enter username and password and click login Button
      Then user should login successfully
