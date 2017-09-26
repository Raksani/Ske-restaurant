package elab6;

import java.util.Scanner;

public class palindrome {
	public static boolean isPalindrome( long number ) {
		String collect = "";
		long realnumber = number;
		while(number>0){
		long last = number%10;
		number = number/10;
		collect += last;
		}
		if(realnumber==Long.parseLong(collect))
		{
			return true;
		}
			return false;
	}
	public static void main(String[] args) {
		System.out.print("Input a number : ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		if(isPalindrome(num))
		{
			System.out.printf("%d is palindrome number.",num);
		}
		else
		{
			System.out.printf("%d is not palindrome number.",num);
		}
	}

}
