package designpattern.creational.factoryautomobile;

public class VehicleFactory {

    public Vehicle getVehicle(String type){
        switch(type){
            case "car": return new Car();
            case "bike" : return new Bike();
            default:throw new IllegalArgumentException("unsupported input");
        }
    }
}
