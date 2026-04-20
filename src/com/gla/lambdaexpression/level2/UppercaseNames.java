package com.gla.lambdaexpression.level2;

import java.util.*;
import java.util.stream.Collectors;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("hariom", "rahul", "aman");

        List<String> result = names.stream()
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
