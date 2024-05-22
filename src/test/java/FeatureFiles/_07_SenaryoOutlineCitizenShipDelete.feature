# Senaryo
# CitizenShip sayfasına gidiniz.
# Create işlemini parameter yöntemi ile doğrulayınız.
# Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)
# Oluşturulan her CitizenShip i siliniz
# yukarıdaki senaryoyu farklı 5 seneryayou test ediniz
  Feature: Citizenship Functionality

    Background:
      Given Navigate to Campus
      When Enter username and password and click login button

      Then User should login successfully
      And Navigate to Citizenship


    Scenario Outline: Create a Citizenship
      When Create a Citizenship name as "<name>" short name as "<shortname>"
      Then Success message should be displayed

      When Create a Citizenship name as "<name>" short name as "<shortname>"
      Then Already exist message should be displayed

      When delete created accounts name as "<name>"
      Then Already exist message should be displayed



Examples:
|name    | shortname |
| Kew2g3d2 | sh1f21   |
#| eE2iu4d2 | h2rt321   |
#| eE2iu5d2 | h3rt321   |
#| eE2iu6d2 | h4rt321   |
#| eE2iu7d2 | h5rt321   |