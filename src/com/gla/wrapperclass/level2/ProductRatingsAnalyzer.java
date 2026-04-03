package com.gla.wrapperclass.level2;

import java.util.*;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {

        int[] a = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(null);
        list.add(4);

        ArrayList<Integer> all = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            all.add(a[i]);
        }

        all.addAll(list);

        int sum = 0, c = 0;

        for (int i = 0; i < all.size(); i++) {
            if (Objects.nonNull(all.get(i))) {
                sum += all.get(i);
                c++;
            }
        }

        System.out.println((double) sum / c);
    }
}
