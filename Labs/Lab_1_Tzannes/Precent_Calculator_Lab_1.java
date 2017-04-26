  /**
   * file: Precent_Calculater_Lab_1.java
   * author: Katerina Tzannes
   * course: CMPT 220
   * assignment: Lab 1, Precent Calculator
   * due date: January 24,2017
   * version: 2
   */

import java.util.Scanner;

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
        
        System.out.println("Your final grade is: " + average);
        
    }
}
