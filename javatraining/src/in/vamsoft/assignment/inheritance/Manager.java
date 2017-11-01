package in.vamsoft.assignment.inheritance;

public class Manager extends Employee {
  private String department;

  public String getDepartment() {
    return department;
  }

  public Manager(int empid, String name, int ssn, double salary, String department) {
    super(empid, name, ssn, salary);
    this.department = department;
  }

  @Override
  public String toString() {
    return "Manager [department=" + department + "]";
  }

}
