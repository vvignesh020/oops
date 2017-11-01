package javaexe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

public class DBConnect {
  public static Logger logger = Logger.getLogger(DBConnect.class);

  public static void main(String[] args) {
    logger.info("main method execution started");

    Statement statement = null;
    ResultSet resultSet = null;
    Connection connection = null;

    try {
      connection = Connect.getConnection();
//      connection.setAutoCommit(false);
      statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
          ResultSet.CONCUR_UPDATABLE);
      resultSet = statement.executeQuery("select empid,fname,salary,doj,did from vignesh");
      ResultSetMetaData data = resultSet.getMetaData();
      int colCounter = data.getColumnCount();
      for (int i = 1; i <= colCounter; i++) {
        System.out.println(data.getColumnName(i) + "\t\t");
      }

      while (resultSet.next()) {
        System.out.print(resultSet.getInt("empid") + "\t\t");
        System.out.print(resultSet.getString("fname") + "\t\t");
        System.out.print(resultSet.getDouble("salary") + "\t\t");
        System.out.print(resultSet.getDate("doj") + "\t\t");
        System.out.print(resultSet.getInt("did") + "\t\t");
        System.out.println();

      }

      System.out.println("going back");
      resultSet.previous();
      System.out.print(resultSet.getInt("empid") + "\t\t");
      System.out.print(resultSet.getString("fname") + "\t\t");
      System.out.print(resultSet.getDouble("salary") + "\t\t");
      System.out.print(resultSet.getDate("doj") + "\t\t");
      System.out.print(resultSet.getInt("did") + "\t\t");
      System.out.println();
      resultSet.absolute(3);
      resultSet.updateInt(5, 90);
      resultSet.updateRow();
      System.out.print(resultSet.getInt("empid") + "\t\t");
      System.out.print(resultSet.getString("fname") + "\t\t");
      System.out.print(resultSet.getDouble("salary") + "\t\t");
      System.out.print(resultSet.getDate("doj") + "\t\t");
      System.out.print(resultSet.getInt("did") + "\t\t");
      System.out.println();

    } catch (SQLException e) {
      logger.error("error in logger data base connection", e);
      e.printStackTrace();
    } finally {
      try {
        resultSet.close();
        statement.close();
        Connect.closeConection(connection);
      } catch (SQLException e) {
        logger.error("error in closing data base connection", e);
        e.printStackTrace();
      }
    }

  }

}
