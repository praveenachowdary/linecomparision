package com.praveena;

import java.util.Scanner;

public class lineComparision {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision program");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values for x1 and y1");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the value of x2 and y2");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double length;
        length= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("the calculation of length is " +length);
    }
}