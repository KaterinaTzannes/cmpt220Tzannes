/**
   * file: Driver_Lab3_Tzannes.java
   * author: Katerina Tzannes
   * course: CMPT 220
   * assignment: Lab 3 Driver
   * due date: Febuary 21, 2017
   * version: 2
   * 
   * Kattis Different Distances
   */
import java.util.Scanner;

public class Driver_Lab3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      String line = sc.nextLine();
      if ("0".equals(line))
      {break;}

      String[] parts = line.split(" ");
      double x1 = Double.parseDouble(parts[0]);
      double y1 = Double.parseDouble(parts[1]);
      double x2 = Double.parseDouble(parts[2]);
      double y2 = Double.parseDouble(parts[3]);
      double p = Double.parseDouble(parts[4]);
      double ans = Math.pow(Math.pow(Math.abs(x1 - x2), p) + 
      Math.pow(Math.abs(y1 - y2), p), 1 / p);
      System.out.printf("%6f\n", ans);
    }
  }
}
