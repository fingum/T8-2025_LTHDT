
/**
 * @description Class TestRectangle is used to test Rectangle class
 * by creating objects and displaying area and perimeter.
 * @author Bui Quang Thuan | 24711531
 * @version 1.0
 * @created 2025-08-27
 */

package iuh.fit.is;

public class TestRectangle {
	/**
	 * Main method to run the Rectangle test
	 * @param args command line arguments
	 */
  public static void main(String[] args) {
	// Create an object using the parameterized constructor
	 Rectangle r = new Rectangle(5,3);
	 System.out.println("length :" + r.getLength());
	 System.out.println("width :"+r.getWidth());
     System.out.println("Areas :"+r.getArea());    	  
	 System.out.println("Perimeter"+r.getPerimeter());
	 System.out.println("-------------------");
	 
	// Create an object using the wrong parameterized constructor
	 Rectangle r2 = new Rectangle(-5,3);
	 System.out.println("length :" + r2.getLength());
	 System.out.println("width :"+r2.getWidth());
     System.out.println("Areas :"+r2.getArea());    	  
	 System.out.println("Perimeter"+r2.getPerimeter());
	 System.out.println("-------------------");
}
}
