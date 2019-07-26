package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(299));
    }
    public static int getLargestPrime(int number){

        if(number <= 0){
            return -1;
        }

        int biggestOne = -1;


        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                biggestOne = i;
                number = number / i;
                i = 1;
            }
        }

        return biggestOne;

    }
}
