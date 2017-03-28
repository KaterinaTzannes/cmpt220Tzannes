// Katerina Tzannes
// March 28,2017
// Lab 5
import java.util.Scanner;
/**
(Partition of a list) Write the following method that partitions the list using
first element, called a pivot.
public static int partition(int[] list)
After the partition, the elements in the list are rearranged so the elements
before the pivot are less than or equal to the pivot and elements after pivot
are greater than the pivot. Return the index where the pivot is located
in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. Partition
the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes
at most list.length comparisons. Write a test program that prompts the user
to enter a list and displays the list after the partition.  Note that the first
number in the input indicates the number of the elements in the list.
This number is not part of the list.
 */
public class Tzannes_732 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a list: ");
    int size = input.nextInt();
    int[] list = new int[size];
    for (int i = 0; i < size; i++){
      list[i] = input.nextInt();
    }
    
    partition(list);
    
  }
  
  // had a lot of trouble with this part
  public static int partition(int[] list){
    int first = 0;
    int low = first + 1;
    int high = list.length - 1;
    int pivot = list[first];
      
    if (high > low && low <= high && list[low] <= pivot){
      low++;
    }
    else if (high > low && low <= high && list[high] > pivot){
        high--;
    }
    
    if (high > low){
      int temp = list[high];
      list[high] = list[low];
      list[low] = temp;
    }
      
    if (high >= low && list[high] >= pivot){
      high--;
    }
      
    if (high > first){
      int temp = list[high];
      list[high] = list[first];
      list[first] = temp;
      return high;
    }
    else{
      return first;
    }
  }
}