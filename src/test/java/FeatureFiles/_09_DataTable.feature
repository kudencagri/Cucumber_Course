Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login Button
    Then User should login successfully

    Scenario: Create Country
#      And Navigate to country : Setup tıklat, Paramtera tıklat, Country tıklat            aynı iş alttaki
      And  Click on the element in LeftNav
      | setup      |
      | parameters |
      | citizenships  |

      And  Click on the element in Dialog
        | addButton      |
#
#      And  User sending the keys in Dialog
#        | nameInput      | AdsaeEsda31      |
#        | codeInput      | eaweas4sdD      |
#
#      And  Click on the element in Dialog
#        | saveButton      |
#
#      Then Success message should be displayed

