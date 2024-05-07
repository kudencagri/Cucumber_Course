Feature: Citizenship Functionality
#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)
# yukarıdaki senaryoyu farklı 5 seneryayou test ediniz

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



    Examples:
      |name    | shortname |
      | AS54Ass3a | h15s3gea     |
      | AS54Ass4a | h16s3gea     |
      | AS54Ass5a | h17s3gea     |
      | AS54Ass6a | h18s3gea     |
      | AS54Ass7a | h19s3gea     |