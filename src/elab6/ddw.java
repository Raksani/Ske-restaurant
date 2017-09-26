package elab6;
import java.util.Random;
import java.util.Scanner;

public class ddw {
	static Scanner sc = new Scanner(System.in);
	public static int Random(){
		Random rand = new Random();
		int n = rand.nextInt(999) + 0; //Random a number between 999-0
		System.out.println("Note: the random number is "+n);
		return n;
	}
	public static String game(){
		int i=1;
		int x = Random();
		while(true)
		{
			System.out.print("Guess a number (0-999):");
			int num = sc.nextInt();
			if(num==x)
			{
				System.out.println("Correct! Well done!");
				System.out.printf("Total tries = %d",i);
				System.out.println("\n-------------------");
				System.out.print("(P)lay again,(Q)uit:");
				String pq = sc.next();
				return pq;
			}
			else if(num>x)
			{
				System.out.printf("More than (Tries:%d)\n",i);
			}
			else if(num<x)
			{
				System.out.printf("Less than (Tries:%d)\n",i);
			}
			i++;
		}
	}
	public static void main(String[] args) {
		while(game().equals("p"))
		{}
		System.out.print("Bye Bye");
		
	}
		

	}


