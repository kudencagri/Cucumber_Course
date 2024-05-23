#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption         | GradeLevelOption |
#| Math exam is1   | academicPeriod1              | gradeLevel2  |
#| IT exam is1     | academicPeriod1              | gradeLevel3  |
#| Oracle exam is1 | academicPeriod1              | gradeLevel4  |
#| Math exam is2   | academicPeriod1              | gradeLevel5  |

  Feature: Enter Exam
    Background:
      Given Navigate to Campus
      When Enter username and password and click login Button
      Then User should login successfully
      Scenario Outline: Enter exam
        And Click on the element in LeftNav
          | EntranceExams         |
          | EntranceSetup    |
          | EntranceEx          |
        And Click on the element in Dialog
          | addButton     |
        And User sending the keys in Dialog
          | Name            | <ExamName>      |
          | CountryCode     | <AcademicPeriodOption>      |
          | integrationCode | <GradeLevelOption>   |
        And  Click on the element in Dialog
          | toggleBar       |
          | saveButton      |
        Then Success message should be displayed
#        silme ekranına ukaşmak için navigate tekrar yapıldı
        And Click on the element in Dialog
          | EntranceExams    |
          | EntranceSetup    |
          | EntranceEx       |
        And User delete the element from Dialog
          |<ExamName>|
          Examples:
        | ExamName       | AcademicPeriodOption| GradeLevelOption |
        | Math exam is1  | academicPeriod1     | gradeLevel2      |
#        | IT exam is1    | academicPeriod1     | gradeLevel3      |
#        | Oracle exam is1| academicPeriod1     | gradeLevel4      |
#        | Math exam is2  | academicPeriod1     | gradeLevel5      |