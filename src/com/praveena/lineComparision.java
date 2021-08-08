package com.praveena;

import java.util.Scanner;

public class lineComparision {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision program");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of line1 first co-ordinate x1 and y1");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the value of line1 second co-ordinate x2 and y2");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double length;
        length= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("the calculation of length is " +length);
        System.out.println("enter the values of line2 first co-ordinate a1 and b1");
        int a1= sc.nextInt();
        int b1= sc.nextInt();
        System.out.println("enter the values of line2 second co-ordinate a2 and b2");
        int a2= sc.nextInt();
        int b2= sc.nextInt();
        double length1;
        length1=Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
        System.out.println("the calculation of length1 is" +length1);
        if(length == length1)
            System.out.println("both lines are equal");
        else
            System.out.println("both are not equal");
    }
}