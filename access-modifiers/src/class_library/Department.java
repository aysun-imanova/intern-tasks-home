package class_library;

public class Department {
    private String name;
    private int employeeLimit;
    private double salaryLimit;
    private Employee[] employees;
    private int employeeCount;

    public Department(String name, int employeeLimit, double salaryLimit, Employee[] employees, int employeeCount) {
        this.name = name;
        this.employeeLimit = employeeLimit;
        this.salaryLimit = salaryLimit;
        this.employees = employees;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeLimit() {
        return employeeLimit;
    }

    public void setEmployeeLimit(int employeeLimit) {
        this.employeeLimit = employeeLimit;
    }

    public double getSalaryLimit() {
        return salaryLimit;
    }

    public void setSalaryLimit(double salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    private double getTotalSalaries() {
        double totalSalaries = 0;

        for (int i = 0; i < getEmployeeCount(); i++) {
            totalSalaries += getEmployees()[i].getSalary();
        }
        return totalSalaries;
    }

    public void addEmployee(Employee employee){
        if(getEmployeeCount() < getEmployeeLimit() && (employee.getSalary() + getTotalSalaries()) <= getSalaryLimit()){
            getEmployees()[employeeCount++] = employee;
            System.out.println("Employee added to the department!");
        } else {
            System.out.println("The limit reached!");
        }
    }
}
