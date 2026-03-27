package com.gla.multithreading;

class Activity implements Runnable {

    String name;
    int startDelay;   // delay before starting (in ms)
    int workTime;     // how long it runs (in ms)

    Activity(String name, int startDelay, int workTime) {
        this.name = name;
        this.startDelay = startDelay;
        this.workTime = workTime;
    }

    @Override
    public void run() {

        try {
            // NEW → RUNNABLE → (waiting before start)
            Thread.sleep(startDelay);

            System.out.println(name + " started | State: " +
                    Thread.currentThread().getState());

            // Simulate activity
            Thread.sleep(workTime);

            System.out.println(name + " completed");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ExamHall {

    public static void main(String[] args) {

        Thread entry = new Thread(
                new Activity("Student Entry Monitoring", 0, 8000));

        Thread question = new Thread(
                new Activity("Question Paper Distribution", 5000, 3000));

        Thread attendance = new Thread(
                new Activity("Attendance Marking", 10000, 3000));

        Thread collection = new Thread(
                new Activity("Answer Sheet Collection", 15000, 3000));

        // Setting priorities
        question.setPriority(10);   // highest
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        // Naming threads
        entry.setName("Entry-Thread");
        question.setName("Question-Thread");
        attendance.setName("Attendance-Thread");
        collection.setName("Collection-Thread");

        // Print initial states
        System.out.println("Initial States:");
        System.out.println(entry.getName() + " → " + entry.getState());
        System.out.println(question.getName() + " → " + question.getState());
        System.out.println(attendance.getName() + " → " + attendance.getState());
        System.out.println(collection.getName() + " → " + collection.getState());

        // Start threads
        entry.start();
        question.start();
        attendance.start();
        collection.start();

        // Final states after completion
        try {
            entry.join();
            question.join();
            attendance.join();
            collection.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nAll activities completed. Program ending.");
    }
}