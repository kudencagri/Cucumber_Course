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
      | country  |

      And  Click on the element in Dialog
        | addButton      |

      And  User sending the keys in Dialog
        | Name      | AdKersda31      |
        | CountryCode      | eaKer4sdD      |

      And  Click on the element in Dialog
        | saveButton      |

      Then Success message should be displayed

      And  User delete the element from Dialog
        | AdKersda31      |


      Scenario:  Create Nationality
        And  Click on the element in LeftNav
          | setup      |
          | parameters |
          | nationalities  |

        And  Click on the element in Dialog
          | addButton      |
        And  User sending the keys in Dialog
          | Name      |  CilginAdiyamanlilar     |
        And  Click on the element in Dialog
          | saveButton      |

        Then Success message should be displayed

        And  User delete the element from Dialog
          | CilginAdiyamanlilar      |