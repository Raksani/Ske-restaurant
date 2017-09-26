package elab6;

import java.util.Scanner;

public class unitconverter {

	 public static double convertBitToByte(int bit){
		 double byt = bit/8;
		 System.out.printf("%d bits = %.10f Byte",bit,byt);
		 return byt;
	 }
	 public static double convertBitToKB(int bit){
		 double kb = bit/(8*Math.pow(2,10));
		 System.out.printf("%d bits = %.10f KB",bit,kb);
		 return kb;
	 }
	 public static double convertBitToMB(int bit){
		 double mb = bit/(8*Math.pow(2,20));
		 System.out.printf("%d bits = %.10f MB",bit,mb);
		 return mb;
	 }
	 public static double convertBitToGB(int bit){
		 double gb = bit/(8*Math.pow(2,30));
		 System.out.printf("%d bits = %.10f GB",bit,gb);
		 return gb;
	 }
	 public static double convertBitToTB(int bit){
		 double tb = bit/(8*Math.pow(2,40));
		 System.out.printf("%d bits = %.10f TB",bit,tb);
		 return tb;
	 }
	public static void main(String[] args) {
		System.out.print("Welcome to conversion program\nInput file size (bits): ");
		Scanner sc = new Scanner(System.in);
		int bit = sc.nextInt();
		System.out.print("Which unit of your choice?\n1. Byte\n2. Kilobyte(KB)"
				+ "\n3. Megabyte(MB)\n4. Gigabyte(GB)\n5. Terabyte(TB)\n");
		System.out.print("Input your choice: ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				convertBitToByte(bit);
				break;
			case 2:
				convertBitToKB(bit);
				break;
			case 3:
				convertBitToMB(bit);
				break;
			case 4:
				convertBitToGB(bit);
				break;
			case 5:
				convertBitToTB(bit);
				break;
			default:
				System.out.print("Invalid command!");
				break;
		}
		System.out.print("\nThank you for using conversion program.");

	}

}
