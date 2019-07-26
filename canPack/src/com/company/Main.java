package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        for (int i = bigCount; i <= bigCount; i--) {
            if(goal - i*5 >= 0) {
                if((goal - i*5) <= smallCount) {
                    return true;
                }else {
                    return false;
                }

            }
        }

        return false;
    }
}
