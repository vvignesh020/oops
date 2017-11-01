package javaexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class JDBCUpdate {
  public static Logger logger = Logger.getLogger(JDBCUpdate.class);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the employee ID:");
    int empid = sc.nextInt();
    System.out.println("enter the salary increae amount");
    int amount = sc.nextInt();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    connection = Connect.getConnection();
    try {
      preparedStatement = connection.prepareStatement("update vignesh set salary=salary+? where empid=?");
      preparedStatement.setInt(1, amount);
      preparedStatement.setInt(2, empid);
      int rowUpdate = preparedStatement.executeUpdate();
      System.out.println(rowUpdate + "row updated");
    } catch (SQLException e) {
      logger.error("sql error occured", e);
      e.printStackTrace();
    }
    Connect.closeConection(connection);
    sc.close();
  }
}
