public class Bicycle extends Vehicle{

    private String pedalKind;

    public Bicycle( String pedalKind) {
       this.pedalKind = pedalKind;
    }

    public String getPedalKind() {
        return pedalKind;
    }

    public void setPedalKind(String pedalKind) {
        this.pedalKind = pedalKind;
    }

    @Override
    public float averageSpeed() {
        return super.averageSpeed();
    }
}
