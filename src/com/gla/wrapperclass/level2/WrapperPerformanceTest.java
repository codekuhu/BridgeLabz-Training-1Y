package com.gla.wrapperclass.level2;

import java.util.*;

public class WrapperPerformanceTest {
    public static void main(String[] args) {

        int n = 1000000;

        long t1 = System.currentTimeMillis();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = i;

        long sum1 = 0;
        for (int i = 0; i < n; i++) sum1 += a[i];
        long t2 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long sum2 = 0;
        for (int i = 0; i < n; i++) sum2 += list.get(i);
        long t3 = System.currentTimeMillis();

        System.out.println("int[]: " + (t2 - t1));
        System.out.println("ArrayList: " + (t3 - t2));
    }
}
