package designpattern.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vf = new IndiaFactory();

        Vehicles v = vf.createCar();
        Vehicles v1 = vf.createBike();

        v.start();
    }
}
