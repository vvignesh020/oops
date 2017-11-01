package in.vamsoft.assignment.day2;

public class Employee {
  public static int idcounter;

  public Employee() {
    super();
  }

  int eid;
  String ename;
  int salary;

  public int getEid() {
    return eid;
  }

  public void setEid(int eid) {
    this.eid = eid;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Employee(String ename, int salary) {
    super();
    idcounter += eid = idcounter;
    this.ename = ename;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]\n";
  }

}
