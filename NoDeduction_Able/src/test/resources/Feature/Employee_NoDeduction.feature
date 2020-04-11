Feature: Employees biweekly salary preview
  
  As an admin user I want to input my employee data so that I can get preview of their pay

  Scenario: Add Employee no Deduction
    Given I am an Admin
    And I am on the Admin Dashboard page
    When I select Add New Employee
    Then I should be able to enter employee details
    And First Name does not begin with “A” or “a”
    And the employee should save
    And I should see the employee in the table
    And the Program Bonus amount is correct
    And the Total Biweekly Pay calculation is correct
