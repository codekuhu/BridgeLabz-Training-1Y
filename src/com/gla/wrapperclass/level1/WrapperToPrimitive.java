package com.gla.wrapperclass.level1;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double ob =45.68;
        double d= ob;
        int i= (int)d;


        System.out.println("Double object value: " + ob);
        System.out.println("Primitive double value: " + d);
        System.out.println("Primitive int value: " + i);
    }
}