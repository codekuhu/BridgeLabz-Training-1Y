package com.gla.wrapperclass.level2;

import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {

        int[] a = {25, 30, 18, 40};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
