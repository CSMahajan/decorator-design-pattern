import DecoratorPattern.BasePizza;
import DecoratorPattern.Margherita;
import DecoratorPattern.Pepperoni;
import DecoratorPattern.Toppings.Corn;
import DecoratorPattern.Toppings.ExtraCheese;
import DecoratorPattern.Toppings.Jalapeno;
import DecoratorPattern.Toppings.Mushroom;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        BasePizza jalapenoMushroomMargheritaPizza = new Jalapeno(new Mushroom(new Margherita()));
        System.out.println("Jalapeno + Mushroom + Margherita pizza cost is " + jalapenoMushroomMargheritaPizza.cost());
        //we can have any toppings decorated on any other class where (toppings can be repeated)
        //inner cost is calculated first and then towards outwards parameters evaluated
        BasePizza extraCheeseCornExtraCheesePepperoniPizza = new ExtraCheese(new Corn(new ExtraCheese(new Pepperoni())));
        System.out.println("Extra Cheese + Corn + Extra Cheese + Pepperoni pizza cost is " + extraCheeseCornExtraCheesePepperoniPizza.cost());
    }
}