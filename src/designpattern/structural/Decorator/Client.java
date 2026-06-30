package designpattern.structural.Decorator;

public class Client{
    public static void main(String[] args) {
       Coffee cofee = new BasicCoffee();

       cofee= new MilkDecorator(cofee);


        cofee = new SugarDecorator(cofee);

        System.out.println(cofee.getDescription());
        System.out.println(cofee.getCost());


    }
}
