package in.vamsoft.assignment.inheritance;

/**
 * @author vamsoft
 *
 */
public abstract class Employee {
  private int empid;
  private String name;
  private int ssn;
  private double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.isEmpty() || name.trim().isEmpty()) {
      this.name = "invalid Name";
    } else
      this.name = name;
  }

  public int getEmpid() {
    return empid;
  }

  public int getSsn() {
    return ssn;
  }

  public double getSalary() {
    return salary;
  }

  public double raiseSalary(double amount) {
    if (amount <= 0) {
      this.salary += amount;
      return amount;
    } else
      System.out.println("enter the correct amount ");
    return amount;
  }

  public Employee(int empid, String name, int ssn, double salary) {
    super();
    this.empid = empid;
    this.name = name;
    this.ssn = ssn;
    this.salary = salary;
  }

}
