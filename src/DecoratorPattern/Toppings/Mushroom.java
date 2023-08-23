package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza;

public class Mushroom extends ToppingsDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}