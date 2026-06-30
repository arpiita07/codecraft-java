package designpattern.creational.abstractFactory;

public class IndiaFactory implements VehicleFactory{
    @Override
    public Vehicles createCar() {
        return new TataCar();
    }

    @Override
    public Vehicles createBike() {
        return new HeroBike();
    }
}
