package com.gla.multithreading;

class Order implements Runnable {

    int orderId;
    String restaurant;
    int deliveryTime; // in seconds

    Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();

        try {
            System.out.println(Thread.currentThread().getName() +
                    " picked up Order " + orderId + " from " + restaurant);

            Thread.sleep(deliveryTime * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " Order " + orderId + " is In Transit");

            Thread.sleep(deliveryTime * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " delivered Order " + orderId);

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("Total delivery time for Order " +
                orderId + ": " + totalTime + " seconds\n");
    }
}

public class FoodDeliverySystem {

    public static void main(String[] args) {

        Thread order1 = new Thread(new Order(101, "Dominos", 2));
        Thread order2 = new Thread(new Order(102, "KFC", 3));
        Thread order3 = new Thread(new Order(103, "McDonalds", 1));
        Thread order4 = new Thread(new Order(104, "Pizza Hut", 2));
        Thread order5 = new Thread(new Order(105, "Burger King", 3));

        // Assign priorities
        order1.setPriority(10); // Express
        order2.setPriority(5);  // Standard
        order3.setPriority(3);  // Economy
        order4.setPriority(10); // Express
        order5.setPriority(5);  // Standard

        // Naming threads (delivery agents)
        order1.setName("Agent-A");
        order2.setName("Agent-B");
        order3.setName("Agent-C");
        order4.setName("Agent-D");
        order5.setName("Agent-E");

        // Start all threads
        order1.start();
        order2.start();
        order3.start();
        order4.start();
        order5.start();
    }
}