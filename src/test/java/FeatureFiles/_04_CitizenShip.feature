# citizenShip sayfasına gidinz
  # 1 adet tizem ship kaydı yapabildiğini doğrulayınız.

  Feature: CitizenShip
    Scenario: Create CitizenShip
      Given  Navigate to Campus
      When Enter username and password and click login Button
      Then user should login successfully
      And Navigate to CitizenShip
      When Create CitizenShip
      Then Success message should be displayed