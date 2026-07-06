package DesignPattern.DecoratorPattern;
// A pizza shop wants to build a flexible ordering system. Customers can order a basic pizza and dynamically add different toppings such as cheese, mushroom, and olives. The shop does not want to create separate classes for every possible pizza combination because the number of combinations can grow very large.

// Design the system using the Decorator Design Pattern so that toppings can be added dynamically to any pizza object at runtime.


//component interface
interface Pizza{
  String getDescription();
  int getCost();
}

class PlainPizza implements Pizza{
  public String getDescription(){
    return "Plain Pizza";
  }

  public int getCost(){
    return 200;
  }
}

 abstract class PizzaDecorator implements Pizza{
  protected Pizza pizza;
  public PizzaDecorator(Pizza pizza){
    this.pizza = pizza;
  }
}
// concreate class 1
class CheeseDecorator extends PizzaDecorator{
  public CheeseDecorator(Pizza pizza){
    super(pizza);
  }

  public String getDescription(){
    return pizza.getDescription() + "+ cheese";
  }

  public int getCost(){
    return pizza.getCost() + 50;
  }

}
// concreate class 2
class MushroomDecorator extends PizzaDecorator{
  public MushroomDecorator(Pizza pizza){
    super(pizza);
  }

  public String getDescription(){
    return pizza.getDescription() + "+ mushroom";
  }

  public int getCost(){
    return pizza.getCost() + 70;
  }

}

public class DecoratorPattern {
  public static void main(String[] args) {
    // base case

    Pizza p = new PlainPizza(); 

    // add cheese
    p = new CheeseDecorator(p);

    // add mushroom
    p = new MushroomDecorator(p);

    System.out.println(p.getDescription());
    System.out.println("total amount: " + p.getCost());
  }
}
