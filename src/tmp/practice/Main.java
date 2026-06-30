package tmp.practice;

public class Main {
    public static void main(String[] args) {
        PolygonFactory pf = new PolygonFactory();
        Polygon p = pf.createPolygon(1);
        p.draw();

        }
    }

