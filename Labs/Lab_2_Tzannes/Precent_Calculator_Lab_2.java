/**
 * Lab_2_Tzannes Percent
 * Katerina Tzannes
 * CMPT 220
 * Lab 2
 * Febuary 7,2016
 * Version 2
*/
package precent_calculator_lab_1;
import java.util.Scanner;
/**
 * Calculaes the grade percentages
 * will now also give you a letter grade
 */
public class Precent_Calculator_Lab_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the following as a precentage");
        System.out.println("midterm exam: ");
        double midterm = input.nextDouble();
        System.out.println("final exam grade");
        double finalExam = input.nextDouble();
        System.out.println("project grade");
        double projects = input.nextDouble();
        System.out.println("homework grade");
        double homework = input.nextDouble();
        double average = (midterm + finalExam + projects+ homework*2)/5;
        
        if (average >= 95){
          System.out.println("Your final grade is A");
        }
        else if (average >= 90){
          System.out.println("Your final grade is A-");
        }
        else if (average >= 87){
          System.out.println("Your final grade is B+");
        }
        else if (average >= 83){
          System.out.println("Your final grade is B");
        }
        else if (average >= 80){
          System.out.println("Your final grade is B-");
        }
        else if (average >= 77){
          System.out.println("Your final grade is C+");
        }
        else if (average >= 73){
          System.out.println("Your final grade is C");
        }
        else if (average >= 70){
          System.out.println("Your final grade is C-");
        }
        else if (average >= 65){
          System.out.println("Your final grade is D+");
        }
        else if (average >= 60){
          System.out.println("Your final grade is D");
        }
        else if (average < 60){
          System.out.println("Your final grade is F");
        }
        else {
          System.out.println("Please enter a vaild percentage out of 100%");
        }
    }  
}
