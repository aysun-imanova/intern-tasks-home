package class_library;

public class Employee {
    private String name;
    private String surname;
    private float salary;

    public Employee(String name, String surname, float salary) {
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
            System.out.println("Name should start with uppercase and contain only letters!");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.matches("[A=Z][a-zA-Z]*")) {
            this.surname = surname;
        } else{
            System.out.println("Surname should start with uppercase and contain only letters!");
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if(salary >=250) {
            this.salary = salary;
        } else {
            System.out.println("Salary should be 250AZN or higher!");
        }
    }
}
