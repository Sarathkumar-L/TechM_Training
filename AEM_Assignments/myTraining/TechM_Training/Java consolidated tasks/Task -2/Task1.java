
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Provide Employee Details:");

        System.out.println("Enter Employee ID: ");
        int empId = userInput.nextInt();

        System.out.println("Enter Employee Name: ");
        String empName = userInput.next();

        System.out.println("Enter Employee Salary: ");
        double empSalary = userInput.nextDouble();

        employee.setEmployeeDetails(empId, empName, empSalary);

        System.out.println("\nEmployee Information:");
        employee.getEmployeeDetails();

        System.out.println("\nVerifying Loan Eligibility:");

        System.out.println("Enter your years of work experience: ");
        int workExperience = userInput.nextInt();
        
        double loanAmount = employee.getLoanEligibility(workExperience);

        if (loanAmount == 0) {
            System.out.println("Sorry, you are not eligible for a loan.");
        } else {
            System.out.println("Congratulations! You are eligible for a loan of Rs. " + loanAmount);
        }
    }
}
