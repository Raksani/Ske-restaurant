package elab6;
import java.util.Scanner;
public class met1 {
	      public static void a(int x) {
	          x += 2;
	          x += c();
	         System.out.printf("x = %d in a\n", x);
	     }
	 
	     public static int b(int y) {
	         y = c() * y;
	         System.out.printf("y = %d in b\n", y);
        return y;
	     }
	 
	     public static int c() {
	         int x = 3;
	         System.out.printf("x = %d in c\n", x);
	         return x + 2;
	     }
	 
	    public static int d(int y) {
	         y += 5;
         y = b(y);
	        b(y);
	         System.out.printf("y = %d in d\n", y);
	        return y;
	     }
	 
	     public static void main(String[] args) {
	         int x = 3, y = 0;
	         a(x);
	         y = d(y);
	         System.out.printf("x = %d, y = %d in main", x, y);
	     }
	    }


