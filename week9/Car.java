public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors){
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    public String getInfo (){
        StringBuilder info = new StringBuilder();
        info.append("Car:\n");
        info.append("\tBrand: " + this.getBrand() + "\n");
        info.append("\tModel: " + this.getModel() + "\n");
        info.append("\tRegistration Number: " + this.getRegistrationNumber() + "\n");
        info.append("\tNumber of Doors: " + this.getNumberOfDoors() + "\n");
        info.append("\tBelongs to " + this.getOwner().getPeronInfo() + "\n");
        return info.toString();
    }

    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

}