#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario: Create a Citizenship
    When Create a Citizenship name as "AS5s3a" short name as "h15sa"
    Then Success message should be displayed

    When Create a Citizenship name as "AS5s3a" short name as "h15sa"
    Then Already exist message should be displayed