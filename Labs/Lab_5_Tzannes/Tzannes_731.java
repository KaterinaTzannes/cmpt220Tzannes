// Katerina Tzannes
// March 28,2017
// Lab 5
// Version 2

import java.util.Scanner;
/**
(Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list.

Implement the method in a way that takes at most list1.length + list2.
length comparisons. Write a test program that prompts the user to enter two
sorted lists and displays the merged list. Here is a sample run. The first
number in the input indicates the number of the elements in the list. 
This number is not part of the list.
 */

public class Tzannes_731 {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter list1: ");
    int[] list1 = new int[input.nextInt()];
    for (int i = 0; i < list1.length; i++){
      list1[i] = input.nextInt();
    }

    System.out.print("Enter list2: ");
    int[] list2 = new int[input.nextInt()];
    for (int i = 0; i < list2.length; i++){
      list2[i] = input.nextInt();
    }

    int[] list3 = merge(list1, list2);

    System.out.println("Merged List: ");
    for (int x: list3) {
      System.out.println(x);
    }
  }

  public static int[] merge(int[] list1, int[] list2){
    int[] list3 = new int[list1.length + list2.length];
    
    for (int i = 0; i < list1.length; i++){
      list3[i] = list1[i];
    }

    for (int i = 0, j = list1.length; i < list2.length; i++, j++){
      list3[j] = list2[i];  
    }
    sort(list3);
    return list3;
  }

  public static void sort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      int min = list[i];
      int minIndex = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < min) {
          min = list[j];
          minIndex = j; 
        }          
      }
      if (minIndex != i) {
        list[minIndex] = list[i];
        list[i] = min;
      }
    }
  }
}

