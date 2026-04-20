package com.gla.lambdaexpression.level2;

import java.util.*;

public class PatientPrint {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(101, 102, 103);

        ids.stream()
           .map(String::valueOf)
           .forEach(System.out::println);
    }
}
