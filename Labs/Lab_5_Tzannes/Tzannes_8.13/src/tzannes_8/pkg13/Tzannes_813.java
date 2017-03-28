// Katerina Tzannes
// March 28,2017
// Lab 5
package tzannes_8.pkg13;
import java.util.Scanner;
/**
(Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array.
public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. Write a test program that prompts the user to enter 2D
array and displays the location of the largest element in the array.
Here is a sample run:
 */
public class Tzannes_813 {

  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];

    System.out.println("Enter the array below: ");
    for (int i = 0; i < row; i++){
      for (int k = 0; k < column; k++){
        m[i][k] = input.nextDouble();
      }
    }
    
    int[] location = locateLargest(m);
    System.out.println("The location of the largest element is at " + 
      location[0] + ", " + location[1]);
    }

  public static int[] locateLargest(double[][] a){
    int[] location = new int[] { 0, 0 };
    double largest = a[0][0];
    int i;
    int k; 
    
    for (i = 0; i < a.length; i++){
      for (k = 0; k < a[i].length; k++){
        if (a[i][k] > largest){
          location[0] = i;
          location[1] = k;
          largest = a[i][k];
        }
      }
    }
    return location;
  } 
}
