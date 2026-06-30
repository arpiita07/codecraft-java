package tmp.practice;

public class Singletone {
    private static Singletone instance = null;
    Singletone(){

    }
    public static Singletone getInstance()
    {
        if(instance == null){
            synchronized (Singletone.class){
                if(instance == null){
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }
}
