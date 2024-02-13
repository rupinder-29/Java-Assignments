package Polymorphism;

public class Employee {

    int EmpId;
    String EmpName;
    // constructor
        Employee (int EmpId, String EmpName){
            this.EmpId=EmpId;
            this.EmpName=EmpName;
        }
        public double calculate(){
            return 0.0;
        }


}



/*
You are developing a simple payroll system for a company. The company has different types of employees, including full-time employees
and part-time employees. Each employee is paid based on their specific type, and the calculation may vary depending on
whether the employee is full-time or part-time.

Implement polymorphism to handle the calculation of pay for different types of employees. Define a superclass called Employee with
common attributes such as employee ID and name, and a method calculatePay() to calculate the pay for an employee. Then, create
two subclasses FullTimeEmployee and PartTimeEmployee that inherit from the Employee class. Each subclass should override the
calculatePay() method to provide the specific pay calculation for full-time and part-time employees, respectively.

Your solution should include:

A Employee class with attributes for employee ID and name, and a method calculatePay() to calculate the pay for an employee.
A FullTimeEmployee class that inherits from the Employee class and overrides the calculatePay() method to calculate the pay for a
full-time employee. A PartTimeEmployee class that inherits from the Employee class and overrides the calculatePay() method to calculate
the pay for a part-time employee. A Main class to demonstrate the functionality of these classes by creating objects of
        FullTimeEmployee and PartTimeEmployee and calling their calculatePay() methods.
*/

