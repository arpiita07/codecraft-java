package designpattern.creational.factory;

public class PolygonFactory {

    public Polygon createPolygon(int sides) {
        switch (sides) {
            case 3:
            return new Triangle();
            case 4:
            return new Rectangle();
            default:
                throw new IllegalArgumentException(
                        "Unsupported number of sides: " + sides);
        }
    }
}
