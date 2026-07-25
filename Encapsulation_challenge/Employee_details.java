package Encapsulation_challenge;

public class Employee_details {
    public static void main(String[] args) {
        Employee employee = new Employee("willys", 26, 320000);
        employee.displayEmployeeDetails();
        employee.setName("Alex");
        employee.displayEmployeeDetails();

    }
}
