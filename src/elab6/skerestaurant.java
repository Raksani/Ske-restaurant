package elab6;

import java.util.Scanner;

public class skerestaurant {
	
	public static void main(String[] args) {
		int pricepizza=0,pricechickens=0,pricecoke=0,sum=0,q,choice;
		int qp=0,qc=0,qco=0;
		pricepizza=250*qp;
		pricechickens = 120*qc;
		pricecoke = 45*qco;
		System.out.println("--------- Welcome to SKE Restaurant ---------");
		System.out.println("1.) Pizza\t250 Bath.\n2.) Chickens\t120 Bath.\n3.) Coke\t45 Bath.\n4.) Total\n5.) Exit");
		while(true)
		{
			System.out.print("Enter your Choice: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			if(choice==5)
			{
				System.out.printf("Pay : ");
				int pay = sc.nextInt();
				System.out.printf("Change : %d\n",pay-sum);
				System.out.print("===Thank You===");
				break;
			}
			else if(choice==4)
			{
				System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
				if(qp>0)
						{
						pricepizza = 250*qp;
						System.out.printf("|Pizza             |    %d    |      %d  |\n",qp,pricepizza);
						System.out.printf("+------------------+---------+-----------+\n");
						}
				if(qc>0)
						{
						pricechickens = 120*qc;
							System.out.printf("|Chickens          |    %d    |      %d  |\n",qc,pricechickens);
							System.out.printf("+------------------+---------+-----------+\n");
						}
			   if(qco>0)
						{
				   		pricecoke = 45*qco;
				   		System.out.printf("|Coke              |    %d    |      %d   |\n",qco,pricecoke);
						System.out.printf("+------------------+---------+-----------+\n");
						}
				sum = pricepizza+pricechickens+pricecoke;
				System.out.printf("|Total                       |      %d  |\n",sum);
				System.out.printf("+------------------+---------+-----------+\n");
			}
			else
				{
				System.out.print("Enter Quantity: ");
				q = sc.nextInt();
			switch(choice)
			{
				case 1: 
					qp = qp + q;
					break;
				case 2: 
					qc = qc + q;
					break;
				case 3: 
					qco = qco + q;
					break;
			
			}
			}
			}
		}
}		
		
