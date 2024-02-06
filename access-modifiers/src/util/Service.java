package util;

import class_library.Department;
import class_library.Employee;

import java.util.Scanner;

public class Service {
    public static void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();

        System.out.print("Enter employee limit for the department: ");
        int employeeLimit = scanner.nextInt();

        System.out.print("Enter salary limit for the department: ");
        double salaryLimit = scanner.nextDouble();

        Department department = new Department(departmentName, employeeLimit, salaryLimit);


        for (int i = 0; i < employeeLimit; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter surname: ");
            String surname = scanner.next();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            try {
                Employee employee = new Employee(name, surname, salary);
                department.addEmployee(employee);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }


        System.out.println("Employees in " + department.getName() + " department:");
        for (int i = 0; i < department.getEmployeeCount(); i++) {
            Employee employee = department.getEmployees()[i];
            System.out.println(employee.getName() + " " + employee.getSurname() + " - " + employee.getSalary());
        }
    }
}
