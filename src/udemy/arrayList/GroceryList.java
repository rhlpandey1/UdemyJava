package udemy.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private static ArrayList<String> groceryList=new ArrayList<>();
    public static void  addGrocery(String item){
        groceryList.add(item);
    }
    public static  void printGroceryList(){
        System.out.println("You have "+groceryList.size()+"  items in your list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public static void modifyGrocery(String currentItem,String newItem){
        int position=findItem(currentItem);
        if(position>=0){
            modifyGrocery(position,newItem);
        }
    }
    private static void modifyGrocery(int pos,String item){
        groceryList.set(pos,item);
        System.out.println("Grocery item "+(pos+1)+" has been modified");
    }
    public static void removeGroceryItem(String item){
        int position=findItem(item);
        if(position>=0){
            removeGrocery(position);
        }
    }
    private static void removeGrocery(int pos){
        groceryList.remove(pos);
    }
    public static int findItem(String searchItem){
      //  boolean exits=groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int choice=0;
        boolean quit=false;
        while(!quit){
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
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
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }

        }

    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        addGrocery(sc.nextLine());
    }
    public static void modifyItem() {
        System.out.print("Enter item number: ");
        String itemNo = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = sc.nextLine();
        modifyGrocery(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String itemNo = sc.nextLine();
        sc.nextLine();
        removeGroceryItem(itemNo);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = sc.nextLine();
        if(findItem(searchItem)!=0) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
