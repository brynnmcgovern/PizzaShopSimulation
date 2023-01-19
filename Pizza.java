/**
  * Brynn McGovern
  * 2370579
  * bmcgovern@chapman.edu
  * CPSC 231-04
  * MP2: More Classes
  *
  * @author Brynn McGovern
  * @version 1.0
  *
  * This source file cotains my Pizza Class
  * The function of the class is to create Pizza Objects, calculate the cost of a Pizza,
  * there are accesors and modifiers, and print out what is on your pizza
  */

public class Pizza {
  /**
    * The size of the pizza
    */
  private String pizza_size;

  /**
    * The number of cheese toppings
    */
  private int cheese_topping;

  /**
    * The number of pepperoni toppings
    */
  private int pepperoni_topping;

  /**
    * The number of veggie toppings
    */
  private int veggie_topping;

  /**
    * Cost of each pizza will be put in there
    */
  public double cost;

  /**
    * Default constructor initializing all fields to 0 or null.
    */
  public Pizza (){
    this.pizza_size = "Null";
    this.cheese_topping = 0;
    this.pepperoni_topping = 0;
    this.veggie_topping = 0;
  }


  /**
    * Constructor initializing pizza size and number of
    * cheese, pepperoni, and veggie toppings
    * @param size of the pizza
    * @param cheese which is the number of cheese toppings
    * @param pepperoni which is the number of pepperoni toppings
    * @param veggie which is the number of veggie toppings
    */
  public Pizza (String size, int cheese, int pepperoni, int veggie){
    this.pizza_size = size;
    this.cheese_topping = cheese;
    this.pepperoni_topping = pepperoni;
    this.veggie_topping = veggie;
  }



  /**
    * Copy Constructor initializing pizza size and number of
    * cheese, pepperoni, and veggie toppings to the same value
    * as another Pizza object
    * @param p which is the Pizza object being copied
    */
  public Pizza(Pizza p){
    this.pizza_size = p.pizza_size;
    this.cheese_topping = p.cheese_topping;
    this.pepperoni_topping = p.pepperoni_topping;
    this.veggie_topping = p.veggie_topping;
  }



  /**
    * getPizzaSize()
    * Returns the size of the pizza
    * @return a String value representing the pizza size
    */
  public String getPizzaSize(){
    return pizza_size;
  }

  /**
    * getNumCheese()
    * Returns the number of cheese toppings
    * @return a double representing the number of cheese toppings
    */
  public int getNumCheese(){
    return cheese_topping;
  }

  /**
    * getNumPepperoni()
    * Returns the number of pepperoni toppings
    * @return a double representing the number of pepperoni toppings
    */
  public int getNumPepperoni(){
    return pepperoni_topping;
  }

  /**
    *getNumVeggie()
    * Returns the number of veggie toppings
    * @return a double representing the number of veggie toppings
    */
  public int getNumVeggie(){
    return veggie_topping;
  }


  /**
    *setPizzaSize()
    * Sets the size of the pizza
    * @param size which is the new pizza size
    */
  public void setPizzaSize(String size){
    this.pizza_size = size;
  }

  /**
    *setNumCheese()
    * Sets the number of cheese toppings
    * @param cheese which is the new number of cheese toppings
    */
  public void setNumCheese(int cheese){
    this.cheese_topping = cheese;
  }

  /**
    * setNumPepperoni()
    * Sets the number of pepperoni toppings
    * @param pepperoni which is the new number of pepperoni toppings
    */
  public void setNumPepperoni(int pepperoni){
    this.pepperoni_topping = pepperoni;
  }

  /**
    *setNumVeggie()
    * Sets the number of veggie toppings
    * @param veggie which is the new number of veggie toppings
    */
  public void setNumVeggie(int veggie){
    this.veggie_topping = veggie;
  }

  /**
    * calcCost()
    * Returns the cost of the pizza
    * @return a double representing the cost of the pizza depending on size and
    * number of toppings
    */
  public double calcCost(){

    if(pizza_size == "Small"){
      cost = 10.0;
    }
    if(pizza_size == "Medium"){
      cost = 12.0;
    }
    if(pizza_size == "Large"){
      cost = 14.0;
    }
    cost = cost + (cheese_topping * 2.0);
    cost = cost + (pepperoni_topping * 2.0);
    cost = cost + (veggie_topping * 2.0);

    return cost;
  }

  /**
    * toString()
    * Returns a string printing out the pizza
    * @return a String representing size and amount of each topping and the cost of the pizza
    */
  public String toString(){
    String ret = "";

    ret += "The pizza size is " + pizza_size + "\n";
    ret += "The number of cheese toppings is " + cheese_topping + "\n";
    ret += "The number of pepperoni toppings is " + pepperoni_topping + "\n";
    ret += "The number of veggie toppings is " + veggie_topping + "\n";
    ret += "This pizza costs $" + cost + "\n";

    return ret;
  }

  /**
    * equals()
    * Returns a boolean that states if two pizzas are equal
    * @return a boolean that compares two pizzas
    */
  public boolean equals(Object o){
    if(!(o instanceof Pizza)){
      return false;

    }
    Pizza p = (Pizza) o;
    boolean ret = false;
    if(cost==p.cost && pizza_size == p.pizza_size && cheese_topping == p.cheese_topping && pepperoni_topping == p.pepperoni_topping && veggie_topping == p.veggie_topping){
      ret = true;
    }
    return ret;
  }

}
