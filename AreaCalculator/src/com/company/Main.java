package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double Area = radius * radius * Math.PI;
            return Area;
        }
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        } else {
            double Area = x * y;
            return Area;
        }

    }
}