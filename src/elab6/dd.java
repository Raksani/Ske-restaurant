package elab6;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("--------- Welcome to SKE by Ing Restaurant ---------");
		  System.out.printf("1.) Pizza\t\t %5d Bath.\n", 250);
		  System.out.printf("2.) Chicken\t\t %5d Bath.\n", 120);
		  System.out.printf("3.) Coke\t\t %5d Bath.\n", 45);
		  System.out.printf("4.) Sandwich\t\t %5d Bath.\n", 100);
		  System.out.printf("5.) Total\n");
		  System.out.printf("6.) Exit\n");
		  System.out.println();

		  int pizza = 250;
		  int chicken = 120;
		  int coke = 45;
		  int sandwich = 100;
		  int p = 0;
		  int chick = 0;
		  int co = 0;
		  int sand = 0;
		  int pr1 = pizza * p;
		  int pr2 = chick * chick;
		  int pr3 = coke * co;
		  int pr4 = sandwich * sand;
		  while (true) {
		   System.out.print("Enter your Choice: ");
		   int ch = sc.nextInt();
		   if (ch == 6) {
		    System.out.print("Thank you Bye Bye :D");
		    break;

		   } else if (ch == 5) {
		    System.out.println("+------ Menu ------+---- Qty ------+------ Price --------+");
		    if (p > 0) {
		     pr1 = pizza * p;
		     System.out.printf("| Pizza\t\t   | \t %7d   | \t%7d \t |\n", p, pr1);
		     System.out.println("+------------------+---------------+---------------+");
		    }
		    if (chick > 0) {
		     pr2 = chicken * chick;
		     System.out.printf("| Chickens\t   | \t %7d   | \t%7d \t |\n", chick, pr2);
		     System.out.println("+------------------+---------------+---------------+");

		    }
		    if (co > 0) {
		     pr3 = coke * co;
		     System.out.printf("| Coke\t\t   | \t %7d   | \t%7d \t |\n", co, pr3);
		     System.out.println("+------------------+---------------+---------------+");

		    }
		    if (sand > 0) {
		     pr4 = sandwich * sand;
		     System.out.printf("| Sandwich\t   | \t %7d   | \t%7d \t |\n", sand, pr4);
		     System.out.println("+------------------+---------------+---------------+");

		    }
		    int all = pr1 + pr2 + pr3 + pr4;
		    System.out.printf("| total\t\t   | \t     | \t%7d \t |\n", all);
		    System.out.println("+------------------+---------------+---------------+");
		   } else {
		    System.out.print("Enter Quantity: ");
		    int qu = sc.nextInt();
		    if (ch == 1) {
		     p = p + qu;
		    } else if (ch == 2) {
		     chick = chick + qu;
		    } else if (ch == 3) {
		     co = co + qu;
		    } else if (ch == 4) {
		     sand = sand + qu;

		    }
		   }
		  }

	}

}
