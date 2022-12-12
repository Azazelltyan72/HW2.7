package task2;

public abstract class MotorTransport {
    private final String brand;
    private final String model;
    private double engineCapacity;

    //    private final String productionYear;
//    private final String productionCountry;
//    private String color;
//    private double maxiMovementSpeed;
//    protected double fuelPercentage;
//
//    public abstract void refill(String TypeOfFuel);
    public abstract void startMoving();
    public abstract void finishMoving();

    public MotorTransport(String brand, String model, double engineCapacity) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngineCapacity(engineCapacity);
//        if (productionYear != null && !productionYear.isEmpty() && !productionYear.isBlank()) {
//            this.productionYear = productionYear;
//        } else {
//            this.productionYear = "2000";
//        }
//        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
//            this.productionCountry = productionCountry;
//        } else {
//            this.productionCountry = "Россия";
//        }
//        setColor(color);
//        setMaxiMovementSpeed(maxiMovementSpeed);
//        if (fuelPercentage > 0.00) {
////            if (fuelPercentage <= 100.00) {
////                this.fuelPercentage = fuelPercentage ;
////            }
////        }else{
//            this.fuelPercentage = 60;
//        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 60;
        }
    }

    public abstract boolean service();

    //    public String getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "красный";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public double getMaxiMovementSpeed() {
//        return maxiMovementSpeed;
//    }
//
//    public void setMaxiMovementSpeed(double maxiMovementSpeed) {
//        if (maxiMovementSpeed <= 0) {
//            this.maxiMovementSpeed = 100;
//        } else {
//            this.maxiMovementSpeed = maxiMovementSpeed;
//        }
//    }
//    public double getFuelPercentage() {
//        return fuelPercentage;
//    }
}
