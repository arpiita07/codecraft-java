package corejava.oopsconcepts;

public class Oopsconcept {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
class A {
    public void print() {

     System.out.println("hi I am from class A");
   }
}
class B extends A{
    @Override
    public void print(){
        System.out.println("hi i am from class B");
    }

}
