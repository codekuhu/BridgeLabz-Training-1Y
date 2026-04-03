package com.gla.wrapperclass.level2;

import java.util.*;

public class SensorDataLogger {

    public static void add(List<Double> list, double d) {
        list.add(d);
    }

    public static void add(List<Double> list, Double d) {
        list.add(d);
    }

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        add(list, 25.5);
        add(list, Double.valueOf(30.5));

        for (int i = 0; i < list.size(); i++) {
            double v = list.get(i);
            System.out.println(v);
        }
    }
}
