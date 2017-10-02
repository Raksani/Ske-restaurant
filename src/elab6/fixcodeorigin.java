package elab6;

	//TODO This Javadoc comment is in the wrong place. Fix it.
	//TODO put your name after the @author tag. Then delete this TODO.
	/**
	 * Console-based code to find the min and max of a polynomial
	 * on a given interval.  The polynomial is
	 *          a*x^2 + b*x + c  where  x in [xmin,xmax]
	 * Values of a, b, c, xmin, xmax are read from the console.
	 * 
	 * Improve this code so that it uses good coding principles,
	 * namely:
	 * 1) avoid duplicate code - use methods for repeated operations
	 * 2) use descriptive names
	 * 3) write methods that do just one thing
	 * 4) avoid putting program logic in the main() method
	 * 
	 * TODO: Implement the changes described in "//TODO" comments.
	 * After you do them, DELETE the to-do comments.
	 * Eclipse shows to-do items with a BLUE CHECKBOX in the left margin.
	 * IntelliJ shows "to-do" comments in BLUE.
	 * Netbeans doesn't highlight to-do items by default.
	 * 
	 * There should not be any to-do comments in your submitted code!
	 * (points deducted if there are)
	 * 
	 * @author your name
	 */

	import java.util.Scanner;
	public class fixcodeorigin {   //TODO Rename the class to use Java Naming Convention.
		
		//TODO Move the "Scanner console" variable from the main method to here,
		//TODO and make it a static (class) attribute. That way all methods can use the scanner.

		//TODO these variable are only used in one method, so make them local
		// variables instead of static attributes.  "Localize variables when possible".
		// You should declare them at the point where they are first used in the method,
		// not at the top of method.
		static int a, b, c;
		
		/**
		 * Find the min and max values of a quadratic function a*x^2 + b*x + c
		 * using input values read from the console.
		 * @param args not used.
		 */
		public static void main(String[] args) {
			//TODO Change this Scanner variable to a static attribute of the class so that
			//TODO other methods can access it.
			//TODO Move the "Scanner console =..." line to the beginning of class body
			//TODO and add "public static" to the declaration: public static Scanner console =...
			Scanner console = new Scanner(System.in);
			
			System.out.println("Find min and max of the polynomial a*x^2 + b*x + c");
			
			// Ask for the values of a, b, c that define a quadratic
			// function: a*x*x + b*x + c = (a*x + b)*x + c
			//TODO Use the getIntReply method instead of this REDUNDANT code.
			System.out.print("Enter a: ");
			a = console.nextInt();
			System.out.print("Enter b: ");
			b = console.nextInt();	
			System.out.print("Enter c: ");
			c = console.nextInt();
			
			// get the start value (sv) and end value (ev) of the interval to search
			//TODO 1) Use descriptive variable names! Change sv and ev to better names.
			//  Choose your own names, or use xMin and xMax.
			// Your IDE can rename variables for you: 
			// a) select the variable and b) choose Refactor->Rename,
			// OK to rename them yourself, but slooower.
			//TODO 2) Use the getIntReply method instead of this redundant code.
			System.out.print("Enter left (min) value of x: ");
			int sv = console.nextInt();
			System.out.print("Enter right (max) value of x: ");
			int ev = console.nextInt();
			
			if (ev < sv) {
				System.out.println("Invalid range. Must have min value <= max value.");
				System.exit(1);
			}
			
			//TODO This loop is not efficient.  For a polynomial you can easily find
			// the value of x where the polynomial is a minimum by using its derivative. 
			// Don't forget to check the end-points of the  interval for the min.
			//TODO Write method named findMin(a, b, c, xMin, xMax) to compute and return
			//     the value of x where the minimum occurs in the interval [xMin, xMax].
			//TODO Call that method instead of this loop.
			double minX = sv;
			double minValue = (a*minX + b)*minX + c;
			// this is stupid. the minX value might not be an integer.
			for(int x=sv; x<=ev; x++) {
				double f = (a*x + b)*x + c;
				if (f < minValue) {
					minValue = f;
					minX = x;
				}
			}
			
			// Find max value of polynomial.
			//TODO Reuse the findMin function to do this.
			//TODO Use the property:   min{f(x)} = -max{-f(x)}
			double maxX = sv;
			double maxValue = (a*maxX + b)*maxX + c;
			for(int x=sv; x<=ev; x++) {
				double f = (a*x + b)*x + c;
				if (f > maxValue) {
					maxValue = f;
					maxX = x;
				}
			}
			
			// Print the results
			System.out.printf("The min value is %f at x=%f\n", minValue, minX);
			System.out.printf("The max value is %f at x=%f\n", maxValue, maxX);
			
			//TODO Don't put program logic in the main method.
			//TODO Put all this code is a method named solveMinMax and simply
			//TODO call solveMinMax from main.
		}
		
		/**
		 * Print a prompt message and read an integer from the console.
		 * Return the value read from console.
		 * @param prompt  a prompt message to print
		 * @return  the user's reply as an "int"
		 */
		public static int getIntReply(String prompt) {
			//TODO Complete this method (and remove this comment)
			// Print the prompt string and read an int from the console.  Return the value.
			return 0;
		}
		
		//TODO define a polyval() method as described here.
		// Use polyval in your code instead of repeating the computation.
		/**
		 * Evaluate a quadratic a*x^2 + b*x +c at a given value.
		 * For example, y = polyval(x, a, b, c).
		 */
		public static double polyval(/*add the parameters*/) {
			return 0; //TODO implement this
		}
	}
