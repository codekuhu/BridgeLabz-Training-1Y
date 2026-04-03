package com.gla.wrapperclass.level2;

public class BankTransactionLimit {

    public static double get(Double d) {
        if (d == null) return 0.0;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(get(500.0));
        System.out.println(get(null));
    }
}
