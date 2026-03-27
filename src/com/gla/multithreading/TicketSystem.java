package com.gla.multithreading;

import java.util.Random;

class Ticket extends Thread {

    int ticketId;
    String type;
    int priority;
    int processingTime;

    static Random rand = new Random();

    // For statistics
    static int totalTimeCritical = 0, countCritical = 0;
    static int totalTimeFeature = 0, countFeature = 0;
    static int totalTimeGeneral = 0, countGeneral = 0;
    static int totalTimeFeedback = 0, countFeedback = 0;

    Ticket(int ticketId, String type, int priority) {
        this.ticketId = ticketId;
        this.type = type;
        this.priority = priority;

        this.processingTime = rand.nextInt(5) + 1; // 1–5 sec
        setPriority(priority);
    }

    @Override
    public void run() {

        System.out.println("Ticket " + ticketId + " [" + type + "] started by "
                + Thread.currentThread().getName() + " | Priority: " + priority);

        long start = System.currentTimeMillis();

        try {
            Thread.sleep(processingTime * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long end = System.currentTimeMillis();
        long totalTime = (end - start) / 1000;

        System.out.println("Ticket " + ticketId + " completed in "
                + totalTime + " sec\n");

        // Update stats
        updateStats(type, (int) totalTime);
    }

    // synchronized for thread safety
    synchronized static void updateStats(String type, int time) {
        switch (type) {
            case "Critical":
                totalTimeCritical += time;
                countCritical++;
                break;
            case "Feature":
                totalTimeFeature += time;
                countFeature++;
                break;
            case "General":
                totalTimeGeneral += time;
                countGeneral++;
                break;
            case "Feedback":
                totalTimeFeedback += time;
                countFeedback++;
                break;
        }
    }

    static void printStats() {
        System.out.println("\n=== STATISTICS ===");

        if (countCritical > 0)
            System.out.println("Critical Avg Time: " + (totalTimeCritical / countCritical) + " sec");

        if (countFeature > 0)
            System.out.println("Feature Avg Time: " + (totalTimeFeature / countFeature) + " sec");

        if (countGeneral > 0)
            System.out.println("General Avg Time: " + (totalTimeGeneral / countGeneral) + " sec");

        if (countFeedback > 0)
            System.out.println("Feedback Avg Time: " + (totalTimeFeedback / countFeedback) + " sec");
    }
}

public class TicketSystem {

    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[10];

        tickets[0] = new Ticket(1, "Critical", 10);
        tickets[1] = new Ticket(2, "Feature", 4);
        tickets[2] = new Ticket(3, "General", 2);
        tickets[3] = new Ticket(4, "Feedback", 1);
        tickets[4] = new Ticket(5, "Critical", 10);
        tickets[5] = new Ticket(6, "Feature", 4);
        tickets[6] = new Ticket(7, "General", 2);
        tickets[7] = new Ticket(8, "Feedback", 1);
        tickets[8] = new Ticket(9, "Critical", 10);
        tickets[9] = new Ticket(10, "General", 2);

        // Naming threads
        for (int i = 0; i < tickets.length; i++) {
            tickets[i].setName("Agent-" + (i + 1));
        }

        // Start threads
        for (Ticket t : tickets) {
            t.start();
        }

        // Wait for all to finish
        for (Ticket t : tickets) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // Print statistics
        Ticket.printStats();
    }
}