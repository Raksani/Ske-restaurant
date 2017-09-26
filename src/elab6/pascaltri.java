package elab6;

import java.util.Scanner;

public class pascaltri {
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
		System.out.print("Enter size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%3.0f",combination(i,j));
			}
			System.out.println();
		}

	}

}
