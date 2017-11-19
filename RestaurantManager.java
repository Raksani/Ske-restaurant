import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantManager {
	static ArrayList<String> MenuItems = new ArrayList<>();
	static ArrayList<Double> Prices = new ArrayList<>();
	static final String filename = "data/menu.txt";
	static final String recordorder = "data/recordoder.txt";

	public void readFile() {
		ClassLoader loader = RestaurantManager.class.getClassLoader();
		InputStream in = loader.getResourceAsStream(filename);
		if (in == null) {
			System.out.println("Could not access file " + filename);
			return;
		}
		Scanner reader = new Scanner(in);
		while (reader.hasNextLine()) {
			try {
				String line = reader.nextLine().trim();
				if (line.charAt(0) != '#') {
					String[] cut = line.split(";");
					MenuItems.add(cut[0]);
					Prices.add(Double.parseDouble(cut[1]));
				}
			} catch (Exception e) {

			}
		}
		reader.close();
	}

	public static void writeToFile(String Orders) throws IOException {
		File output = new File(recordorder);
		FileOutputStream out;
		try {
			out = new FileOutputStream(output, true);
			out.write(Orders.getBytes());
		} catch (FileNotFoundException a) {
			System.out.println("Couldn't open output file " + output);
			return;
		}
		out.close();
	}

	public static String[] getMenuItems() {
		String[] Menu = new String[MenuItems.size()];
		return MenuItems.toArray(Menu);
	}

	public static double[] getPrices() {
		double[] Price = new double[Prices.size()];
		for (int i = 0; i < Prices.size(); i++) {
			Price[i] = Prices.get(i);
		}
		return Price;
	}
	// public static void recordOrder(int orderNumber, int[] order, double
	// total){
	// String[] result = getMenuItems();
	// }
}
