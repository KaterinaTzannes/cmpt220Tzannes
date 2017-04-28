// Katerina Tzannes
// Lab 6
// Version 1
// April 4,2017

/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■ A no-arg constructor that creates a default rectangle.
■ A constructor that creates a rectangle with the specified width and height.
■ A method named getArea() that returns the area of this rectangle.
■ A method named getPerimeter() that returns the perimeter.
*/

 class Tzannes_9.1 {
   
  public static void main(String[] args) {

    SimpleRect rect1 = new SimpleRect(); 
    
    System.out.println( "A rectangle(R1) with width " + rect1.widthR1 + 
      " and height " + rect1.heightR1 + " has an area of " + 
      rect1.getAreaR1() + " and perimeter of " + rect1.getPerimeterR1());
    
    SimpleRect  rect2 = new SimpleRect();
    
    System.out.println( "A rectangle(R2) with width " + rect2.widthR2 +
      " and height " + rect2.heightR2 + " has an area of " + 
      rect2.getAreaR2() + " and perimeter of " + rect2.getPerimeterR2());
    
    // rect1.height = 100;
    // rect1.width = 2;
    
    // rect2.height = 3;
    // rect2.width = 33;
  } 
}

class SimpleRect{
  // had problems so I created them each individually
  double heightR1;
  double widthR1;
  double heightR2;
  double widthR2;
  
  // where to change numbers
  SimpleRect() {
    heightR1 = 4;
    widthR1 = 40;
    heightR2 = 3.5;
    widthR2 = 35.9;
  }
  
  SimpleRect(double newHeight, double newWidth) {
    heightR1 = newHeight;
    widthR1 = newWidth;
    heightR2 = newHeight;
    widthR2 = newWidth;
  }
  
  double getAreaR1(){ 
    return widthR1*heightR1; 
  } 
  
  double getAreaR2(){ 
    return widthR2*heightR2; 
  } 
    
  double getPerimeterR1(){ 
    return ( 2 *widthR1)+( 2 *heightR1);
  }
  
  double getPerimeterR2(){ 
    return ( 2 *widthR2)+( 2 *heightR2);
  }

  void setHeightR1(double newHeightR1) {
    heightR1 = newHeightR1;
  }
  
  void setWidthR1(double newWidthR1) {
    widthR1 = newWidthR1;
  }
  
  void setHeightR2(double newHeightR2) {
    heightR2 = newHeightR2;
  }
  
  void setWidthR2(double newWidthR2) {
    widthR1 = newWidthR2;
  }
    
  // double height(double height){
  //   return height;
  // }

  // double width(double width){
  //   return width;
  // }
}