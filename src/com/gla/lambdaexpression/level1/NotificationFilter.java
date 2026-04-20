package com.gla.lambdaexpression.level1;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart Rate High", "CRITICAL"),
                new Alert("Reminder", "NORMAL"),
                new Alert("Low BP", "CRITICAL")
        );

        Predicate<Alert> filter = a -> a.type.equals("CRITICAL");

        alerts.stream()
              .filter(filter)
              .forEach(a -> System.out.println(a.message));
    }
}
