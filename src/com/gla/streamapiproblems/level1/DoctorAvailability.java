package com.gla.streamapiproblems.level1;

import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> list = Arrays.asList(
            new Doctor("A", "Cardio", true),
            new Doctor("B", "Neuro", false),
            new Doctor("C", "Ortho", true)
        );

        list.stream()
            .filter(d -> d.weekendAvailable)
            .sorted((a, b) -> a.specialty.compareTo(b.specialty))
            .forEach(d -> System.out.println(d.name));
    }
}
