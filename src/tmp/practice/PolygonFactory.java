package tmp.practice;

public class PolygonFactory {
    public Polygon createPolygon(int sides){
        switch(sides){
            case 1: return new Line();
            case 2: return new Doubleline();
            case 3: return new Triangle();
            default: throw new RuntimeException();
        }


    }
}
