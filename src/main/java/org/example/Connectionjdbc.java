package org.example;
import java.sql.*;
import static javax.management.remote.JMXConnectorFactory.connect;


public class Connectionjdbc {
    public static void main(String[] args) throws SQLException {
        //Connection,username,pwd,statements

        String url = "jdbc:mysql://localhost:3306/demo1";
        String username = "root";
        String pwd = "Kajal@2001";
        try (Connection connection = DriverManager.getConnection(url, username, pwd)) {

            String sql = "SELECT * FROM student WHERE age BETWEEN ? AND ?";

            try (Statement statement = connection.createStatement()) {
                ResultSet rs = statement.executeQuery(sql);
                rs.getInt(1);
                rs.getInt(21);
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                            ", Name: " + rs.getString("name") +
                            ", Department: " + rs.getString("department") +
                            ", Salary: " + rs.getDouble("salary"));
                }


            }
            catch(SQLException e){
                    e.printStackTrace();
                }


        }
    }
}
