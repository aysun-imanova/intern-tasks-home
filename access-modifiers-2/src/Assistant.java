public class Assistant extends Employee {

    public Assistant(String name, boolean isSuccessful, double salary) {
        super(name, isSuccessful, salary);
    }

    public void getFeedback(Employee employee){
        if(isSuccessful()){
            if(employee instanceof Manager){
                ((Manager) employee).getPromotion();
            }
        } else System.out.println("You are fail!");
    }
}
