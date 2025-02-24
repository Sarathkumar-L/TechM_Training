import java.util.Scanner;

public class Employee {

    int employeeId;
    String employeeName;
    double salary;

    Scanner scanner;

    public Object[] displayEmployeeDetails() {
        System.out.println("Employee Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + salary);

        return new Object[]{employeeId, employeeName, salary};
    }

    public void setEmployeeDetails(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;

        System.out.println("Employee details have been successfully recorded!");
    }

    public double calculateLoanEligibility(int experience) {
        double loanAmount = 0;
        scanner = new Scanner(System.in);

        if (experience <= 5) {
            return 0;
        }

        if (salary < 600000) {
            loanAmount = 0;
        } else if (salary == 600000) {
            loanAmount = 500000;
        } else if (salary >= 1000000 && salary < 1500000) {
            loanAmount = 500000;
        } else if (salary >= 1500000) {
            loanAmount = 700000;
        }

        return loanAmount;
    }
}
