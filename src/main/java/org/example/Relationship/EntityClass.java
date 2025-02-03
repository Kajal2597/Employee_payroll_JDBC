package org.example.Relationship;
import java.sql.*;

public class EntityClass {



    String DB_URL = "jdbc:mysql://localhost:3306/demo1";
    String USER = "root";
    String PASSWORD = "Kajal@2001";

    // Connect to the database
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    // Create Employee table
  public void createEmployeeTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS Emp (" +
//                "id INT AUTO_INCREMENT PRIMARY KEY, " +
//                "name VARCHAR(100) NOT NULL, " +
//                "department_id INT UNIQUE, " +
//                "position VARCHAR(50), " +
//                "salary DECIMAL(10, 2), " +
//                "date_of_joining DATE, )";
//        executeStatement(sql, "Employee table created.");

      String sql = "create table student1(id int primary key, name varchar(20),age int)";
         executeStatement(sql, "Employee table created.");

  }

    // Create Department table
//    public void createDepartmentTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS Department (" +
//                "id INT AUTO_INCREMENT PRIMARY KEY, " +
//                "name VARCHAR(100) NOT NULL, " +
//                "location VARCHAR(100), " +
//                "head_employee_id INT UNIQUE,)";
//        executeStatement(sql, "Department table created.");
//    }

    // Utility method to execute a statement
    private void executeStatement(String sql, String successMessage) {
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);

            System.out.println(successMessage);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//
//
//    // Insert a new department
//    public void insertDepartment(String name, String location) {
//        String sql = "INSERT INTO Department (name, location) VALUES (?, ?)";
//        try (Connection conn = connect();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, name);
//            pstmt.setString(2, location);
//            pstmt.executeUpdate();
//            System.out.println("Department added successfully.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Insert a new employee with department assignment
//    public void insertEmployee(String name, int departmentId, String position, double salary, String dateOfJoining) {
//        String sql = "INSERT INTO Employee (name, department_id, position, salary, date_of_joining) VALUES (?, ?, ?, ?, ?)";
//        try (Connection conn = connect();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, name);
//            pstmt.setInt(2, departmentId);  // Assumes departmentId exists in Department table
//            pstmt.setString(3, position);
//            pstmt.setDouble(4, salary);
//            pstmt.setDate(5, Date.valueOf(dateOfJoining));  // Date in 'YYYY-MM-DD' format
//            pstmt.executeUpdate();
//            System.out.println("Employee added successfully.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
    public static void main(String[] args) {
        EntityClass setup = new EntityClass();

      // setup.createDepartmentTable();
        setup.createEmployeeTable();
//
//
//        setup.insertDepartment("HR", "New York");
//        setup.insertDepartment("Engineering", "San Francisco");
//
//        // Insert sample employee records with department assignment
//        setup.insertEmployee("John Doe", 1, "Manager", 75000.0, "2023-01-15");
//        setup.insertEmployee("Jane Smith", 2, "Engineer", 85000.0, "2023-02-20");
//    }
}
}
