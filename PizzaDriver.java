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
  * This source file cotains my PizzaDriver Class
  * The function of the class is to test the methods from the other two classes
  * It creates Pizza objects and adds them to an order
  */

public class PizzaDriver{


  public static void main(String[] args){

    /**
      * adds four pizzas to order
      */
    Pizza pizza1 = new Pizza("Small", 1, 0, 1);
    Pizza pizza2 = new Pizza("Large", 2, 2, 0);
    Pizza pizza3 = new Pizza (pizza2);
    Pizza pizza4 = new Pizza (pizza1);
    /**
      * initializes array order size to 3
      */
    PizzaOrder order = new PizzaOrder(3);

    System.out.println(order.addPizza(pizza1));
    System.out.println(order.addPizza(pizza2));
    System.out.println(order.addPizza(pizza3));
    /**
      * prints -1 because a fourth pizza can't be added
      */
    System.out.println(order.addPizza(pizza4));
    /**
      * compares pizza1 and pizza3
      */
    System.out.println(pizza1.equals(pizza3));
    /**
      * prints out pizza order
      */
    System.out.println(order);
  }
}
