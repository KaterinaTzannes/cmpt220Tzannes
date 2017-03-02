/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precent_calculator_lab_1;
import java.util.Scanner;
/**
 *
 * @author katerinatzannes
 */
public class Precent_Calculator_Lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
