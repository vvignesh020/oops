package javaexe;

public class EmployeeDAOFactory {
  public static EmployeeDAO createEmployeeDAO() {
    EmployeJDBCImpl employeJDBCImpl =new EmployeJDBCImpl();
     return employeJDBCImpl;
  }

}
