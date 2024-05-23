#Senaryo:
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

  Feature: Fee Functionality
    Background:
      Given Navigate to Campus
      When Enter username and password and click login Button
      Then User should login successfully
      Scenario Outline: Fee Functionality Senario
        And Click on the element in LeftNav
          | setup         |
          | parameters    |
          | fees          |

        And Click on the element in Dialog
          | addButton     |
        And User sending the keys in Dialog
          | Name            | <name>      |
          | CountryCode     | <code>      |
          | integrationCode | <intecod>   |
          | priorityCode    | <priocode>  |
        And  Click on the element in Dialog
          | toggleBar       |
          | saveButton      |
        Then Success message should be displayed
        And User delete the element from Dialog
        |<name>|
        Examples:
          |name   |code  |intecod|priocode|
          |kerok21|kero21|Ke21   |212121|
          |kerok22|kero22|Ke22   |212122|
          |kerok23|kero23|Ke23   |212123|
          |kerok24|kero24|Ke24   |212124|
          |kerok25|kero25|Ke25   |212125|