package class_library;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[A-Z] [a-zA-Z]*")){
        this.name = name;
        } else {
            throw new IllegalArgumentException("Surname should start with uppercase and contain only letters!");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.matches("[A=Z][a-zA-Z]*")) {
            this.surname = surname;
        } else{
            throw new IllegalArgumentException("Surname should start with uppercase and contain only letters!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if(salary >=250.00F) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary should be 250.00 AZN or higher!");
        }
    }
}
