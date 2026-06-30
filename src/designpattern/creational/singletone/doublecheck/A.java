package designpattern.creational.singletone.doublecheck;
//double check
public class A {
 private  static A instance = null;

    private A(){
    }
    public static A getInstance(){
      if(instance==null){
            synchronized(A.class) {
                if(instance == null)
                   {instance= new A();
                   }
            }
     }
      return instance;
    }
}
class Main{
public static void main(){A obj = A.getInstance();
}
}