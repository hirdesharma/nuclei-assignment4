package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.example.constants.DatabaseConstants;

public class DatabaseConnection {

  private static final String URL = DatabaseConstants.URL;
  private static final String USER = DatabaseConstants.USER;
  private static final String PASSWORD = DatabaseConstants.PASSWORD;

  public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }

  public ResultSet getItemData() throws SQLException {
    Connection connection = getConnection();
    Statement statement = connection.createStatement();
    return statement.executeQuery("SELECT * FROM items");
  }

  public void closeResources(Connection connection, Statement statement, ResultSet resultSet) {
    try {
      if (resultSet != null) {
        resultSet.close();
      }
      if (statement != null) {
        statement.close();
      }
      if (connection != null) {
        connection.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
