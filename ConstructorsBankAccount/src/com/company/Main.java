package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
    }
}
