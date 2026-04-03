package com.gla.wrapperclass.level2;

import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {

        Object[] a = {"85", 95, Integer.valueOf(88), "null"};

        int sum = 0, c = 0;

        for (int i = 0; i < a.length; i++) {
            try {
                Integer v = null;

                if (a[i] instanceof String) {
                    if (!a[i].equals("null"))
                        v = Integer.parseInt((String) a[i]);
                } else if (a[i] instanceof Integer) {
                    v = (Integer) a[i];
                }

                if (v != null) {
                    sum += v;
                    c++;
                }
            } catch (Exception e) {}
        }

        System.out.println((double) sum / c);
    }
}
