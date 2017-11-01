package in.vamsoft.day3.training;

public class RunnableThread implements Runnable {

  @Override
  public void run() {

    int n1 = 0;
    int n2 = 1;
    int n3;
    int i;
    int count = 10;
    System.out.println(n1 + "\n " + n2);// printing 0 and 1

    for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
    {
      n3 = n1 + n2;
      System.out.println(" " + n3);
      n1 = n2;
      n2 = n3;

    }
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
