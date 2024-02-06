public class Plane extends Vehicle {
    private float wingLength;

    public Plane(float wingLength) {
        this.wingLength = wingLength;
    }

    public float getWingLength() {
        return wingLength;
    }

    public void setWingLength(float wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public float averageSpeed() {
        return super.averageSpeed();
    }

    @Override
    public void remainOilAmount() {
        super.remainOilAmount();
    }
}
