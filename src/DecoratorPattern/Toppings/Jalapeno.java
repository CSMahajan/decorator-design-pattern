package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza;

public class Jalapeno extends ToppingsDecorator{

    BasePizza basePizza;

    public Jalapeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 25;
    }
}