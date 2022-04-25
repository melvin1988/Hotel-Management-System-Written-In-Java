import java.util.ArrayList;
import java.util.Scanner;

class Bill {
    String itemName;
    int itemPrice;
    int quantity;
    int subTotal;

    Bill(String itemName, int itemPrice, int quantity, int subTotal) {
	      this.itemName = itemName;
	      this.itemPrice = itemPrice;
	      this.quantity = quantity;
	      this.subTotal = subTotal;
    }

    @Override
    public String toString() {
	      return itemName + "\t\t\t$" + itemPrice + "\t\t\t" + quantity + "\t\t\t$" + subTotal;
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        String name = "";
        int itemId = 0;
        String itemName = "";
        int itemPrice = 0;
        int quantity = 0;
        int subTotal = 0;
        int grandTotal = 0;
        char a = 'Y';
        ArrayList<Bill> item = new ArrayList<>();

	      Scanner scan = new Scanner(System.in);

        //Get the customer's name
        System.out.println("Dear customer, welcome to Hotel M");
        System.out.println("Enter your name");
        name = scan.next();

        //Display the menu
        System.out.println("Below is the menu");
        System.out.println("__________________________________________________________________________");
        System.out.println("Item ID\t\t\t\tItem Name\t\t\tItem Price");
        System.out.println("__________________________________________________________________________");
        System.out.println("1\t\t\t\tWater\t\t\t\t$10");
        System.out.println("2\t\t\t\tCoke\t\t\t\t$20");
        System.out.println("3\t\t\t\tPizza\t\t\t\t$40");
        System.out.println("4\t\t\t\tBurger\t\t\t\t$50");
        System.out.println("5\t\t\t\tFries\t\t\t\t$30");
        System.out.println("__________________________________________________________________________");

	      while(a=='Y') {
            //Get the itemId
            System.out.println("Enter the item ID");
            itemId = scan.nextInt();

            //Get the quantity
            System.out.println("Enter the quantity");
            quantity = scan.nextInt();

            //Calculate the sub-total
            switch(itemId) {
		            case 1:
                    itemName = "Water";
                    itemPrice = 10;
                    subTotal = quantity*itemPrice;
                    break;
                case 2:
                    itemName = "Coke";
                    itemPrice = 20;
                    subTotal = quantity*itemPrice;
                    break;
                case 3:
                    itemName = "Pizza";
                    itemPrice = 40;
                    subTotal = quantity*itemPrice;
                    break;
                case 4:
                    itemName = "Burger";
                    itemPrice = 50;
                    subTotal = quantity*itemPrice;
                    break;
                case 5:
                    itemName = "Fries";
                    itemPrice = 30;
                    subTotal = quantity*itemPrice;
                    break;
                default:
                    System.out.println("Invalid selection");
            }
            //Calculate the grand total
            grandTotal += subTotal;

            item.add(new Bill(itemName, itemPrice, quantity, subTotal));
            System.out.println("________________________________________________________________________________");
            System.out.println("Item Name\t\tItem Price\t\tQuantity\t\tSubtotal");
            System.out.println("________________________________________________________________________________");
            System.out.println(itemName + "\t\t\t$" + itemPrice + "\t\t\t" + quantity + "\t\t\t$" + subTotal);

            //Check if the customer wants to order more
            System.out.println("Would you like to order more(Y/N)");
            String choice = scan.next();
            choice = choice.toUpperCase();
            char[] arr = choice.toCharArray();
            a = arr[0];
        }
        //Display the breakdown
        System.out.println("________________________________________________________________________________");
        System.out.println("Customer name: " + name);
        System.out.println("________________________________________________________________________________");
        System.out.println("Item Name\t\tItem Price\t\tQuantity\t\tSubtotal");
        System.out.println("________________________________________________________________________________");
        for(Bill i : item) {
            System.out.println(i);
        }

        //Display the grand total
        System.out.println("\nGrand total is \t\t\t\t\t\t\t\t$" + grandTotal);
    }
}
