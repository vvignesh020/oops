package in.vamsoft.day3.training;

/**
 * @author vamsoft.
 *
 */
public class DaemonThread extends Thread {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println(i);
      System.out.println(Thread.currentThread().getName());
    }

  }

  /**
   * @param args.
   */
  public static void main(String[] args) {
    DaemonThread d = new DaemonThread();
    Thread t1 = new Thread(d, "daemon");
    Thread t2 = new Thread(d, "thread");
    t1.setDaemon(true);
    t2.start();
    t1.start();

  }

}
