public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike (String brand, String model, String registrationNumber, Person owner, boolean hasSidecar){
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public String getInfo(){
        // StringBuffer info = new StringBuffer();
        StringBuilder info = new StringBuilder();
        info.append("Motor Bike:\n");
        info.append("\tBrand: " + this.getBrand() + "\n");
        info.append("\tModel: " + this.getModel() + "\n");
        info.append("\tRegistration Number: " + this.getRegistrationNumber() + "\n");
        info.append("\tHas Side Car: " + this.isHasSidecar() + "\n");
        info.append("\tBelongs to " + this.getOwner().getPeronInfo() + "\n");
        return info.toString();
    }

    public boolean isHasSidecar(){
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar){
        this.hasSidecar = hasSidecar;
    }

}