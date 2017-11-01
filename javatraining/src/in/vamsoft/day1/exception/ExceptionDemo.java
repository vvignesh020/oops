package in.vamsoft.day1.exception;

import java.util.Scanner;

/**
 * @author vamsoft.
 *
 */
public class ExceptionDemo {
  /**
   * @param args
   *          .
   */
  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter the numerator");
      int numarator = scanner.nextInt();
      System.out.println("enter the denominator");
      int denomirator = scanner.nextInt();
      double result = numarator / denomirator;
      System.out.println("the quotient is " + result);
      scanner.close();
    } catch (ArithmeticException e) {
      System.out.println("exception occours" + e.getMessage());
      // TODO: handle exception
    }
    System.out.println("after exception");

  }

}
