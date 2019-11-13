import java.util.List;
import java.util.ArrayList;
public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    public Person (String name, String address){
        this.address = address;
        this.name = name;
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber){
        //TODO: find the vehicle has registration number and delete it
        for (Vehicle i:vehicleList){
            if (i.getRegistrationNumber() == registrationNumber) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    public String getVehiclesInfo(){
        if (this.vehicleList.size() == 0){
            return this.getName() + " has no vehicle!";
        }

        StringBuilder info = new StringBuilder();

        info.append(this.getName() + " has:\n\n");
        for (Vehicle i:vehicleList){
            info.append(i.getInfo());
        }

        return info.toString();
    }

    public String getPeronInfo(){
        return this.getName() + " - " + this.getAddress();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // public static void main(String[] args) {
    //     Person a = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
    //     Vehicle vehicle = new Car("Mer", "B300", "30A - 888.88", a, 4);
    //     a.addVehicle(vehicle);
    //     Vehicle new1 = new MotorBike("abc", "bcd", "30A -9999", a, true);
    //     a.addVehicle(new1);
    //     a.removeVehicle("30A - 888.88");

    //     System.out.println(a.getVehiclesInfo());
    // }
}