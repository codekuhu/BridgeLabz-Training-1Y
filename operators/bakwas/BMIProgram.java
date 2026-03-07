package com.gla.Methods.Level2;

import java.util.Scanner;

public class BMIProgram {

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightMeter = heightCm / 100.0;

            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;
        }
    }

    public static String[] findBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 10;
        double[][] persons = new double[size][3];

        for (int i = 0; i < size; i++) {

            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        String[] status = findBMIStatus(persons);

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < size; i++) {

            System.out.println(persons[i][1] + "\t\t"
                    + persons[i][0] + "\t\t"
                    + persons[i][2] + "\t"
                    + status[i]);
        }

        sc.close();
    }
}
