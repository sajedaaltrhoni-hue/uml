
package payrollsystem;

import java.time.LocalDate;

public abstract class Employee implements ComparableEmployee, Taxable, BonusCalculable {

    private String id;
    private String name;
    protected double baseSalary;
    private LocalDate joinDate;

    public Employee(String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;
    }

    public abstract double calculateNetSalary();

    public int compareTo(Employee other) {
        return Double.compare(this.baseSalary, other.baseSalary);
    }

    @Override
    public double calculateTax() {
        return baseSalary * TAX_RATE;
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return baseSalary * performanceScore / 100;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nName: " + name +
               "\nBase Salary: " + baseSalary +
               "\nJoin Date: " + joinDate;
    }
}

