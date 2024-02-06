public abstract class Vehicle implements IEngine {
    private float driveTime;
    private float drivePath;

    public Vehicle(float driveTime, float drivePath) {
        setDriveTime(driveTime);
        setDrivePath(drivePath);
    }

    protected Vehicle() {
    }

    public float getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(float driveTime) {
        if (driveTime > 0) {
            this.driveTime = driveTime;
        }
    }

    public float getDrivePath() {
        return drivePath;
    }

    public void setDrivePath(float drivePath) {
        if (drivePath > 0) {
            this.drivePath = drivePath;
        }
    }

    @Override
    public float getOilCapacity() {
        return 0;
    }

    @Override
    public float getCurrentOil() {
        return 0;
    }

    @Override
    public float getFuelType() {
        return 0;
    }

    @Override
    public float averageSpeed() {
        return 0;
    }

    @Override
    public void remainOilAmount() {
        IEngine.super.remainOilAmount();
    }

    @Override
    public void setOilCapacity(float oilCapacity) {

    }

    @Override
    public void setCurrentOil(float currentOil) {

    }

    @Override
    public void setFuelType(float fuelType) {

    }
}
