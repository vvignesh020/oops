package in.vamsoft.day4.trainning;

import java.io.Serializable;

public class Employee implements Serializable {
  String name;
  int age ;
  String email;
  @Override
  public String toString() {
    return "Employee [name=" + name + ", age=" + age + ", email=" + email + "]";
  }
  public Employee(String name, int age, String email) {
    super();
    this.name = name;
    this.age = age;
    this.email = email;
  }

  

}
