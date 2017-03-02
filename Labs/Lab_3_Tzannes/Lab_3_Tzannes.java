/**
   * file: Lab_3_Tzannes.java
   * author: Katerina Tzannes
   * course: CMPT 220
   * assignment: Lab 3
   * due date: Febuary 21, 2017
   * version: 1.0
   * 
   * Programming exercises 5.1, 5.7, 5.12, 5.13, 6.2, 6.3
   * 
   */
import java.util.Scanner;

public class Lab_3_Tzannes {

  public static void main(String[] args) {
   
    // Ex 5.1 pg 192
    // count positive/negative numbers and compute the average of numbers
    // similar to listing 5.6 pg 169
    int data;
    int counter = -1;
    int positive = 0;
    int negative = 0;
    int total = 0;
    double average;
    
    Scanner input = new Scanner(System.in);
   
    // reading data till input = 0
    do{
      System.out.println("Enter an integer, the input ends if it is 0: ");
      data = input.nextInt();
      counter++;
      
      // calculate total
      total += data;
      
      // checks if potive or negative
      if(data > 0){
        positive++;
      }
      else if (data < 0){
        negative++;
      } 
      else{
        System.out.println("Please enter a valid number");
      }
    }while (data != 0);
    
    // average computation (must be here in order to avoid errors)
    // included (double) in order to get correct answer
    average = (double)total / (double)counter;
    
    System.out.println("The number of positives is " + positive);
    System.out.println("The number of negatives is " + negative);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
    
    // ex 5.7 pg 193
    // financial app compute futre tution 
    // increase 5% every year
    // cost in 10 years and total four years after
    
    double tuition = 10000;
    int year;
    double totalTuition = 0;
    for(year = 0; year < 14; year++){
      // per year
      tuition +=  (tuition * .05);
      
      //System.out.printf(year + "%.2f", tuition); (lists tuition yearly)

      // total 4-year tuition after 10 years
      if (year > 10 && year <=14){
        totalTuition += tuition;
      }
    }
    System.out.printf("4-year tuition in 10 years will be: "
        + "%.2f", totalTuition);
    System.out.println(" ");
    
    // ex 5.12 pg 193
    // Find the smallest value of n so that n*n is > 12,000
    int n = 0;
    while (Math.pow(n, 2) < 12000){
      n++;
    }
    System.out.println(n + " is the smallest value when squared is > 12000");
    
    // ex 5.13 pg 193
    // find th largest value of m so that m*m*m is < 12,000
    int m=0;
    while (Math.pow(m,3) < 12000){
      m++;
    }
    // subtract 1 from m in order to be below 12,000
    m--;
    System.out.println(m + " is the largest value when cubed is < 12,000");
    
    // ex 6.2 pg 234
    // sum of the digits in an integer
    System.out.println("Enter a number to sum its digits: ");
    long  digits = input.nextLong();
    System.out.println("The sum of all the digits is " +sumDigits(digits));
    // scroll down to see method
    
    // ex 6.3 pg 234
    // test if palidrome integer
    System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
  }
  
  // 6.2 continuation method
  public static int sumDigits (long x){
    int temporaryNum = (int)Math.abs(x);
    int sum = 0;
    
    while(temporaryNum != 0){
      sum += (temporaryNum % 10);
      temporaryNum /= 10;
    }
    return sum;  
  } // end of 6.2 method
  
  // 6.3 continuation method
  // flips intiger entered 
	public static int reverse(int number) {
		String reverse = ""; 	// Holds reversed number
		String n = number + ""; // Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // Return reversed integer
	}
  
  // checks if palindrome
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}
}