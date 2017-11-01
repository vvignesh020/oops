package in.vamsoft.day3.training;

public class MainThread {
  public static void main(String[] args) throws InterruptedException {
    // System.out.println(Thread.currentThread());
    // ExtensionThread e1 = new ExtensionThread();
    //
    // e1.setName("JK");
    // e1.start();
    //
    // ExtensionThread e2 = new ExtensionThread();
    // e2.setPriority(10);
    // e2.setName("K");
    // e2.start();
    RunnableThread r1 = new RunnableThread();
    RunnableMultiThread r2 = new RunnableMultiThread();
    System.out.println("start");
    Thread t = new Thread(r1);
    t.start();
    t.setName("vignesh");
    Thread t1 = new Thread(r2);
    t1.start();
    t1.setName("vignesh1");
    t.join();
    t1.join();
    System.out.println("end");
  }

}
