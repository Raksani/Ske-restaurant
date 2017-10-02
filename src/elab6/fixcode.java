package elab6;

import java.util.Scanner;

public class fixcode {
static int a,b,c,xMin,xMax,getV,A,B,C;
static double minX = xMin,minValue,maxValue,maxX = xMax;
public static Scanner console = new Scanner(System.in);
public static int getIntReply(String prompt) {
	if(prompt.equals("min"))
	{
		System.out.print("Enter left (min) value of x: ");
	}
	else if(prompt.equals("max"))
	{
		System.out.print("Enter right (max) value of x: ");
	}
	else
	{
		System.out.printf("Enter %s: ",prompt);
	}
	getV = console.nextInt();
	return getV;
}
public static double polyval(int v1,int v2,int v3,double v4) {
	double eq = (v1*v4 + v2)*v4 + v3;
	return eq;
}
public static void findMin(int a,int b,int c,int min,int max,char choose){
	double minX = xMin;
	minValue = polyval(a,b,c,minX);
	for(double x=min; x<=max; x++) {
		double f = polyval(a,b,c,x);
		if(choose=='Y'){
			if (f < minValue) {
				minValue = f;
				minX = x;
			}
		}
		else if(choose=='N'){
			if (f > minValue) {
				minValue = f;
				maxValue = minValue;
				minX = x;
				maxX = minX;
			}
		}
	}
}
public static void SolveMinMax(){
	findMin(A,B,C,xMin,xMax,'Y');
	System.out.printf("The min value is %f at x=%f\n", minValue, minX);
	findMin(A,B,C,xMin,xMax,'N');
	System.out.printf("The max value is %f at x=%f\n", maxValue, maxX);
}
public static void checkrange(int w1,int w2){
	if (w2 < w1) {
		System.out.println("Invalid range. Must have min value <= max value.");
		System.exit(1);
	}
}
	public static void main(String[] args) {
		System.out.println("Find min and max of the polynomial a*x^2 + b*x + c");
		A = getIntReply("a");
		B = getIntReply("b");
		C = getIntReply("c");
		xMin = getIntReply("min");
		xMax = getIntReply("max");
		checkrange(xMin,xMax);
		SolveMinMax();
		
	}

}
