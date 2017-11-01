package javaexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Date;
import org.apache.log4j.Logger;

public class EmployeJDBCImpl implements EmployeeDAO {
  private static final Logger logger = Logger.getLogger(EmployeJDBCImpl.class);
  Connection connection = null;
  ResultSet resultSet = null;

  /*
   * (non-Javadoc)
   * @see javaexe.EmployeeDAO#addEmployee(javaexe.Employee)
   */
  @Override
  public boolean addEmployee(Employee emp) {
    logger.debug("entering addEmployee(Employee)");
    logger.debug("emp: " + emp);
    try (PreparedStatement preparedStatement = connection
        .prepareStatement("insert into vignesh values(?,?,?,?,?)")) {
      preparedStatement.setInt(1, emp.getEmpid());
      preparedStatement.setString(2, emp.getName());
      preparedStatement.setDouble(3, emp.getSalary());
      preparedStatement.setDate(4, Date.valueOf(emp.getDate()));
      preparedStatement.setInt(5, emp.getDep());
      int i = preparedStatement.executeUpdate();
      logger.debug("exiting addEmployee()");
      logger.debug("returning: " + (i > 0 ? true : false));
      return i > 0 ? true : false;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    logger.debug("exiting addEmployee()");
    logger.debug("returning: " + false);
    return false;
  }

  @Override
  public boolean removeEmployee(int empid) {

    logger.debug("entering removeEmployee(int)");
    logger.debug("empid: " + empid);

    try (PreparedStatement preparedStatement = connection
        .prepareStatement("delete from vignesh where empid=?")) {
      preparedStatement.setInt(1, empid);
      int rowUpdate = preparedStatement.executeUpdate();

      logger.debug("exiting removeEmployee()");
      logger.debug("returning: " + (rowUpdate > 0 ? true : false));

      return rowUpdate > 0 ? true : false;
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    logger.debug("exiting removeEmployee()");
    logger.debug("returning: " + false);

    return false;

  }

  @Override
  public Employee findEmployee(int empid) {
    if (logger.isDebugEnabled()) {
      logger.debug("entering findEmployee(int)");
      logger.debug("empid: " + empid);
    }
    try (PreparedStatement preparedStatement = connection
        .prepareStatement("select * from vignesh where empid=?")) {
      preparedStatement.setInt(1, empid);
      resultSet = preparedStatement.executeQuery();
      if (resultSet.next()) {
        Employee emp = new Employee();
        emp.setEmpid(resultSet.getInt(1));
        emp.setName(resultSet.getString(2));
        emp.setSalary(resultSet.getDouble(3));
        emp.setDate((resultSet.getDate(4)).toLocalDate());
        emp.setDep(resultSet.getInt(5));
        logger.debug("exiting findEmployee()");
        logger.debug("returning: " + emp);
        return emp;
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    logger.debug("exiting findEmployee()");
    logger.debug("returning: " + null);
    return null;
  }

  @Override
  public List<Employee> allEMployee() {
    logger.debug("entering allEMployee()");
    List<Employee> list = new ArrayList<>();
    try (PreparedStatement preparedStatement = connection
        .prepareStatement("select * from vignesh")) {
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        Employee emp = new Employee();
        emp.setEmpid(resultSet.getInt(1));
        emp.setName(resultSet.getString(2));
        emp.setSalary(resultSet.getDouble(3));
        emp.setDate((resultSet.getDate(4)).toLocalDate());
        emp.setDep(resultSet.getInt(5));
        list.add(emp);
        logger.debug("exiting allEMployee()");
        logger.debug("returning: " + list);
       
      } return list;
    } catch (SQLException e) {
      e.printStackTrace();
    }

    logger.debug("exiting allEMployee()");
    logger.debug("returning: " + null);
    return null;

  }

  public EmployeJDBCImpl() {
    connection = Connect.getConnection();
  }
}
