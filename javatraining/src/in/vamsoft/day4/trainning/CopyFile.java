package in.vamsoft.day4.trainning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFile {
  public static void main(String[] args) throws IOException {
    BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the source directory");
    String source=br.readLine();
    System.out.println("enter the destination directory");
    String destination=br.readLine();
    br.close();
    try(FileInputStream fis=new FileInputStream(source);
        FileOutputStream fos=new FileOutputStream(destination);){
      int c=0;
      while((c=fis.read())!= -1) {
        fos.write(c);
      }
      System.out.println("file copied");
    }catch (FileNotFoundException e) {
    e.printStackTrace();
    }
   
        
  }

}
