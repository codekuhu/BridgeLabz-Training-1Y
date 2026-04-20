package com.gla.lambdaexpression.level1;

import java.util.*;

class Product {
    String name;
    int price;
    double rating;

    Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

public class EcommerceSort {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 20000, 4.5));
        list.add(new Product("Laptop", 50000, 4.8));
        list.add(new Product("Watch", 5000, 4.2));

        list.sort((a, b) -> a.price - b.price);

        list.forEach(p -> System.out.println(p.name + " " + p.price));
    }
}
