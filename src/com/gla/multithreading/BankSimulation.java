package com.gla.multithreading;

class BankAccount implements Runnable {

    String userType;

    BankAccount(String userType) {
        this.userType = userType;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " (" + userType + ") checking balance... Attempt " + i);

            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {

    public static void main(String[] args) {

        Thread premium = new Thread(new BankAccount("Premium"));
        Thread regular = new Thread(new BankAccount("Regular"));
        Thread basic = new Thread(new BankAccount("Basic"));

        // Setting priorities
        premium.setPriority(Thread.MAX_PRIORITY);   // 10
        regular.setPriority(Thread.NORM_PRIORITY);  // 5
        basic.setPriority(Thread.MIN_PRIORITY);     // 1

        // Naming threads (important for output clarity)
        premium.setName("User-1");
        regular.setName("User-2");
        basic.setName("User-3");

        // Start threads
        premium.start();
        regular.start();
        basic.start();
    }
}