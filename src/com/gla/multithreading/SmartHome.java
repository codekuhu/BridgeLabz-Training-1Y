package com.gla.multithreading;

class Device implements Runnable {

    String name;
    int interval;

    Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " - " + name + " working... cycle " + i);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SmartHome {

    public static void main(String[] args) {

        // Creating threads for each device
        Thread temperature = new Thread(new Device("Temperature Sensor", 5000));
        Thread camera = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock", 6000));

        // Setting priorities
        camera.setPriority(10);      // highest
        temperature.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        // Naming threads
        temperature.setName("Temp-Thread");
        camera.setName("Camera-Thread");
        light.setName("Light-Thread");
        door.setName("Door-Thread");

        // Starting all threads
        temperature.start();
        camera.start();
        light.start();
        door.start();
    }
}