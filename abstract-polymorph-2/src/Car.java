public class Car extends Vehicle {
    private int doorCount;

    public Car(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        if (doorCount > 1) {
            this.doorCount = doorCount;
        }
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
