package elab6;

import java.util.Scanner;

public class cal2 {
	static double n1 =0;
	public static  double  calculate(double x, String operation, double y) {
	double sum=0;
		if(operation.equals("+"))
		{
			sum  = x+y;
		}
		else if(operation.equals("-"))
		{
			sum = x-y;
		}
		else if(operation.equals("*"))
		{
			sum  = x*y;
		}
		else if(operation.equals("/"))
		{
			sum  = x/y;
		}
		else
		{
		}
		n1 = sum;
		return sum;
		
	}
	public static void main(String[] args) {

		double y =0;
		String op;
		System.out.print("Input initial Value : ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		System.out.println();
		while(true)
			{
				System.out.print("Input Operator : ");
				op = sc.next();
				if(!(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")))
				{
					System.out.println("\nFinish Calculation.");
					System.out.printf("End Value is %.4f\n",n1);
					break;
				}
				System.out.print("Input Number : ");
				y = sc.nextDouble();
				System.out.printf("Present Value = %.4f\n\n",calculate(n1,op,y));
			}
		}
	}
