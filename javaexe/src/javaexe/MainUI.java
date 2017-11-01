package javaexe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MainUI {
  EmployeeDAO dao = EmployeeDAOFactory.createEmployeeDAO();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    String ans = "";

    do {
      System.out.println("enter 1 to add an employee");
      System.out.println("enter 2 to remove an employee");
      System.out.println("enter 3 to find an employee");
      System.out.println("enter 4 to list all employee");
      System.out.println("enter your option");

      int option = Integer.parseInt(br1.readLine());
      MainUI main = new MainUI();

      switch (option) {
        case 1: {
          boolean result = main.add();
          if (result)
            System.out.println("employee added successfully");
          else
            System.out.println("employee is already exist");
        }
          break;
        case 2:
          System.out.println("enter the emp id to remove:");
          int empid = Integer.parseInt(br1.readLine());
          boolean result = main.remove(empid);
          if (result == true)
            System.out.println("employee removed");
          else
            System.out.println("employee does not exist");
          break;
        case 3:
          System.out.println("enter employee id to find");
          int empid1 = Integer.parseInt(br1.readLine());
          Employee emp = main.find(empid1);
          System.out.println(emp.getEmpid());
          System.out.println(emp.getName());
          System.out.println(emp.getSalary());
          System.out.println(emp.getDate());
          System.out.println(emp.getDep());
          break;
        case 4:
          System.out.println("list of employees");
          List<Employee> list = main.all();
          System.out.println(list);

        default:
          break;
      }
      System.out.println("Type any character to continue");

      ans = br1.readLine() == null ? "no" : "yes";
    } while (ans.equalsIgnoreCase("yes"));

  }

  public boolean add() {
    try {
      System.out.println("enter the employee details to add");
      System.out.println("enter the employe id:");
      int empid = Integer.parseInt(br.readLine());
      System.out.println("enter employee name");
      String name = br.readLine();
      System.out.println("enter employee salary");
      double salary = Double.parseDouble(br.readLine());
      System.out.println("enter the employee joing date");
      System.out.println("date format is (dd-MM-yyy)");
      LocalDate date = LocalDate.parse(br.readLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
      System.out.println("enter the employee department no");
      int depno = Integer.parseInt(br.readLine());
      Employee emp = new Employee(empid, name, salary, date, depno);
      boolean result = dao.addEmployee(emp);
      return result;
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean remove(int empid) {
    boolean result = dao.removeEmployee(empid);
    return result;
  }

  public Employee find(int empid) {

    Employee emp = dao.findEmployee(empid);
    return emp;

  }

  public List<Employee> all() {
    List<Employee> list = dao.allEMployee();
    return list;
  }
}
