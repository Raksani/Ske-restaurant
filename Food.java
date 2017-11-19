public class Food {
static String name;
static int price,quantity = 0;
//public Food(String Name, int Price) {
//		this.name = Name;
//		this.price = Price;
//	}
public int getQuantity(){
		return quantity;
	}
public void addQuantity(int add){
		quantity += add;
	}
	
}
