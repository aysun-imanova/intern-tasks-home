public class Employee {
    private String name;
    private boolean isSuccessful;
    double salary;

    public Employee(String name, boolean isSuccessful, double salary) {
        this.name = name;
        this.isSuccessful = isSuccessful;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
