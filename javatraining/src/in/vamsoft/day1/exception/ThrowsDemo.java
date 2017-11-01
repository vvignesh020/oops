package in.vamsoft.day1.exception;

public class ThrowsDemo {
  public static void main(String[] args) {
    Employee employee = new Employee();
    try {
      employee.setEmpid(1);
      employee.setEmpname("jk");
      employee.setEmpsalary(25000);
      employee.setEmpage(18);
    } catch (SalaryException e) {

    }
  }
}
