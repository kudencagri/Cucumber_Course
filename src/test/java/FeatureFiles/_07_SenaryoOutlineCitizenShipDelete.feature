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
| name     | shortname |
| eE2GSsd3 | h1da3    |
#| eE2GSs4d4 | h2rT34    |
#| eE2GSs5d5 | h3rT35    |
#| eE2GSs6d6 | h4rT36    |
#| eE2GSs7d7 | h5rT37    |