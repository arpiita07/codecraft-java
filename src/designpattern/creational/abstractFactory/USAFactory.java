package designpattern.creational.abstractFactory;

public class USAFactory implements VehicleFactory{
    @Override
    public Vehicles createCar() {
        return new FordCar();
    }

    @Override
    public Vehicles createBike() {
        return new HarleyBike();
    }
}
