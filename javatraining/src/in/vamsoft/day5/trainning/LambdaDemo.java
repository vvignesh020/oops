package in.vamsoft.day5.trainning;

import org.apache.log4j.Logger;

/**
 * lambda expression examples .
 * 
 * @author vamsoft.
 *
 */
public class LambdaDemo {
  private static final Logger logger = Logger.getLogger(LambdaDemo.class);

  /**
   * @param args
   *          command line argument.
   */
  public static void main(String[] args) {
    logger.debug("entering main(String[])");
    logger.debug("args: ");
    Thread thread = new Thread(() -> System.out.println("hello"));
    Runnable runnable = () -> {
      System.out.println("hello");
      System.out.println("hai");
    };
    Thread thread2 = new Thread(runnable);
    thread.start();
    thread2.start();
    logger.debug("exiting main()");
  }

}
