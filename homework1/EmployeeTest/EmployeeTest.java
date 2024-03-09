package ntou.cs.java2024;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", "Jones", 34500.00 / 12);
        Employee employee2 = new Employee("Susan", "Baker", 37809.00 / 12);

        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", 
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n", 
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);

        System.out.println("Increasing employee salaries by 10%");
        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);

        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", 
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n", 
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);
    }
}
