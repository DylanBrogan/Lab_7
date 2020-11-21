
public class paintLab2 {
	import java.util.Scanner;
	import java.lang.Math;     // Note: Needed for math functions in part (3)

	public class PaintEstimator {
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double paintNeeded;
	      double cansNeeded;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();                      // FIXME (1): Prompt user to input wall's width
	      
	      // Calculate and output wall area
	      wallArea = (wallHeight * wallWidth);                        // FIXME (1): Calculate the wall's area
	      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
	      
	      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
	      paintNeeded = (wallArea / 350.0);
	      System.out.println("Paint needed: " + paintNeeded + " gallons");
	      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	      if (paintNeeded < 0.5){
	         cansNeeded = (Math.round(paintNeeded + 1));
	         }
	      else{
	         cansNeeded = Math.round(paintNeeded);
	      }
	      int cansNeed = (int)cansNeeded;
	      System.out.println("Cans needed: " + cansNeed + " can(s)");
	   }
	}
}
