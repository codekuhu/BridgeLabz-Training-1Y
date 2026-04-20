package com.gla.streamapiproblems.level2;

import java.util.*;

public class WelcomeMessage {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Hariom", "Ronaldo");

        names.forEach(n -> System.out.println("Welcome " + n));
    }
}
