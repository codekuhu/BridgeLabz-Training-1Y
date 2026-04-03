package com.gla.wrapperclass.level2;

import java.util.*;

public class ShoppingCartCalculation {
    public static void main(String[] args) {

        String[] p = {"250","499","99","abc"};
        int sum = 0;

        for (int i = 0; i < p.length; i++) {
            try {
                sum += Integer.parseInt(p[i]);
            } catch (Exception e) {}
        }

        System.out.println(sum);
    }
}
