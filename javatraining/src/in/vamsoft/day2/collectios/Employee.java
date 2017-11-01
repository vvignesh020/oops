package in.vamsoft.day2.collectios;

public class Employee {
  int code;
  String name;
  double salary;

  public Employee(int code, String name, double salary) {
    super();
    this.code = code;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [code=" + code + ", name=" + name + ", salary=" + salary + "]\n";
  }

}
