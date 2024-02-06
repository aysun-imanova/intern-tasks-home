public interface IEngine {
    float getOilCapacity();
    void setOilCapacity(float oilCapacity);

    float getCurrentOil();
    void setCurrentOil(float currentOil);

    float getFuelType();
    void setFuelType(float fuelType);

    float averageSpeed();

    default void remainOilAmount(){
        System.out.println(getOilCapacity() - getCurrentOil());
    }

}
