/**
 * @description Class Rectangle represents a rectangle with length and width,
 * provides methods to calculate area and perimeter.
 * @author Bui Quang Thuan | 24711531
 * @version 1.0
 * @created 2025-08-27
 */


package iuh.fit.is;



public class Rectangle {
  private double length ;
  private double width ; 
  
  //create constructor
  public Rectangle() {
	  this.length = 0 ;
	  this.width = 0 ;
  }
  
  public Rectangle(double length , double width) {
	if(length < 0 || width < 0 ) {
	 System.out.println("Length and width must be greater than 0");
  }else {
	  this.length = length ;
	 this.width = width;
  }
  }
  
  //property get
  public double getLength () {
	  return length ; 
  }
  
  public double getWidth() {
	  return width ;
  }

  //property set
  public void setLength(double newVal) {
	if(newVal <0) {
		System.out.println("Length must be greater than 0 ");
	}else {
	this.length = newVal ; 
  }
  }
	 public void setWidth(double newVal) {
			if(newVal <0) {
				System.out.println("Width must be greater than 0 ");
			}else {
			this.width = newVal ; 
		  }
	 }
  
//mehtod
   public double getArea() {
	   return width * length ; 
   }
   public double getPerimeter() {
	   return (width + length)*2 ; 
   }
	 }
	  

