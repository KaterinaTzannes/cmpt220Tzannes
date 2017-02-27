/*
 * Katerina Tzannes
 * Lab_4_Tzannes
 * Due March 1,2017
 * Verision 1.0
 */

import java.util.Arrays;
import java.util.Scanner;
public class Lab_4 {

  
  /*
  // Convert from Celsius to Fahrenheit 
  // included in celsiusTracker because I think it's more efficient
public static double celsiusToFahrenheit(double celsius){
  double fahrenheit;
  fahrenheit = (9.0 / 5) * celsius + 32;
  return fahrenheit;
}
  */

/*
// Convert from Fahrenheit to Celsius 
// included in fahrenheitTracker because I think it's more efficient
public static double fahrenheitToCelsius(double fahrenheit){
  double c;
  c = (5.0 / 9) * (fahrenheit - 32);
  return c;
}
*/

public static double celsiusTracker(double c){
  // part of 6.8
  do{
    // counts c down by 1 
    double f;
    c -= 1;
    System.out.print(c + "        ");
    
    // formular to calculate f depending on c
    f = (9.0 / 5) * c + 32;
    System.out.printf( "%.1f", f);
    System.out.println(""); 
  } while (c > 31.0); 
  return c; // requires return statement
}

public static double fahrenheitTracker(double f){
  // part of 6.8
  do{
    // counts f down by 10
    double c;
    f -= 10;
    System.out.print(f + "        ");
    
    // formular to calculate c depending on f
    c = (5.0 / 9) * (f - 32);
    System.out.printf("%.2f", c);
    System.out.println("");
  } while (f > 30.0); 
  return f; // requires return statment 
}

public static int countLetters(String s){
  // part of 6.20
  int counter = 0;
  for (int i = 0; i < s.length(); i++){
    counter++;
  }
  return counter;
}

public static double min(double[] array){
  // part of 7.9
  int spot = 0;
  double min = array[spot];
  for (int i = 0; i < array.length; i++) {
    if (min > array[i]) {
      min = array[i];
      }
    }
  return min;
  }

public static void bubbleSort(double[] array){
  // part of 7.18
  boolean nextPass = true;
  double temp;
  
  for (int k = 1; k < array.length; k++) {
    nextPass = false;
    for (int i = 0; i < array.length - k; i++) {
      
      if (array[i] > array[i + 1]){
        
        temp = array[i];
			  array[i] = array[i + 1];
			  array[i + 1] = temp;
        nextPass = true;
        // temp saves the number that gets overwritten so no data is lost
        }
      }
    } 
  System.out.println(Arrays.toString(array));
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ex 6.8 pg 235
    // (Conversions between Celsius and Fahrenheit)
    System.out.println("Celsius   Fahrenheit");
    System.out.print(celsiusTracker(41));
    System.out.println("");
    System.out.println("");
    
    System.out.println("Farenheit   Celsius");
    System.out.println(fahrenheitTracker(130.0));
    System.out.println("");
    
    // ex 6.20 pg 239
    // (Count the letters in a string)
    System.out.println("Please enter a string.");
    String s = input.nextLine();
    System.out.println(countLetters(s));
    
    // ex 7.9 pg 278
    // (Find the smallest element)
    double[] n = new double[10];
    System.out.println("Enter 10 numbers: ");
    
    for (int i = 0; i < n.length; i++){
      n[i] = input.nextDouble();
    }
    
    System.out.println("The smallest number entered is " + min(n));
    
    // ex 7.18 pg 279
    // (Bubble sort) entire array
    // bubble sort directions on page 865
    double[] array = {73, 31, -9, 23, 44, 23, 98, 106, 0, -83};
    bubbleSort(array);
    for (int i = 0; i < array.length; i++)
    System.out.println(array[i]);
  }
}
