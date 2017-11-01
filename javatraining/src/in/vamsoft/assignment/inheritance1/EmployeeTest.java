package in.vamsoft.assignment.inheritance1;

public class EmployeeTest {

  static void printEmployee(Employee employee) {
    System.out.println("----------------------------------");
    System.out.println("Employee ID     :" + employee.getEmpid());
    System.out.println("Employee Name   :" + employee.getName());
    System.out.println("Employee SSN    :" + employee.getSsn());
    System.out.println("Employee salary :" + employee.getSalary());

  }

  public static void main(String[] args) {
    Engineer engineer = new Engineer(121, "bala", 198, 15000);
    Manager manager = new Manager(122, "jk", 199, 25000, "Accounts");
    Director director = new Director(123, "siva", 200, 35000, "administration", 150000);
    Admin admin = new Admin(120, "vignesh", 197, 15000);
    printEmployee(admin);
    printEmployee(engineer);
    printEmployee(manager);
    printEmployee(director);
    manager.setName("vignesh");
    manager.raiseSalary(10000);
    System.out.println("salary of changed employee is :");
    printEmployee(manager);
//    Employee[] t;
//    t=
//    
//    Manager m=new Manager();
//    m.addemp(12, "balu", 198, 1000);
//    m.addemp(13, "balu2", 197, 1100);
//    m.addemp(14, "balu3", 196, 1200);
//    m.details();
//    Manager m1=new Manager();
//    m1.find(m1.details(),);
  }

}
