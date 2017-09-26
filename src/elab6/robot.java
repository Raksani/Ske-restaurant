package elab6;

import java.util.Scanner;

public class robot {
	public static void Location(String direction){
		int x=0,y=0,sumy=0,sumx=0;
		for(int i =0;i<direction.length();i++)
		{
			switch(direction.charAt(i))
			{
				case 's':
				case 'S':
					y = y-1;
					sumy += y;
					break;
				case 'n':
				case 'N':
					y = y+1;
					sumy += y;
					break;
				case 'w':
				case 'W':
					x = x-1;
					sumx += x;
					break;
				case 'e':
				case 'E':
					x = x+1;
					sumx += x;
					break;
			}
			
		}
		System.out.printf("Final robot location: x = %d, y = %d.",sumx,sumy);
	}
	public static void MoveCount(String input){
		int count=0;
		for(int i = 0;i<input.length();i++)
		{
			if(input.charAt(i)==input.charAt(i+1))
			{
				if(input.charAt(i)=='N' || input.charAt(i)=='n')
				{
					count = count+1;
				}
				if(input.charAt(i)=='E' || input.charAt(i)=='e')
				{
					count = count+1;
				}
				if(input.charAt(i)=='W' || input.charAt(i)=='w')
				{
					count = count+1;
				}
				if(input.charAt(i)=='S' || input.charAt(i)=='s')
				{
					count = count+1;
				}
				else
				{
					if(input.charAt(i)=='N' || input.charAt(i)=='n'){
					System.out.printf("Move to North %d unit(s).",count);
					count = 1;
					}
					else if(input.charAt(i)=='E' || input.charAt(i)=='e'){
						System.out.printf("Move to East %d unit(s).",count);
						count = 1;
						}
					else if(input.charAt(i)=='W' || input.charAt(i)=='w'){
						System.out.printf("Move to West %d unit(s).",count);
						count = 1;
						}
					else if(input.charAt(i)=='S' || input.charAt(i)=='s'){
						System.out.printf("Move to South %d unit(s).",count);
						count = 1;
						}
				}
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.print("Input String command for robot: ");
		Scanner sc = new Scanner(System.in);
		String di = sc.next();
		System.out.println("Robot Will");
		MoveCount(di);
		Location(di);
		
		

	}

}
