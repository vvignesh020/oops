package javaexe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author vamsoft.
 *
 */
public class Connect {
  public static Logger logger = Logger.getLogger(Connect.class);

  public static Connection getConnection() {
    Connection connection = null;

    try {
      String driver = null;
      String url = null;
      String uname = null;
      String password = null;
      FileReader reader = new FileReader("src/db.properties");
      Properties properties = new Properties();
      properties.load(reader);
      driver = properties.getProperty("driver");
      url = properties.getProperty("url");
      uname = properties.getProperty("user");
      password = properties.getProperty("password");

      Class.forName(driver);

      connection = DriverManager.getConnection(url, uname, password);
      logger.info("connection done");

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return connection;
  }

  public static void closeConection(Connection connection) {
    try {
      connection.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
