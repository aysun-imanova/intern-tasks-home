public class Assistant {
    Manager manager = new Manager();

    public void getFeedback(Employee employee) {
        if (employee.isSuccessful()) {
            manager.getPromotion(employee);
        } else {
            System.out.println("It is not successful!");
        }
    }
}
