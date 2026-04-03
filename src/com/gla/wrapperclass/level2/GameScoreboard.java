package com.gla.wrapperclass.level2;

public class GameScoreboard {
    public static void main(String[] args) {

        Integer[] a = {10, null, 20, null, 5};

        int sum = 0, c = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) c++;
            else sum += a[i];
        }

        System.out.println(c);
        System.out.println(sum);
    }
}
