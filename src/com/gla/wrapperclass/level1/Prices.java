package com.gla.wrapperclass.level1;

import java.util.ArrayList;

public class Prices {

    public static void main(String[] args) {

        double[] p = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < p.length; i++) {
            list.add(p[i]);
        }

        double max = list.get(0);
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            sum = sum + list.get(i);
        }

        double avg = sum / list.size();

        System.out.println(max);
        System.out.println(avg);
    }
}