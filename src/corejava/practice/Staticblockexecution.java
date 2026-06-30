package corejava.practice;

public class Staticblockexecution {

        static {
            System.out.println("Static Block");
        }

        public static void main(String[] args) {
            System.out.println("Main Method");
        }

}
class Test {
    int x = 10;

    Test() {
        x = 20;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.x); //20
    }
}
class Test1 {
    int x = 10;
    static int y = 20;

    static void display() {
        System.out.println(y); //20
       // System.out.println(x); //Static methods belong to the class, not objects.
    }

    public static void main(String[] args) {
        display();
    }
}