import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class SKERestaurant {
	static final Scanner sc = new Scanner(System.in);
	public static String[] menu;
	public static double[] prices;
	static RestaurantManager Menu;
	public static double Total = 0;

	public static void main(String[] args) throws IOException {
		RestaurantManager.readFile();
		ArrayList<String> menuitems = RestaurantManager.MenuItems;
		RestaurantManager.getMenuItems();
		RestaurantManager.getPrices();
		RestaurantManager.getQuantity();
		PrintWelcome();
		PrintList();
		PrintFunctions();
		getChoices();
	}

	public static void PrintWelcome() {
		System.out.println("---------- Welcome to SKE Restaurant ----------");
		System.out.println("-----------------------------------------------");
	}

	public static void PrintList() {
		System.out.println("---------------------- Menu -------------------");
		for (int i = 0; i < RestaurantManager.getMenuItemsSize(); i++) {
			System.out.printf("[%d]   %s \t\t%.2f %n", i + 1, RestaurantManager.Menu[i], RestaurantManager.Price[i]);
		}
	}

	public static void PrintFunctions() {
		System.out.print("[I]nput Order.\n");
		System.out.println("[C]heck Order.");
		System.out.println("[V]View Menu.");
		System.out.println("[B]ill");
		System.out.println("[E]xit.");
	}

	// public static void PrintMenu() {
	// Menu.readFile();
	// menu = Menu.getMenuItems();
	// prices = Menu.getPrices();
	// Recoredorder = new int[menu.length];
	// System.out.println("---------------------- Menu -------------------");
	// for (int i = 0; i < menu.length; i++) {
	// System.out.printf("\t%2d.", i + 1);
	// for (int j = i; j <= i; j++) {
	// System.out.printf("%s %f Baht.\n", menu[j], prices[j]);
	// }
	// }
	// System.out.println(" Input 0 to Finish Order. ");
	// }

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

	public static void getOrder(String choice) {
		int choicenum = Integer.parseInt(choice);
		if (choicenum > 0 && choicenum <= RestaurantManager.getMenuItemsSize()) {
			System.out.print("Enter your Quantity : ");
			int Q = Integer.parseInt(sc.nextLine());
			RestaurantManager.qty[choicenum-1] += Q;
		}
	}

	public static void Order() {
		System.out.println("+---------  Menu  ---------+--  Qty  --+---  Price  ---+");
		for (int i = 0; i < RestaurantManager.MenuItems.size(); i++) {
			if (RestaurantManager.qty[i] != 0) {
				System.out.printf("| %-25s| %8d  |  %10.2f   | %n", RestaurantManager.Menu[i].substring(0,1).toUpperCase()+RestaurantManager.Menu[i].substring(1,RestaurantManager.Menu[i].length()), RestaurantManager.qty[i],
					      RestaurantManager.Price[i] * RestaurantManager.qty[i]);
			}
		}
		System.out.println("+--------------------------+-----------+---------------+");
	}

	public static void Bill() {
		double total = 0.0;
		for (int i = 0; i < RestaurantManager.MenuItems.size(); i++) {
			if (RestaurantManager.qty[i] != 0) {
				total += Total + RestaurantManager.Price[i] * RestaurantManager.qty[i];
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
