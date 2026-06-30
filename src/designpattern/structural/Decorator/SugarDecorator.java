package designpattern.structural.Decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"sugar";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+10;
    }
}
