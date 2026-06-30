package designpattern.creational.abstractFactory;

public interface VehicleFactory {
    Vehicles createCar();

    abstract Vehicles createBike();
}
