package javajdbc;

import java.sql.*;

import static javax.management.remote.JMXConnectorFactory.connect;

public class javajdbc {
    public static void main(String[] args) throws SQLException {
        //Connection,username,pwd,statements

        String url = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String pwd = "Kajal@2001";

        try (Connection connection = DriverManager.getConnection(url, username, pwd)) {
//            try(Statement statement = connection.createStatement())
//            {
//
//                String createTableQuery = "create table employee_payroll( id INT AUTO_INCREMENT PRIMARY KEY,\n" +
//                        "    name varchar(100) NOT NULL,\n" +
//                        "    salary DECIMAL(10, 2) NOT NULL,\n" +
//                        "    start_date DATE NOT NULL)";
//                statement.executeUpdate(createTableQuery);
//                System.out.println("created successfully....");
//            }


//            try (Statement statement= connection.createStatement()) {
//                String insertQuery = "INSERT INTO employee_payroll (name, salary, start_date) VALUES (?, ?, ?)";
//                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//                preparedStatement.setString(1, "namara");
//                preparedStatement.setDouble(2, 50000.00);
//                preparedStatement.setDate(3, java.sql.Date.valueOf("2025-23-01"));
//                preparedStatement.executeUpdate();
//
//
//                //Statement stmt = connection.createStatement();
//                ResultSet rs = statement.executeQuery("SELECT * FROM employee_payroll");
//                while (rs.next()) {
//                    System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
//                            ", Salary: " + rs.getDouble("salary") + ", Start Date: " + rs.getDate("start_date"));
//                }
//            }

            // 1. Query to retrieve salary data for a particular employee (e.g., "Bill")
//            String salaryQuery = "SELECT salary FROM employee_payroll WHERE name = ?";
//            PreparedStatement pstmtSalary = connection.prepareStatement(salaryQuery);
//            pstmtSalary.setString(1, "kajal");
//
//            ResultSet rsSalary = pstmtSalary.executeQuery();
//            while (rsSalary.next()) {
//                System.out.println("Salary of kajal: " + rsSalary.getDouble("salary"));
//            }
//
//            // 2. Query to retrieve employees who joined within a specific date range
//            String dateRangeQuery = "SELECT * FROM employee_payroll WHERE start_date BETWEEN CAST(? AS DATE) AND DATE(NOW())";
//            PreparedStatement pstmtDateRange = connection.prepareStatement(dateRangeQuery);
//            pstmtDateRange.setString(1, "2018-01-01");
//
//            ResultSet rsDateRange = pstmtDateRange.executeQuery();
//            System.out.println("Employees who joined between 2024-11-01 and today:");
//            while (rsDateRange.next()) {
//                System.out.println("ID: " + rsDateRange.getInt("id") + ", Name: " + rsDateRange.getString("name") +
//                        ", Salary: " + rsDateRange.getDouble("salary") + ", Start Date: " + rsDateRange.getDate("start_date"));
//            }
        try (Statement statement= connection.createStatement()) {

//            String alterTableQuery = "ALTER TABLE employee_payroll ADD COLUMN gender CHAR(1) AFTER name";
//            statement.executeUpdate(alterTableQuery);
//            System.out.println("Gender column added successfully.");

            // Step 2: Update the gender for specific employees
//            String updateGenderQuery1 = "UPDATE employee_payroll SET gender = 'F' WHERE name = 'kajal'";
//            String updateGenderQuery2 = "UPDATE employee_payroll SET gender = 'F' WHERE name = 'namara'";
//
//            // Execute update queries
//            statement.executeUpdate(updateGenderQuery1);
//            statement.executeUpdate(updateGenderQuery2);
//            System.out.println("Gender updated.");


//            String sql = "SELECT SUM(salary) as sumsalary FROM employee_payroll WHERE gender = 'F' GROUP BY gender";
//            PreparedStatement pstmtDateRange = connection.prepareStatement(sql);
//            ResultSet rsDateRange = pstmtDateRange.executeQuery();
//
//            System.out.println("sccessful.");
//            while (rsDateRange.next()) {
//                System.out.println(", Salary: " + rsDateRange.getDouble("sumsalary") );
//
//            }
            //Average salary
//            String sql1 = "SELECT avg(salary) as avgsalary FROM employee_payroll WHERE gender = 'F' GROUP BY gender";
//
//            PreparedStatement psmt = connection.prepareStatement(sql1);
//            ResultSet radate = psmt.executeQuery();
//
//            System.out.println("successful.");
//            while (radate.next()) {
//                System.out.println(", Salary: " + radate.getDouble("avgsalary") );
//
//            }
            //Max Salary
//            String sql2 = "SELECT max(salary) as maxsalary FROM employee_payroll WHERE gender = 'F' GROUP BY gender";
//            PreparedStatement pstmtDateRange = connection.prepareStatement(sql2);
//            ResultSet rsDateRange = pstmtDateRange.executeQuery();
//
//            System.out.println("succesful.");
//            while (rsDateRange.next()) {
//                System.out.println(", Salary: " + rsDateRange.getDouble("maxsalary") );
//
//            }
//            String sql3 = "SELECT count(salary) as count FROM employee_payroll WHERE gender = 'F' GROUP BY gender";
//            PreparedStatement pstmtDateRange = connection.prepareStatement(sql3);
//            ResultSet rsDateRange = pstmtDateRange.executeQuery();
//
//            System.out.println("sccessful.");
//            while (rsDateRange.next()) {
//                System.out.println(", Salary: " + rsDateRange.getDouble("count") );
//
//            }
//
//            String sql = "SELECT min(salary) as minsal FROM employee_payroll WHERE gender = 'F' GROUP BY gender";
//            PreparedStatement pstmtDateRange = connection.prepareStatement(sql);
//            ResultSet rsDateRange = pstmtDateRange.executeQuery();
//
//            System.out.println("sccessful.");
//            while (rsDateRange.next()) {
//                System.out.println(", Salary: " + rsDateRange.getDouble("minsal") );
//
//            }
        }












        }
    }
}
