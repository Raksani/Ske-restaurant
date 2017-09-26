package elab6;

import java.util.Scanner;

public class combination {

	public static double combination(double n,double r){
		double fact1=1,fact2=1,fact3=1;
		for(int i=1;i<=n;i++)
		{
			fact1=fact1*i;
		}
		for(int j=1;j<=r;j++)
		{
			fact2 = fact2*j;
		}
		for(int k=1;k<=Math.abs(n-r);k++)
		{
			fact3 = fact3*k;
		}
		return fact1/(fact2*fact3);
	}
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		System.out.print("Enter r: ");
		double b = sc.nextInt();
		System.out.printf("Combination of (%.0f,%.0f) is %.0f",a,b,combination(a,b));
		
		
		

	}

}
