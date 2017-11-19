import java.util.Scanner;
import java.io.IOException;

public class SKERestaurant {
	static final Scanner scan = new Scanner(System.in);
	public static String[] menu;
	public static double[] prices;
	public static int[] Recoredorder;
	static RestaurantManager Menu;
	public static int Qty = 0;
	public static double Price = 0.0;

	public static void main(String[] args) {
		PrintWelcome();
		PrintFunctions();
		PrintMenu();
		getChoices();
	}

	public static void PrintWelcome() {
		System.out.println("---------- Welcome to SKE Restaurant ----------");
		System.out.println("-----------------------------------------------");
	}

	public static void PrintFunctions() {
		System.out.print("[I]nput Order.\n");
		System.out.println("[C]heck Order.");
		System.out.println("[O]Checkout.");
		System.out.println("[E]xit.");
	}

	public static void PrintMenu() {
		Menu.readFile();
		menu = Menu.getMenuItems();
		prices = Menu.getPrices();
		Recoredorder = new int[menu.length];
		System.out.println("---------------------- Menu -------------------");
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("\t%2d.", i + 1);
			for (int j = i; j <= i; j++) {
				System.out.printf("%-30s %7.2f Baht.\n", menu[j], prices[j]);
			}
		}
		System.out.println("                 Input 0 to Finish Order.               ");
	}

	public static void getChoices() {
		System.out.print("Choice : ");
		String choice = scan.next();
		choice = choice.toLowerCase();
		switch (choice) {
		case "i":
			getOrder();
			break;
		case "c":
			reviewOrder();
			break;
		case "o":
			checkOut();
			break;
		case "e":
			System.out.println("Bye.");
			System.exit(0);
		default:
			System.out.println("Please input again");
			getChoices();
			break;
		}

	}

	public static void getOrder() {
		while (true) {
			System.out.print("Input your menu : ");
			int m = scan.nextInt();
			if (m == 0) {
				getChoices();
				break;
			}
	System.out.print("Enter your Quantity : ");
	int quant = scan.nextInt();
	Recoredorder[m - 1] += quant;
		}
	}

	public static void reviewOrder() {
		System.out.println("+---------  Menu  ---------+--  Qty  --+---  Price  ---+");
		for (int i = 0; i < Recoredorder.length; i++) {
			if (Recoredorder[i] != 0) {
				System.out.printf("|%-26s|%9d  | %12.2f  | \n", menu[i], Recoredorder[i], prices[i] * Recoredorder[i]);
				Qty += Recoredorder[i];
				Price += Recoredorder[i] * prices[i];
			}
		}
		System.out.printf("|%-26s|%9d  | %12.2f  | \n", "total", Qty, Price);
		System.out.println("+--------------------------+-----------+---------------+");
		getChoices();
	}
	public static void checkOut() {
		System.out.print("Give Me Your Money!!! : ");
		double cash = scan.nextDouble();
		do {
			if (cash < Price) {
				System.out.print("Give Me More!!! : ");
				cash += scan.nextDouble();
			}
		} while (cash < Price);
		{
			System.out.println("=========  Menu  =========  Qty  ======  Price  =====");
			for (int i = 0; i < Recoredorder.length; i++) {
				if (Recoredorder[i] != 0) {
					System.out.printf("|%-26s|%9d  | %12.2f  | \n", menu[i], Recoredorder[i], prices[i] * Recoredorder[i]);
				}
			}
			System.out.println("--------------------------------------------------------");
			System.out.printf("|%-26s|%9d  | %12.2f  | \n", "Total", Qty, Price);
			System.out.printf("|%-26s|%-9s  | %12.2f  | \n", "Cash", " ", cash);
			System.out.println("--------------------------------------------------------");
			System.out.printf("|%-26s|%-9s  | %12.2f  | \n", "Change", " ", cash - Price);
			System.out.println("--------------------------------------------------------");
			System.out.println("----------------THANK YOU -----------------");
		}
	}

	private SKERestaurant(RestaurantManager mn) {
		this.Menu = mn;
	}

}