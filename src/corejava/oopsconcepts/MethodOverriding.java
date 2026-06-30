package corejava.oopsconcepts;

public class MethodOverriding {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    void Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test(); //static block, instance block, constructor
    }

}



class Parent {
   static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); //parent : Static methods are resolved at compile time.
    }
}