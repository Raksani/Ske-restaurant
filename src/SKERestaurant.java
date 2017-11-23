import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class SKERestaurant {
	private static Scanner sc = new Scanner(System.in);
	private static String[] menu;
	private static double[] prices;
	private static int[] qty;
	private static int MenuSize;
	static RestaurantManager Menu;
	private static double Total = 0;
	private static ArrayList<String> quantities = RestaurantManager.Quantities;
	
	public static void main(String[] args) throws IOException {
		RestaurantManager.readFile();
		ArrayList<String> menuitems = RestaurantManager.MenuItems;
		ArrayList<String> quantities = RestaurantManager.Quantities;
		menu = RestaurantManager.getMenuItems();
		prices = RestaurantManager.getPrices();
		qty = getQuantity();
		MenuSize = RestaurantManager.getMenuItemsSize();
		PrintWelcome();
		PrintList();
		PrintFunctions();
		getChoices();
	}

	//Print head of the menu
	private static void PrintWelcome() {
		System.out.println("---------- Welcome to SKE Restaurant ----------");
		System.out.println("-----------------------------------------------");
	}
	//print menu list
	private static void PrintList() {
		System.out.println("---------------------- Menu -------------------");
		for (int i = 0; i < MenuSize; i++) {
			System.out.printf("[%d]   %-20s  %5.2f %n", i + 1, menu[i], prices[i]);
		}
	}
	//print choices 
	private static void PrintFunctions() {
		System.out.print("[I]nput Order.\n");
		System.out.println("[C]heck Order.");
		System.out.println("[V]View Menu.");
		System.out.println("[B]ill");
		System.out.println("[E]xit.");
	}

	//change quantities to int array names qty
	public static int[] getQuantity() {
		int [] qty = new int[quantities.size()];
		for (int i = 0; i < quantities.size(); i++) {
			qty[i] = 0;
		}
		return qty;
	}
	//get the choice which user inputed and call the method to do the command
	//If Input wrong choice,User has to input the new choice.
	public static void getChoices() {
		while (true) {
			System.out.print("Choice : ");
			String choice = sc.nextLine();
			choice = choice.toLowerCase();
			Scanner sc = new Scanner(System.in);
			switch (choice) {
			case "i":
				System.out.print("What menu do you want? : ");
				getOrder(sc.nextLine());
				break;
			case "c":
				Order();
				break;
			case "v":
				PrintList();
				break;
			case "b":
				Bill();
				break;
			case "e":
				System.out.println("Bye.");
				exit();
				break;
			default:
				System.out.println("Please input your choice again.");
				break;
			}
			if (choice.equals("e")) {
				Bill();
				exit();
				break;
			}
		}
	}

	public static boolean exit() {
		return false;
	}
	//if choice is in the list(less than 7) then ask user for enter the quantity
	//collect the quantity to qty[] 
	public static void getOrder(String choice) {
		int choicenum = Integer.parseInt(choice);
		if (choicenum > 0 && choicenum <= MenuSize) {
			System.out.print("Enter your Quantity : ");
			int Q = Integer.parseInt(sc.nextLine());
			qty[choicenum-1] += Q;
		}
	}
	//print out the menu list which user has been ordered
	public static void Order() {
		System.out.println("+---------  Menu  ---------+--  Qty  --+---  Price  ---+");
		for (int i = 0; i < MenuSize; i++) {
			if (qty[i] != 0) {
				System.out.printf("| %-25s| %8d  |  %10.2f   | %n", menu[i].substring(0,1).toUpperCase()+menu[i].substring(1,menu[i].length()), qty[i],
					      prices[i] * qty[i]);
			}
		}
		System.out.println("+--------------------------+-----------+---------------+");
	}
	//get the total and print it
	//not only included tax but also excluded tax 
	//user input the cash tendered and it will print the change out 
	public static void Bill() {
		double total = 0.0;
		for (int i = 0; i < MenuSize; i++) {
			if (qty[i] != 0) {
				total += Total + prices[i] * qty[i];
			}
		}
		System.out.printf("Total : %.2f\n", total);
		System.out.printf("Subtotal : %.2f \n", total * (93.0 / 100.0));
		System.out.printf("Tax (7");
		System.out.print("%");
		System.out.printf(") : %.2f \n", total * (7.0 / 100.0));
		System.out.print("Cash Tendered : ");
		double cash = Double.parseDouble(sc.nextLine());
		System.out.print("-----------------------------------------");
		System.out.printf("%nChange : %.2f\n", cash - total);
		System.out.println("----------------Thank You----------------");
	}

}