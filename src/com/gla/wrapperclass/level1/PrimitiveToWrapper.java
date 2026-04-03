package com.gla.wrapperclass.level1;
import java.util.Scanner;
public class PrimitiveToWrapper {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Integer");
    int n = sc.nextInt();
    Integer obj = n;
    System.out.println("Primtive Data Type value "+n);
    System.out.println("Object value"+obj);
}

}
