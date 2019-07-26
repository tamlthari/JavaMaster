package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("National Swiss Bank");

        bank.addBranch("Zurich");

        bank.addCustomer("Zurich","Tim",50.67);
        bank.addCustomer("Zurich","John",49.84);
        bank.addCustomer("Zurich","Abby",90.91);

        bank.addBranch("Geneva");

        bank.addCustomer("Geneva","Kevin",900.92);

        bank.addCustomerTransaction("Zurich","Tim",7.53);
        bank.addCustomerTransaction("Zurich","Tim",9.53);
        bank.addCustomerTransaction("Zurich","Tim",6.53);

        bank.listCustomers("Zurich",true);
    }
}
