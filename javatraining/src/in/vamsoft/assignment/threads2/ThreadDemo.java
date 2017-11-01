package in.vamsoft.assignment.threads2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class Thread1 extends Thread{
  private String num;
  public Thread1(String line) {
   this.num=line;
  }

  @Override
  public void run() {
    
    System.out.println(num.toString());
  }
  
}

class Thread2 extends Thread{
  private String num;
  public Thread2(String line) {
   this.num=line;
  }

  @Override
  public void run() {
    System.out.println(num.toString());
  }
  
}

public class ThreadDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {

    String file = args[0];
    File fis = new File(file);
    FileReader fileReader = new FileReader(fis);
    @SuppressWarnings("resource")
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    StringBuffer stringBuffer = new StringBuffer();
    String line;
    while ((line = bufferedReader.readLine()) != null) {
      stringBuffer.append(line);
      Thread1 th = new Thread1(line);
      Thread t = new Thread(th);
      t.start();
      stringBuffer.append("\n");
    }
    String file1 = args[1];
    File fis1 = new File(file1);
    FileReader fileReader1 = new FileReader(fis1);
    @SuppressWarnings("resource")
    BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
    StringBuffer stringBuffer1 = new StringBuffer();
    String line1;
    
    while ((line1 = bufferedReader1.readLine()) != null) {
      stringBuffer1.append(line1);
      Thread2 th1 = new Thread2(line1);
      Thread t1 = new Thread(th1);
      t1.start();
      stringBuffer1.append("\n");
    }

  }

}
