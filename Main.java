package com.gla.java;

class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    void calculateBill() {
        double total = baseAmount + deliveryCharge;
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Bill: " + total);
    }
}

class RegularOrder extends Order {

    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    void calculateBill() {
        double total = baseAmount + deliveryCharge;
        System.out.println("Regular Order");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Bill: " + total);
    }
}

class PremiumOrder extends Order {

    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    void calculateBill() {
        double discount = baseAmount * 0.20;
        double total = (baseAmount - discount) + deliveryCharge;

        System.out.println("Premium Order");
        System.out.println("Order ID: " + orderId);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}

public class Main {
    public static void main(String[] args) {

        Order o1 = new RegularOrder(101, 500);
        Order o2 = new PremiumOrder(102, 500);

        o1.calculateBill();
        System.out.println();

        o2.calculateBill();
    }
}