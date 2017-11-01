package in.vamsoft.assignment.inheritance1;

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
 public void disp() {
    System.out.println("----------------------------------");
    System.out.println("Employee ID     :" + getEmpid());
    System.out.println("Employee Name   :" + getName());
    System.out.println("Employee SSN    :" + getSsn());
    System.out.println("Employee salary :" + getSalary());

  }

  public double raiseSalary(double amount) {
    if (amount <= 0) {
      this.salary += amount;
      return amount;
    } else
      System.out.println("enter the correct amount ");
    return amount;
  }
  public Employee() {
    // TODO Auto-generated constructor stub
  }

  public Employee(int empid, String name, int ssn, double salary) {
    super();
    this.empid = empid;
    this.name = name;
    this.ssn = ssn;
    this.salary = salary;
  }

}
