package com.gla.streamapiproblems.level2;

import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(50, 80, 30, 90);

        readings.stream()
                .filter(r -> r > 60)
                .forEach(System.out::println);
    }
}
