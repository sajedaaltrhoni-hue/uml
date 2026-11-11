
package payrollsystem;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

    private double allowance;

    public FullTimeEmployee(String id, String name,
            double baseSalary, LocalDate joinDate, double allowance) {

        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    FullTimeEmployee(String string, String ahmed, int i, LocalDate of, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateNetSalary() {
        return baseSalary + allowance - calculateTax();
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return baseSalary * (performanceScore / 100);
    }
}
