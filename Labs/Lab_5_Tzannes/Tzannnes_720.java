// Katerina Tzannes
// March 28,2017
// Lab 5
import java.util.Scanner;

public class Tzannnes_720 {

/**
(Revise selection sort) In Section 7.11, use selection sort to sort array.
The selection-sort method repeatedly finds the smallest number in the current
array and swaps it with the first. Rewrite program by finding the largest number
and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.
*/
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double[] numbers = new double[10]; 
    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < numbers.length ; i++)
      numbers[i] = input.nextDouble();

    selectionSort(numbers);

    for (double x: numbers){ 
      System.out.println(x);
    }
  }

  public static void selectionSort(double[] list) {
    for (int i = list.length - 1; i >= 0; i--) { 
      double max = list[i];
      int maxIndex = i;
      for (int j = i - 1; j >= 0; j--) {
        if (max < list[j]) {
          max = list[j];
          maxIndex = j;
        }
      }
      if (maxIndex != i) {
        list[maxIndex] = list[i];
        list[i] = max;
      }
    }  
  }
}
