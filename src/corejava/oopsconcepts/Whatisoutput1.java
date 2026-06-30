package corejava.oopsconcepts;

public class Whatisoutput1 {

        static int x = 10;
        int y = 20;

        public static void main(String[] args) {
            Whatisoutput1 t1 = new Whatisoutput1();
            Whatisoutput1 t2 = new Whatisoutput1();

            t1.x = 50;
            t1.y = 100;

            System.out.println(t2.x);//50 , x is static → shared by all objects.
            System.out.println(t2.y);//20
            System.out.println(x); //50
           // System.out.println(y);//cte
        }
    }

