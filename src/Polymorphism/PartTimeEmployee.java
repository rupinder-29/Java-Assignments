package Polymorphism;

public class PartTimeEmployee extends Employee {
    double nHoursPerWeek;
    //constructor
    public PartTimeEmployee(int EmpId, String EmpName, double nHoursPerWeek) {
        super(EmpId, EmpName);
        this.nHoursPerWeek = nHoursPerWeek;
    }
//override calculate method
    public double calculate(){
        double hourlyWageInCAD = 16.50;
        int nWeeksPerYear= 52;
        double salary=hourlyWageInCAD * nHoursPerWeek * nWeeksPerYear;
        return salary;
    }
}
