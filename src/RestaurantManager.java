import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantManager {
	public static ArrayList<String> MenuItems = new ArrayList<>();
	public static ArrayList<Double> Prices = new ArrayList<>();
	public static ArrayList<String> Quantities = new ArrayList<>();
	static final String filename = "data/menu.txt";
	public static String[] Menu;
	public static double[] Price;
	public static int[] qty;

	public static void readFile() {
		File file = null;
		try {			
			file = new File("src/data/menu.txt");
		}catch (Exception e){
			System.out.println("Could not access file " + filename);
			return;
		}
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String readline = reader.readLine();
			while (readline != null) {
				if (!readline.startsWith("#")) {
					String[] array = readline.split(";");
					MenuItems.add(array[0]);
					Prices.add(Double.parseDouble(array[1]));
					Quantities.add("0");
				}
				readline = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int getMenuItemsSize(){
		return MenuItems.size();
	}

	public static String[] getMenuItems() {
		Menu = new String[MenuItems.size()];
		return MenuItems.toArray(Menu);
	}

	public static double[] getPrices() {
		Price = new double[Prices.size()];
		for (int i = 0; i < Prices.size(); i++) {
			Price[i] = Prices.get(i);
		}
		return Price;
	}

	public static int[] getQuantity() {
		qty = new int[Quantities.size()];
		for (int i = 0; i < Quantities.size(); i++) {
			qty[i] = 0;
		}
		return qty;
	}
	// public static void recordOrder(int orderNumber, int[] order, double
	// total){
	// String[] result = getMenuItems();
	// }
}
