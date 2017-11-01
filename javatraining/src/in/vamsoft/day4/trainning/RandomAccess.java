package in.vamsoft.day4.trainning;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
  public static void main(String[] args) {
    try {
      RandomAccessFile randomAccessFile = new RandomAccessFile("text2.txt", "rw");
      randomAccessFile.write("hello this is vignesh ".getBytes());
      randomAccessFile.seek(8);
      int c;
      while ((c = randomAccessFile.read()) != -1) {
        System.out.println((char) c);
      }
      randomAccessFile.seek(randomAccessFile.length());
      randomAccessFile.write("appending to file".getBytes());
      System.out.println();
      randomAccessFile.seek(0);
      while ((c = randomAccessFile.read()) != -1) {
        System.out.println((char) c);
      }
      randomAccessFile.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
