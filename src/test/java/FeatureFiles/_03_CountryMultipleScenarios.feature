Feature: Country Multi Scenario
  Background: # before senaryo ilk background çalışır ardından scneriyolar başlatılır sırayla
    #      ************ name as code as parametre simgeliyor
    # "ismU1"  "U1" parametre dir aynı TestNg deki ipod samsung gibi
    Given Navigate to Campus
    When Enter username and password and click login Button
    Then user should login successfully
    And Navigate to country

  Scenario: Create country

    When Create county
    Then Success message should be displayed

  Scenario: Create country 2

    When Create county  name as "ise1rs" code as "U125k5"
    Then Success message should be displayed