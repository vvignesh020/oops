package in.vamsoft.day1.exception;

/**
 * @author vamsoft.
 *
 */
public class ExceptionDemo1 {
  /**
   * @param args
   *          .
   */
  public static void main(String[] args) {

    try {
      int numarator = Integer.parseInt(args[0]);
      int denomirator = Integer.parseInt(args[1]);
      double result = numarator / denomirator;
      System.out.println("the quotient is " + result);

    } catch (ArithmeticException | NumberFormatException e) {
      System.out.println("exception occours" + e.getMessage());
      // TODO: handle exception
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("enter two numbers ");

    } catch (Exception e) {
      System.out.println(e.getMessage());

    }

    System.out.println("after exception");

  }

}
