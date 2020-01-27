package be.intecbrussel.burgers;

import java.util.LinkedList;
import java.util.Queue;


public class BurgerOrderApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> orders = new LinkedList<>();

        BurgerOrder order1 = new BurgerOrder("Ali",1);
        BurgerOrder order2 = new BurgerOrder("Sandrine", 3);
        BurgerOrder order3 = new BurgerOrder("Kevin",2);


        orders.offer(order1);
        orders.offer(order2);
        orders.offer(order3);

        System.out.println(orders);

        System.out.println("Finished order:  " + orders.poll());
        System.out.println("Finished order:  " + orders.poll());
        System.out.println("Finished order:  " + orders.poll());

        System.out.println("Orders left: " + orders.peek());

//        System.out.println("Orders left: " + orders.element());


    }
}
