package in.vamsoft.day4.trainning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialisationDemo {
  public static void main(String[] args)
      throws FileNotFoundException, IOException, ClassNotFoundException {
    // Employee employee=new Employee("anitha", 20, "anitha@gmail.com");
    // ObjectOutputStream objectOutputStream=new ObjectOutputStream(new
    // FileOutputStream("object.txt"));
    // objectOutputStream.writeObject(employee);
    // System.out.println("object written");
    //
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object.txt"));
    Employee employee = (Employee) inputStream.readObject();
    System.out.println(employee);
    inputStream.close();
  }
}
