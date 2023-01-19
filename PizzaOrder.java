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
  * This source file cotains my PizzaOrder Class
  * The function of the class is to create a PizzaOrder and add pizzas to the array
  * It calculates the total of the order and prints out the order
  */

public class PizzaOrder{

  /**
    * The number of pizza's in an order
    */
  private int m_numPizzas;

  /**
    * an array to hold the number of pizza's in an order
    */
  private Pizza[] m_order;

  /**
    * a double to hold the cost for the whole order
    */
  private double totalCost;

  /**
    * The count for the number of pizzas that have been added to an order
    */
  private int pizza_count = 0;

  /**
    * Default constructor setting the order to size 1 and creating a Default pizza
    * sets the number of pizzas and count to 1
    */
  public PizzaOrder(){
    m_numPizzas = 1;
    m_order = new Pizza[1];
    Pizza pizza = new Pizza("Small", 1, 0, 0);
    m_order[0] = pizza;
    pizza_count = 1;
  }

  /**
    * Constructor initializing the size of the pizza order
    * sets count to 0 since no pizzas have been added to the order yet
    * @param num which is the number of pizzas for an order
    */
  public PizzaOrder(int num){
    m_numPizzas = num;
    m_order = new Pizza[num];
    pizza_count = 0;

  }

  /**
    * addPizza()
    * returns whether a pizza was succesfully added to the order or another
    * @param pizza is the pizza being added to the order
    * @return 1 if the pizza was added and -1 if the pizza was not added
    */
  public int addPizza(Pizza pizza){
    if(m_numPizzas == pizza_count){

    return -1;

    }
    m_order[pizza_count] = pizza;
    pizza_count++;
    return 1;
  }

  /**
    * calcTotal()
    * returns the total cost for the whole order
    * @return the cost of all the pizzas in an order
    */
  public double calcTotal(){
    for(int i = 0; i < m_order.length; ++i){
      totalCost += m_order[i].calcCost();

    }
    return totalCost;
  }

  /**
    * toString()
    * Returns a string printing out the pizza order and total cost of the order
    * @return a String representing the cost of the total order and the specific
    * size, amount of each topping, and the cost of each pizza in the order
    */
  public String toString(){
    String ret = "The total cost is $" + calcTotal() + "0" + "\n";

    ret += "The numbers of pizza in this order is " + pizza_count + "\n";
    for(int i = 0; i < m_order.length; ++i){
      ret += m_order[i].toString() + "\n";
    }

    return ret;
  }
}
