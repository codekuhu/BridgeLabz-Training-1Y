package com.gla.streamapiproblems.level1;

import java.util.*;
import java.util.stream.*;

public class TransformNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("hariom", "rahul", "aman");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
