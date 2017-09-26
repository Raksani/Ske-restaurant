package elab6;
//elab-source:test.java
import java.util.Scanner;
public class testw{
static Scanner sc = new Scanner(System.in);
	public static int printandscan(String x) {
		System.out.print(x);
		int a = sc.nextInt();
		return a;
	}
	static void menu(int pizza , int chickens,int coke) {
		System.out.print(" _______________________________________________________\n");
		System.out.print("|_______ Menu __________|_____ Qty _____|_____ Price ___|\n");
		if(pizza>0)System.out.printf("|\tPizza\t\t|\t%d\t|\t%d\t|\n",pizza,pizza*250);
		if(chickens>0)System.out.printf("|\tChickens\t|\t%d \t|\t%d\t|\n",chickens,chickens*120);
		if(coke>0)System.out.printf("|\tCoke\t\t|\t%d\t|\t%d\t|\n",coke,coke*45);
		System.out.print("|_______________________|_______________|_______________|\n");
		System.out.printf("|\tTotal\t\t\t\t\t%d\t|\n",(pizza*250)+(chickens*120)+(coke*45));
		System.out.print("|_______________________________________________________|\n");
	}
	public static void main(String[] args) {
		
		System.out.println("-------------- Welcome to SKE Restautant --------------");
		System.out.printf("1.) Pizza\t\t%5d Baht.\n"+"2.) Chickens\t\t%5d Baht.\n"+"3.) Coke\t\t%5d Baht.\n", 250,120,45);
		System.out.println("4.) Total\n5.) Exit\n");
		int quantity=0,sump=0,sumc=0,sumco=0;
		
		while (true) {
			int choice = printandscan("Enter your Choice: ");
			if (choice == 5) {
				break;
			}
				
			
			else if(choice == 1 || choice == 2 || choice == 3){
			quantity = printandscan("Enter Quantity: ");
			System.out.println("");
			if(choice == 1) {
				sump+= quantity;	
			}
			else if(choice == 2) {
				sumc += quantity;	
			}
			else if(choice == 3) {
				sumco += quantity;	
			}
			
		}else if(choice== 4) {
			menu(sump, sumc, sumco);
			System.out.println();
		}
		

	}System.out.println("====== THANK YOU ======");

	
}
}
