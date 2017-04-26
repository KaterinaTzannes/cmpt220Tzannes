// Katerina Tzannes
// Project 1
// March 28,2017
// Version 3

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
    // get size of vectors
    System.out.println("I will ask for 2 vectors.");
    System.out.println("How many digits are in the first vector?");
    int vect1 = input.nextInt();
    System.out.println("How many digits are in the second vector?");
    int vect2 = input.nextInt();
    
    // get data for first vector
    int vFirst[] = new int[vect1];
    System.out.println("Please enter the first vector [x, y, z]");
    for (int i = 0 ; i < vFirst.length; i++ ) {
      vFirst[i] = input.nextInt();
    }
    
    // test if numbers were entered correctly
    // System.out.println("These are the numbers you have entered.");
    // System.out.println(Arrays.toString(vFirst));
    
    // get data for second vector
    int[] vSecond = new int[vect2];
    System.out.println("Please enter the second vector [x, y,z]");
    for (int i = 0 ; i < vSecond.length; i++ ) {
      vSecond[i] = input.nextInt();
    }
    // test if numbers were entered correctly
    // System.out.println("These are the numbers you have entered.");
    // System.out.println(Arrays.toString(vSecond));
    
    bothVect(vFirst,vSecond);
  }
        
    public static int[] bothVect(int[] vFirst, int[] vSecond){
      int[] vResult = new int [vFirst.length + vSecond.length];
      for (int idx = 0; idx < vResult.length; idx++){
        for (int shift = 0; shift < vSecond.length; shift++){
          for (int i = 0; i < vResult.length; i++){
            System.out.println(vResult[i]);
          }
        }
      } 
    return vResult;
    }
}
