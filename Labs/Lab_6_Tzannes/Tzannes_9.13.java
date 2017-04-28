// Katerina Tzannes
// Lab 6
// Version 1
// April 4,2017

/*
  (The Location class) Design a class named Location for locating a maximal
  value and its location in a two-dimensional array.Class contains public data
  fields row, column, and maxValue that store the maximal value and its indices
  in a two-dimensional array with row and column as int types and maxValue as
  a double type.
  Write the following method that returns the location of the largest element 
  in a two-dimensional array:
  public static Location locateLargest(double[][] a)
  The return value is an instance of Location. Test program that prompts
  the user enters two-dimensional array and displays ocation of the largest
  element in the array. Here is a sample run:
*/
import java.util.Scanner;

public class Tzannes_913{

  public static void main(String[] args){   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];

    System.out.println("Enter the array:");
    for (int i = 0; i < m.length; i++){
      for (int j = 0; j < m[i].length; j++){
        m[i][j] = input.nextDouble();
      }
    }

    Location location = Location.locateLargest(m);

    System.out.println("The location of the largest element is " + 
      location.maxValue + " at " + location.row + ", " + location.column);
  }
}

public class Location{
  public int row;
  public int column;
  public double maxValue;

  public Location(int row, int column, double maxValue){
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }
  
  public static Location locateLargest(double[][] a){
    int row = 0;
    int column = 0;
    double maxValue = a[row][column];

    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[i].length; j++){
        if (maxValue < a[i][j]){
          maxValue = a[i][j];
          row = i;
          column = j;
        }
      }
    }
    return new Location(row,column,maxValue);
  }
}