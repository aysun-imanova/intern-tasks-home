public class Manager extends Employee {


    public Manager(String name, boolean isSuccessful, double salary) {
        super(name, isSuccessful, salary);
    }
    protected void getPromotion() {
        System.out.println("Get promotion: " + (getSalary() + 100));
    }
}
