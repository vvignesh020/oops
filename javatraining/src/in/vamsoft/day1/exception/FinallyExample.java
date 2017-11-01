package in.vamsoft.day1.exception;

public class FinallyExample {

  int divide(int n1, int n2) {
    try {
      final int result = n1 / n2;
      return result;
    } catch (final Exception e) {
      System.out.println("exception occoured");
      return 0;
    } finally {
      System.out.println("--------JK----------");
    }
  }

  public static void main(String[] args) {
    FinallyExample f1 = new FinallyExample();
    System.out.println(f1.divide(6, 2));
  }
}
