package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

public class SumOddRange {

    public static boolean isOdd(int number) {

        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (end < start || start < 0 || end < 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sum += i;
            }

        }
        return sum;
    }
}
