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
          | Name      |  CilginAdiyamanlilar1     |
        And  Click on the element in Dialog
          | saveButton      |

        Then Success message should be displayed

        And  User delete the element from Dialog
          | CilginAdiyamanlilar1      |
#  bunun altı mustafada var
        Scenario Outline: Fee Functionality
          And  Click on the element in LeftNav
         | setup      |
         | parameters |
         | fees    |

          And  Click on the element in Dialog
            | addButton       |

          And  User sending the keys in Dialog
            | Name             | <name>      |
            | CountryCode      | <code>      |
            | integrationCode  | <intCode>   |
            | priorityCode     | <Priority>  |

          And  Click on the element in Dialog
            | toggleBar       |
            | saveButton      |

          Then Success message should be displayed

          And  User delete the element from Dialog
            | <name>      |

          Examples:
            |name |    code    |intCode        |Priority    |
            |Ada32|    ea1dD   |1235           |32132       |
            |Ada33|    ea2dD   |1232           |32133       |
            |Ada34|    ea3dD   |1233           |32134       |
            |Ada35|    ea4dD   |1234           |32135       |


