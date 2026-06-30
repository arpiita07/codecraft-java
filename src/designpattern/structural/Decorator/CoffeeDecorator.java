package designpattern.structural.Decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

/*why cofee decorator is abstract class not interface ?
Abstract class gives:
✔ Can store state (Coffee coffee)
✔ Can have constructor
✔ Can provide shared behavior
✔ Can partially implement methods

What interface STILL cannot do (important)

Even in Java 21:

        🚫 No instance state allowed
public interface CoffeeDecorator {
    Coffee coffee; // ❌ Not allowed
}
🚫 No constructor
public interface CoffeeDecorator {
    public CoffeeDecorator(Coffee coffee) {} // ❌ Not allowed
}
---------
Why this matters for Decorator pattern

Decorator needs TWO things:

1. Store wrapped object (state)
protected Coffee coffee;
2. Initialize it via constructor
public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
}

👉 Interfaces cannot do either of these.

That is the core reason abstract class is used.
*/