
package payrollsystem;
import java.time.LocalDate;


public class ContractorEmployee extends Employee {

    private int hourlyRate;
    private int hoursWorked;

    public ContractorEmployee(String id, String name,
            LocalDate joinDate, int hourlyRate, int hoursWorked) {

        super(id, name, hourlyRate * hoursWorked, joinDate);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    ContractorEmployee(String string, String ali, LocalDate of, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calculateNetSalary() {
        return (hourlyRate * hoursWorked) - calculateTax();
    }

    public double calculateBonus(double performanceScore) {
        double baseSalary = 0;
        return baseSalary * (performanceScore / 100);
    }

    private int calculateTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

