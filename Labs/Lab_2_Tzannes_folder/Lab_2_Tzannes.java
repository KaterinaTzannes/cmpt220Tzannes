/**
 * Lab_2_Tzannes
 * Katerina Tzannes
 * CMPT 220
 * Lab 2
 * Febuary 7,2016
 * Version 1
*/

package lab_2_tzannes;
import java.util.Scanner;

/**
 * This code answers exercises found in Lab 2
 */
public class Lab_2_Tzannes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    /*
    // Ex 3.4 pg. 80 assign 1 to x if y > 0
    // Not required question
    System.out.println("Enter a value for y");
    int y = input.nextInt();
    
    if(y > 0){
      int x = 1;
      System.out.println("The value of x is now " + x);
    }
 
    
    // Ex 3.5 pg. 80 increase pay by 3% if score is greater than 90
    // not required ex
    System.out.println("Enter pay: ");
    double pay = input.nextDouble();
    System.out.println("Enter score: ");
    double score = input.nextDouble();
    
    if (score > 90){
      pay += pay * .03;
    }
    
    System.out.println("Your pay is $" + pay);
    */
    
    // Ex 3.4 pg. 109
    // (Random month) Write a program that randomly generates an 
    // integer between 1 and 12 and displays the English month name 
    // January, February, …, December for the number 1, 2, …, 12, accordingly.
    int month = (int)(Math.random() * 12);
    
    if (month == 0){
      System.out.println("January");
    }
    else if (month == 1){
      System.out.println("Febuary");
    }
    else if (month == 2){
      System.out.println("March");
    }
    else if (month == 3){
      System.out.println("April");
    }
    else if (month == 4){
      System.out.println("May");
    }
    else if (month == 5){
      System.out.println("June");
    }
    else if (month == 6){
      System.out.println("July");
    }
    else if (month == 7){
      System.out.println("Auguest");
    }
    else if (month == 8){
      System.out.println("September");
    }
    else if (month == 9){
      System.out.println("October");
    }
    else if (month == 10){
      System.out.println("November");
    }
    else if (month == 11){
      System.out.println("December");
    }
    else{
      System.out.println("Error, please try again.");
    }
    
    // Ex 3.8 pg 110
    // (Sort three integers) Write a program that prompts the user 
    // to enter three integers + display the integers in non-decreasing order
    System.out.println("Enter number 1: ");
    int num1 = input.nextInt();
    System.out.println("Enter number 2: ");
    int num2 = input.nextInt();
    System.out.println("Enter number 3: ");
    int num3 = input.nextInt();
    
    if (num1 <= num2 && num2 <= num3){
      System.out.println(num1 + " " + num2 + " " + num3);
    }
    else if(num2 <= num1 && num1 <= num3){
      System.out.println(num2 + " " + num1 + " " + num3);
    }
    else if(num3 <= num1 && num1 <= num2){
      System.out.println(num3 + " " + num1 + " " + num2);
    }
    else if(num3 <= num2 && num2 <= num1){
      System.out.println(num3 + " " + num2 + " " + num1);
    }
    else if(num1 <= num3 && num3 <= num2){
      System.out.println(num1 + " " + num3 + " " + num2);
    }
    else if(num2 <= num3 && num3 <= num1){
      System.out.println(num2 + " " + num3 + " " + num1);
    }
    else{
      System.out.println("Error, please try again.");
    }
    
    // ex 3.11 pg 110
    // Write a program that prompts the user to enter the month 
    // and year and displays the number of days in the month.
    System.out.println("Please enter the month (1-12)");
    int cmonth = input.nextInt();
    System.out.println("Please enter a year");
    int year = input.nextInt();
    
    // checks for leap year (every 4 years)
    boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) ||
      (year % 400 == 0);
    
    switch (cmonth){
      case 1: System.out.println("January " + year + " had 31 days");
        break;
      case 2: System.out.println("Febuary " + year + " had" + ((isLeapYear) 
        ? " 29 days" : " 28 days"));
        break;
      case 3: System.out.println("March " + year + " had 31 days");
        break;
      case 4: System.out.println("April " + year + " had 30 days");
        break;
      case 5: System.out.println("May " + year + " had 31 days");
        break;
      case 6: System.out.println("June " + year + " had 30 days");
        break;
      case 7: System.out.println("July " + year + " had 31 days");
        break;
      case 8: System.out.println("August " + year + " had 31 days");
        break;
      case 9: System.out.println("September " + year + " had 30 days");
        break;
      case 10: System.out.println("October " + year + " had 31 days");
        break;
      case 11: System.out.println("November " + year + " had 30 days");
        break;
      case 12: System.out.println("December " + year + " had 31 days");
        break;
    }
    
    // ex 3.15 pg 111
    // lottery of a three digit number with prizes
    int lottery = (int)(Math.random() * 1000);
    System.out.println("Enter a three digit lottery pick ");
    int guess = input.nextInt();
    
    // get digits from lottery
    int lotteryDigit1 = lottery / 100; // 1st digit
    int lottoLeftover = lottery % 100; // 2 last digits
    int lotteryDigit2 = lottoLeftover / 10 ; // 1st digit in that pair
    int lotteryDigit3 = lottery % 10; // last digit
    
    // get digits from guess
    int guessDigit1 = guess / 100;
    int guessLeftover = guess % 100;
    int guessDigit2 = guessLeftover / 10;
    int guessDigit3 = guess % 10;
    
    System.out.println("The winning lottery number is " + lottery);
    
    // checks if winner
    if (guess == lottery){
      System.out.println("Exact match: $10,000");
    }
    else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 
      && guessDigit3 == lotteryDigit3){ 
      System.out.println("Match all digits: $3,000");
    }
    else if (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 
      && guessDigit3 == guessDigit1){
      System.out.println("Match all digits: $3,000");
    }
    else if(guessDigit1 == lotteryDigit1 && guessDigit2 == guessDigit3 
      && guessDigit3 == lotteryDigit2){
      System.out.println("Match all digits: $3,000");
    }
    else if(guessDigit1 == lotteryDigit3 && guessDigit2 == guessDigit3 
      && guessDigit3 == lotteryDigit2){
      System.out.println("Match all digits: $3,000");
    } 
    else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 
      || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || 
      guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || 
      guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || 
      guessDigit3 == lotteryDigit3){
      System.out.println("Match one digit: $1,000");
    }
    else{
      System.out.println("Sorry no match");
    }
    
    //ex 4.1 pg 150
    //enter the length from the center of a pentagon to a vertex 
    // and computes the area
    System.out.println("Enter the length from the center to the "
      + "vertex of a pentagon");
    double radius = input.nextDouble();
    
    double side = 2 * radius * (Math.sin(Math.PI / 5));
    double area = (5 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI / 5)));
    
    System.out.printf("The area of the pentagon is " + "%.2f", area);
    System.out.println(" ");
    
    // ex 4.5 pg 151
    // prompts the user to enter the number of sides and their length
    // of a regular polygon and displays its area
    System.out.println("Enter the number of sides: ");
    int sides = input.nextInt();
    System.out.println("Enter the side's size: ");
    double sideSize = input.nextDouble();
    
    double polyArea = (sides * (Math.pow(sideSize, 2)) / 
      (4 * Math.tan(Math.PI / sides)));
    System.out.println("The area of the polygon is " + polyArea);
    
    // ex 4.8 pg 152
    // receives an ASCII code and displays its character
    System.out.println("Enter an ASCII code(0-127): ");
    int code = input.nextInt();
    
    System.out.println("The character for ASCII code " + code + " is " 
      + (char) code);
    
    // ex 4.10 pg 153
    // prompt the user to enter the character Y for Yes and N for No rather 
    // than entering 1 for Yes and 0 for No on their birthdsy
    String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n"
      + "25 27 29 31";
    String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n"
      + "26 27 30 31";
    String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n"
      + "28 29 30 31";
    String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n"
      + "28 29 30 31";
    String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n"
      + "28 29 30 31";
 
    int day = 0;
    System.out.print("Is your birthday in Set1?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    String yN = input.nextLine();
    char answer = yN.charAt(0);
 
    if (answer == 'Y'){
      day += 1;
    }
 
    System.out.print("\nIs your birthday in Set2?\n");
    System.out.print(set2);
    System.out.print("\nEnter N for No and Y for Yes: ");
    yN = input.nextLine();
    answer = yN.charAt(0);
 
    if (answer == 'Y')
     day += 2;
 
    System.out.print("Is your birthday in Set3?\n");
    System.out.print(set3);
    System.out.print("\nEnter N for No and Y for Yes: ");
    yN = input.nextLine();
    answer = yN.charAt(0);
 
    if (answer == 'Y'){
      day += 4;
    }

    System.out.print("\nIs your birthday in Set4?\n");
    System.out.print(set4);
    System.out.print("\nEnter N for No and Y for Yes: ");
    yN = input.nextLine();
    answer = yN.charAt(0);
 
    if (answer == 'Y'){
     day += 8;
    }
 
    System.out.print("\nIs your birthday in Set5?\n");
    System.out.print(set5);
    System.out.print("\nEnter N for No and Y for Yes: ");
    yN = input.nextLine();
    answer = yN.charAt(0);
 
    if (answer == 'Y'){
     day += 16;
    }
    System.out.println("\nYour birthday is " + day + "!");
    
    
    
    // ex 4.15 pg 154
    // Write a program that prompts the user to enter a letter and displays
    //its corresponding number from a phone keypad.
    System.out.print("Enter a letter:");
    String letter = input.next();
 
    char c = letter.toLowerCase().charAt(0);
    int keyNum;
 
    switch (c) {
    case 'a':
    case 'b':
    case 'c':
      keyNum = 2;
      break;
 
    case 'd':
    case 'e':
    case 'f':
      keyNum = 3;
      break;
 
    case 'g':
    case 'h':
    case 'i':
      keyNum = 4;
      break;
 
    case 'j':
    case 'k':
    case 'l':
      keyNum = 5;
      break;
 
    case 'm':
    case 'n':
    case 'o':
      keyNum = 6;
      break;
 
    case 'p':
    case 'q':
    case 'r':
    case 's':
      keyNum = 7;
      break;
 
    case 't':
    case 'u':
    case 'v':
      keyNum = 8;
      break;
 
    case 'w':
    case 'x':
    case 'y':
    case 'z':
      keyNum = 9; 
      break;
 
    default:
       keyNum = 0;
       break;
    }
 
    if (keyNum != 0) {
      System.out.print("The corresponding number is " + keyNum);
      System.exit(0);
    }
 
    // ex 4.25 pg 156
    // a vehicle plate number consists of three uppercase letters followed 
    // by four digits. Write a program to generate a plate number
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 3; i++) {
      char ch = (char)(Math.random() * 26 + 'A');
      builder.append(ch);
    }
    for (int i = 0; i < 4; i++) {
      char nums = (char)(Math.random() * 10 + '0');
      builder.append(nums);
    }
    System.out.println("Random vehicle plate number: " + builder);
    

  }
  
}
