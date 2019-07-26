package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
	// Grocery list code
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }


        //Resize array code
        System.out.println("Enter 10 integers: ");

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = s.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }

    public static void removeItem() {
        System.out.print("Current item name: ");
        String itemNo = s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchforItem() {
        System.out.print("Item to search for: ");
        String searchItem = s.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found "+searchItem+" in our grocery list.");
        } else {
            System.out.println(searchItem + " is not in our grocery list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
    }

    //resize array code
    private static void getInput() {
        for(int i = 0; i< baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i > arr.length; i++) {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i<original.length;i++) {
            baseData[i] = original[i];
        }
    }

}
