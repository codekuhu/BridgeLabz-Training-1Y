package com.gla.array.level1;
import java.util.Scanner;
public class evenodd {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       if(n<0){
           System.out.println("Error");
           return;
       }
       int []odd=new int[n];
       int []even=new int [n];
       int e=0;int o=0;
       for(int i=0;i<n;i++){
          if(i%2==0){
           even[e]=i;
           e=e+1;
       }
       else {
           odd[o]=i;
           o=o+1;
       }
       }
       for(int i=0;i<o;i++){
           System.out.println("odd number");
           System.out.println(odd[i]);
       }
      for(int i=0;i<e;i++){
          System.out.println("even number");
          System.out.println(even[i]);
      }
    }
}
