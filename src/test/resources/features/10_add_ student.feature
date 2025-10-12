Feature: Add Student
  As an instructor
  I want to manage student records locally in my browser so that I can easily track
  and organize students without needing a backend.

  Background:
    Given user visits "https://claruswaysda.github.io/addStudent.html"

  @StudentPositive
  Scenario: Happy Path
    When user enters full name "John"
    And user enters student id "s12345"
    And user enters Email "johnSDA@sda.com"
    And user enters course "Math"
    And user selects grade "A"
    And user click on add student button
    Then assert that student is added

  @StudentNegative
  Scenario Outline: Negative inputs
    When user enters full name "<name>"
    And user enters student id "<id>"
    And user enters email "<email>"
    And user enters course "<course>"
    And user selects grade "<grade>"
    And user click on add student button
    Then assert that error message is displayed as "<error_message>"

    Examples:
      | name | id  | email        | course | grade | error_message          |
      |      | 123 | john@doe.com | Math   | A     | This field is required |
      | John |     | john@doe.com | Math   | A     | This field is required |

    #Rest is homework!

    @addMultipleStudents
  Scenario Outline: Add Students
    When user enters full name "<name>"
    And user enters student id "<id>"
    And user enters email "<email>"
    And user enters course "<course>"
    And user selects grade "<grade>"
    And user click on add student button
    Then assert that student is added

    Examples:
      | name  | id     | email            | course | grade |
      | John  | s12345 | johnSDA@sda.com  | Math   | A     |
      | Hans  | s89425 | HansSDA@sda.com  | Math   | B     |
      | Leo   | s95738 | LeoSDA@sda.com   | Math   | A     |
      | Max   | s90384 | MaxSDA@sda.com   | Math   | A     |
      | Kai   | s39774 | KaiSDA@sda.com   | Math   | C     |
      | Ethan | s39845 | EthanSDA@sda.com | Math   | A     |
      | Noah  | s29846 | NoahSDA@sda.com  | Math   | B     |
      | Liam  | s29386 | LiamSDA@sda.com  | Math   | F     |
      | Jack  | s95735 | JackSDA@sda.com  | Math   | A     |
      | Luke  | s29956 | LukeSDA@sda.com  | Math   | A     |

  @editStudent @addMultipleStudents
  Scenario: Edit Student
  As a teacher, I want to edit an existing student's information so that I can correct or update student
  details when needed.
    Given student named "John" with ID "s12345", email "johnSDA@sda.com"
    When user click Edit button
    And user change the full name to "John Doe"
    And user click save changes button
    Then assert that student information is updated

  @searchStudent @addMultipleStudents
  Scenario: Search Students
  As a teacher, I want to search for students by name, ID, email, or course so that I can quickly locate specific records.
    When user enters "John" in the search bar
    Then assert that only students matching "John" are displayed
    When user enters "john" in the search bar
    Then assert that only students matching "john" are displayed

  @sortStudent @addMultipleStudents
  Scenario: sort Students
  As a teacher, I want to sort the student list so that I can view it by newest, oldest, or alphabetically by name.
    When user selects "Newest first" from the sort dropdown
    Then assert that students are sorted by newest first
    When user selects "Oldest first" from the sort dropdown
    Then assert that students are sorted by oldest first
    When user selects "Name A→Z" from the sort dropdown
    Then assert that students are sorted alphabetically by name A→Z

  @localStorage @addMultipleStudents
  Scenario: Save Data Locally
  As a teacher, I want to have my data stored in the browser’s local storage so that my student list
  persists even after refreshing or closing the tab.
    When user refreshes the page
    Then assert that all previously added students are still displayed


  @exportJSON @addMultipleStudents
  Scenario: Export Student List as JSON
  As a teacher, I want to export all student data as a JSON file so that I can back up or share the
  data.
    When user clicks on Export JSON button
    Then assert that a JSON file is downloaded

  @clearFields @addMultipleStudents
  Scenario: Clear Form Fields
  As a teacher, I want to clear the form inputs easily so that I can start adding a new student without
  manual deletion.
    When user click Edit button
    And user click on Clear fields button
    Then assert that all form fields are empty
    And assert that the add button text is Add Student

  @studentCount @addMultipleStudents
  Scenario: Display Student Count
  As a teacher, I want to see how many students are currently in the list so that I can track the size of
  my class at a glance.
    When user adds a student
    Then assert that the student count is displayed
    When user deletes a student
    Then assert that the student count is changed

  @deleteStudent @addMultipleStudents
  Scenario: Delete Student
  As a teacher, I want to delete a student record so that I can remove incorrect or outdated entries.
    Given student named "John" with ID "s12345", email "johnSDA@sda.com"
    When user click Delete button
    And user confirms the deletion
    Then assert that student is deleted

  @clearAllStudents @addMultipleStudents
  Scenario: Clear All Students
  As a teacher, I want to clear all student records at once so that I can reset the registry if needed.
    When user click on Clear all button
    And user confirms the deletion
    Then assert that all students are deleted
    And close browser