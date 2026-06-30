package designpattern.creational.factory;

public class Rectangle implements Polygon{
    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }
}
