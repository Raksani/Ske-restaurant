package elab6;

import java.util.Scanner;

public class cal {
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
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Input initial Value : ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print("Input Operator : ");
		String op = sc.next();
		System.out.print("Input Number : ");
		double y = sc.nextDouble();
		System.out.printf("Present Value = %.4f",calculate(x,op,y));
		

	}

}
