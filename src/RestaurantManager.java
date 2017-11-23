import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class RestaurantManager {
	//create arraylist to collect menuitems price and quantity
	public static ArrayList<String> MenuItems = new ArrayList<>();
	public static ArrayList<Double> Prices = new ArrayList<>();
	public static ArrayList<String> Quantities = new ArrayList<>();
	//use String filename as a directory
	static final String filename = "data/menu.txt";
	//readFile() to read text file(menu.txt) which we write menu and price
	public static void readFile() {
		File file = null;
		try {			
			file = new File("src/data/menu.txt");
			//in case of getting wrong directory it will print caution text out
		}catch (Exception e){
			System.out.println("Could not access file " + filename);
			return;
		}
		BufferedReader reader;
		try {
		//announce the reader as a BufferedReader use Filereader read the directory,file
			reader = new BufferedReader(new FileReader(file));
		/*do not read the line which starts with #
		and if it doesn't start with # then read it and collect to array until found the ";" then split the word
		the first array will be in array[0] names MenuItems.
		Prices will be the array[1] as well
		*/
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
	//change menuitems to string array names menu 
	public static String[] getMenuItems() {
		String [] menu = new String[MenuItems.size()];
		for (int i = 0; i < MenuItems.size(); i++) {
			menu[i] = MenuItems.get(i);
		}
		return menu;
	}

	public static double[] getPrices() {
		double [] Price = new double[Prices.size()];
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
