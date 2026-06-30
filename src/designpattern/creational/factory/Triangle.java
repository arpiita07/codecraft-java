package designpattern.creational.factory;

public class Triangle implements Polygon{

    @Override
    public void draw() {
        System.out.println("drawing a triangle");
    }
}
