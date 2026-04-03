package com.gla.wrapperclass.level2;

public class UserInputValidation {

    public static boolean check(String s) {
        try {
            int a = Integer.parseInt(s);
            return a >= 18;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check("20"));
        System.out.println(check("abc"));
        System.out.println(check("15"));
    }
}
