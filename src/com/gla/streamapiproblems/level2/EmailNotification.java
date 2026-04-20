package com.gla.streamapiproblems.level2;

import java.util.*;

public class EmailNotification {

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList("a@gmail.com", "b@gmail.com");

        emails.forEach(EmailNotification::sendEmailNotification);
    }
}
