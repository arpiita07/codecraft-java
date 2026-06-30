package designpattern.creational.factoryautomobile;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vf = new
                VehicleFactory();
        Vehicle v = vf.getVehicle("car");
        v.start();
    }
}

/*
Now suppose your company manufactures vehicles in India and the USA.

Each country has different models.

        India
Car → Tata
Bike → Hero
        USA
Car → Ford
Bike → Harley Davidson

Now you don't just want a Car.

You want an Indian Car or a US Car.

        That's where Abstract Factory shines.

        VehicleFactory
        |
-----------------------
|                     |
IndiaFactory      USAFactory
        */
