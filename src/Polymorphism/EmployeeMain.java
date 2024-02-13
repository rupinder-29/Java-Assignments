package Polymorphism;

public class EmployeeMain {
    //main method
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee(101,"Rupinder",40);
        System.out.println("Salary of "+fullTimeEmployee.EmpName+ " : " +fullTimeEmployee.calculate()+"CAD per year");

        PartTimeEmployee partTimeEmployee=new PartTimeEmployee(102,"Jaspreet",20);
        System.out.println("Salary of "+partTimeEmployee.EmpName+ " : " +partTimeEmployee.calculate()+"CAD per year");

    }
}
