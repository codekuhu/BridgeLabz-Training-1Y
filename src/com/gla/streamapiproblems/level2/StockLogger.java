package com.gla.streamapiproblems.level2;

import java.util.*;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(100.5, 101.2, 99.8);

        prices.forEach(p -> System.out.println("Price: " + p));
    }
}
