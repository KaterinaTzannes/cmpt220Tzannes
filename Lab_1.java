/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Katerina Tzannes
 * Lab_1
 */
package lab_1;
import java.util.Scanner;
/**
 *
 * @author katerinatzannes
 */
public class Lab_1 {

  /**
  * @param args the command line arguments
  */
  public static void main(String[] args) {
    // TODO code application logic here
      
    // Problem 1.3 tx pg 30
    System.out.println("     J        A       V     V       A   ");
    System.out.println("     J       A A       V   V       A A  ");
    System.out.println(" J   J      AAAAA       V V       AAAAA ");
    System.out.println("  J J      A     A       V       A     A");
 
    //Problem 2.1 tx pg 69
    Scanner input = new Scanner(System.in);
    System.out.println(" ");
    System.out.print("Enter Celcius Degree: ");
    double celcius = input.nextDouble();
    double fahrenheit = (9.0/5) * celcius + 32;
    System.out.println (celcius + " Celcius is " + fahrenheit + " Fahrenheit.");
   
    //Problem 2.5 tx pg 70
    System.out.println(" ");
    System.out.println("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    double gratuity = gratuityRate/10;
    double total = subtotal + gratuity;
    System.out.println ("The gratuity is $" + gratuity + " and total is $" + total);
    
    //Problem 2.6 tx pg 70
    System.out.println(" ");
    System.out.println("Enter a number between 0 and 1000: ");
    double number = input.nextDouble();
    double digit1 = number%10;
    double removeDigits1 = (int)number/10;
    double digit2 = removeDigits1%10;
    double removeDigits2 = (int)removeDigits1/10;
    double digit3 = removeDigits2%10;     
    double sumOfDigits = digit1 + digit2 + digit3;    
    System.out.println ("The sum of the digits is " + sumOfDigits);
  
    
  }
    
}
