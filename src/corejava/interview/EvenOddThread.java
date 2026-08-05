package corejava.interview;

public class EvenOddThread {
    static void main(String[] args) {
        EvenOddGenerator oddPrint = new EvenOddGenerator(1);
        EvenOddGenerator evenPrint = new EvenOddGenerator(0);

        Thread t11 = new Thread(oddPrint, "");
        Thread t21 = new Thread(evenPrint, "");

        t11.start();
        t21.start();
    }

}


class EvenOddGenerator implements Runnable{

    private  static int max =10;
    private static int num =1;
    private static Object obj = new Object();
    private  int dividend;
    public EvenOddGenerator(int dividend) {
        super();
      //this.dividend;
    }

    @Override
    public void run() {
        while(num <max){
            synchronized (obj) {
                if (num % 2 != dividend) {
                    {
                        try {
                            obj.wait();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    obj.notifyAll();
                }
            }
        }

    }
}
