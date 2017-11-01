package in.vamsoft.assignment.inheritance1;
import java.util.*;
public class Manager extends Employee {
  private String department;
  private static int empcount;
  private Employee[] staff;
  private static String mname;

  public String getDepartment() {
    return department;
  }
public Manager() {
  this.staff =new Employee[20];
  this.empcount=0;
}
  public Manager(int empid, String name, int ssn, double salary, String department) {
    super(empid, name, ssn, salary);
    this.department = department;
    this.mname=name;
  }
  public boolean addemp(int empid, String name, int ssn, double salary) {
    this.staff[empcount]=new Engineer(empid, name, ssn, salary);
    this.empcount +=1;
    return true;
  }
  public void details() {
    System.out.println(mname);
    for(int i=0;i<=empcount;i++) {
      this.staff[i].disp();
    }
    
  
  }
  public  boolean find( Employee[] f) {
//    for(int i=0;i<=20;i++) {
    boolean a =  Arrays.equals(staff, f);
//    if(a > 0)
//      return true;
//    else
//      return false;
    return a;
    }
    
//    }
  @Override
  public String toString() {
    return "Manager [department=" + department + "]";
  }

}
