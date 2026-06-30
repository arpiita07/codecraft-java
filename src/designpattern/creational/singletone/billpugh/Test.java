package designpattern.creational.singletone.billpugh;

public class Test {
    private static Test instance = null;
    private Test(){

    }
    //nested class
    private static class SingletoneHelper{
        private static final Test instance = new Test();

    }
    public static Test getInstance(){
        return SingletoneHelper.instance;
    }}
