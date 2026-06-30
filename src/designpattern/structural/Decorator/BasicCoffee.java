package designpattern.structural.Decorator;

public class BasicCoffee implements Coffee {

        @Override
        public String getDescription() {
            return "Simple Coffee";
        }

        @Override
        public int getCost() {
            return 50;
        }
}
