package com.gla.lambdaexpression.level1;

interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction night = () -> System.out.println("Dim lights at night");
        LightAction voice = () -> System.out.println("Lights ON via voice");

        motion.execute();
        night.execute();
        voice.execute();
    }
}
