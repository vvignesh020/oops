package in.vamsoft.day3.training;

public class ExtensionThread extends Thread {

  @Override
  public void run() {
    super.run();
    for (int i = 0; i <= 10; i++) {
      System.out.println(Thread.currentThread() + ":" + i);

    }
  }

}
