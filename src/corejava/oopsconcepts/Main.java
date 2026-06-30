package corejava.oopsconcepts;

 final class Immutable {
    private final String empid; // make all field final and private(can not access directly)
    //no subclass : make the class final

    public Immutable(String empid) {
        this.empid = empid;
    }
    //no setter

    public String getEmpid() {
        return empid;
    }
}
public class Main {
    public static void main(String[] args) {
        Immutable i = new Immutable("101");

        System.out.println(i.getEmpid());

    }
}