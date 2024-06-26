Feature: DataTable Ornek

  Scenario: Users List
    When write username "ismet"
    And Write username and Password "ismet" and "1234"

    And Write username as DataTable
      | ismet  |
      | mehmet |
      | ayse   |
      | fatma  |
      | Ahmet  |
      | veli   |

    And  Write username and Password as DataTable
      | ismet  | 1234  |
      | mehmet | 23323 |
      | ayse   | 45454 |
      | fatma  | 44545 |

#  dataProvider(testNG için) , Senaryo Outline(cucumber)
#  Görevi : verilen her değer , tüm senaryoyo çalıştırma
#
#  dataTable ise , bir stepe , çok parametre vermemizi sağlıyor