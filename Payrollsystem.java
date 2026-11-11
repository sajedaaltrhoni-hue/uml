
package payrollsystem;

import java.time.LocalDate;

public class Payrollsystem {
  public static void main(String[] args) {
 FullTimeEmployee emp1 = new FullTimeEmployee(
            "101", "Ahmed", 5000,
            LocalDate.of(2024, 1, 10), 1000
        );

        ContractorEmployee emp2 = new ContractorEmployee(
            "102", "Ali",
            LocalDate.of(2024, 5, 15), 50, 100
        );

        System.out.println("Full Time Employee");
        System.out.println(emp1);
        System.out.println("Net Salary: " + emp1.calculateNetSalary());
        System.out.println("Bonus: " + emp1.calculateBonus(10));

        System.out.println("\nContractor Employee");
        System.out.println(emp2);
        System.out.println("Net Salary: " + emp2.calculateNetSalary());
        System.out.println("Bonus: " + emp2.calculateBonus(10));

        System.out.println("\nComparison:");
        int result = emp1.compareTo(emp2);

        if (result > 0) {
            System.out.println("Ahmed has higher salary");
        } else if (result < 0) {
            System.out.println("Ali has higher salary");
        } else {
            System.out.println("Both have equal salary");
        }
  }
    
}
