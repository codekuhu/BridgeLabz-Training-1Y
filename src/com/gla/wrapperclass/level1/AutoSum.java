package com.gla.wrapperclass.level1;

import java.util.ArrayList;

public class AutoSum {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(50);
    list.add(5);
    list.add(7);
    list.add(10);
    list.add(34);
    int sum=0;
    for(int i=0;i<list.size();i++){
        sum=sum+list.get(i);}
    System.out.println("Sum is "+sum);
    }

}
