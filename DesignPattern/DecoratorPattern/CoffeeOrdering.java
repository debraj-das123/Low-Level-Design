package DesignPattern.DecoratorPattern;

// Base Drinks:
//  Espresso → ₹100
//   Cappuccino → ₹150


// Add-ons   (runtime add ):
//   Milk → +₹20
//   Sugar → +₹10
//  Whipped Cream → +₹30 
//   Chocolate → +₹40

// use decorator design pattern to solve this problem

interface Coffee{
  String getDescription();
  int cost();
}

// concrete component of coffee

class Espresso implements Coffee{
  public String getDescription(){
    return "Espresso";
  }


  public int cost(){
    return 100;
  }
}

class Cappuccino implements Coffee{
  public String getDescription(){
    return "Cappuccino";
  }


  public int cost(){
    return 150;
  }
}

// abstract decorator 
abstract class CoffeeDecorator implements Coffee{
  protected Coffee coffee;

  public CoffeeDecorator( Coffee coffee){
    this.coffee = coffee;
  }

}

// add milk
class MilkDecorator extends CoffeeDecorator{
  public MilkDecorator(Coffee coffee){
    super(coffee);
  }

  public String getDescription(){
    return coffee.getDescription() + " + milk";
  }

  public int cost (){
    return coffee.cost() + 20;
  }
}

// add suger

class SugerDecorator extends CoffeeDecorator{
  public SugerDecorator(Coffee coffee){
    super(coffee);
  }

  public String getDescription(){
    return coffee.getDescription() + " + suher";
  }

  public int cost (){
    return coffee.cost() + 10;
  }
}

//Whipped Cream 
class WhippdDecorator extends CoffeeDecorator{
  public WhippdDecorator(Coffee coffee){
    super(coffee);
  }

  public String getDescription(){
    return coffee.getDescription() + " + whipped cream";
  }

  public int cost (){
    return coffee.cost() + 30;
  }
}

// chocolate
class ChocolateDecorator extends CoffeeDecorator{
  public ChocolateDecorator(Coffee coffee){
    super(coffee);
  }

  public String getDescription(){
    return coffee.getDescription() + " + chocolate";
  }

  public int cost (){
    return coffee.cost() + 40;
  }
}


public class CoffeeOrdering {
  public static void main(String[] args) {
    Coffee c1 = new ChocolateDecorator(new MilkDecorator(new SugerDecorator(new Espresso())));

   System.out.println(c1.cost());
   System.out.println(c1.getDescription());

    
  }
}
