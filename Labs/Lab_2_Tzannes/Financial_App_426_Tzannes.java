/**
 * Lab_2_Tzannes 4.26
 * Katerina Tzannes
 * CMPT 220
 * Lab 2
 * Febuary 7,2016
 * Version 2
*/

import java.util.Scanner;

public class Financial_App_426_Tzannes {

  public static void main(String[] args) {
    
    // ex 4.26 pg 156
    // fix the possible loss of accuracy when converting a float value to an
    // int. Read the input as a string such as "11.56". Your program should 
    // extract dollar amount before the decimal point and the cents after the 
    // decimal amount the indexOf and substring methods.
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an amount, for example 11.56: ");
    String amount = input.nextLine();

    String dollars = amount.substring(0, amount.indexOf('.'));
    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
    int quarters = cents / 25;
    cents %= 25;
    int dimes = cents / 10;
    cents %= 10;
    int nickels = cents / 5;
    cents %= 5;

    System.out.println("Your amount " + amount + " consists of\n " 
      + dollars + " dollars\n " + quarters + " quarters\n " + dimes + 
      " dimes\n " + nickels + " nickels\n " + cents + " pennies\n ");
  }
}
