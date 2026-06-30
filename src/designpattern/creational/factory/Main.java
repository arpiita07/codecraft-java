package designpattern.creational.factory;

public class Main {
    public static void main (String args[]){
        PolygonFactory pobj = new PolygonFactory();
        Polygon p = pobj.createPolygon(3);
        p.draw();
    }
}
