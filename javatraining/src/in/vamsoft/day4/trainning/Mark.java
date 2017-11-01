package in.vamsoft.day4.trainning;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Mark {
public static void main(String[] args) throws Exception {
  try {
    InputStream is =new BufferedInputStream(new FileInputStream("src/text1.txt"), 1);
    System.out.println("file content");
    System.out.println((char)is.read());
    System.out.println((char)is.read());

    is.mark(15);
    System.out.println("mark has initiated");
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());
    System.out.println((char)is.read());

    if(is.markSupported())
    {
      is.reset();
      System.out.println("after reset");
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());

    }else {
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());

    }
    
    is.close();
  } catch (FileNotFoundException e) {
    
    e.printStackTrace();
  }
}
}
