// Katerina Tzannes
// Lab 7
// Version 1
// April 25,2017

/*
(Square numbers) Find the first ten square numbers that are greater than
Long.MAX_VALUE. A square number is a number in the form of n2. For example,
4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast.
*/

import java.math.BigDecimal;

public class Tzannes_1017 {

  public static void main(String[] args){
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long first = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(first);
    int count = 0;
    
    while (count < 10){
      BigDecimal squared = n.multiply(n);
      if (squared.compareTo(longMaxValue) > 0){
        count++;
        System.out.println(count+" : " + n + " squared = " + squared);
      }
      n = n.add(BigDecimal.ONE);
    }
  }
}