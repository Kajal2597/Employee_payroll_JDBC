package org.example;

import java.sql.*;
 class JDBCCurdOperation {
     public static void main(String[] args) throws SQLException {
         //Connection,username,pwd,statements

         String url = "jdbc:mysql://localhost:3306/demo1";
         String username = "root";
         String pwd = "Kajal@2001";

         try (Connection connection = DriverManager.getConnection(url, username, pwd)) {
//            //create table
//
////            try(Statement = connection.createStatement()){
////
////                String createTableQuery = "create table student(id int primary key, name varchar(20),age int)";
////                statement.executeUpdate(createTableQuery);
////                System.out.println("Table is created successfully....");
////            }
//            insert record
//
//            try (Statement = connection.createStatement()) {
//
//                String insertTableQuery = "insert into student(id,name,age) values(108,'namrata',25)";
//                statement.executeUpdate(insertTableQuery);
//                System.out.println("successfully....");
//            }
//
//            display table


//                 try (Statement statement = connection.createStatement()) {
//
//                     String selectQuery = "Select * from student";
//                     ResultSet resultSet = statement.executeQuery(selectQuery);
//                     while (resultSet.next()) {
//                         int id =resultSet.getInt("id");
//                         String name  = resultSet.getNString("name");
//                         int age = resultSet.getInt("age");
//                         System.out.println("ID: " + id + "Name :" + name + " Age:" + age);
//                     }
//                     System.out.println("successfully....");
//
//            String query = "SELECT * FROM your_table";
//            try (Connection conn = connection.createStatement();
//                 PreparedStatement pstmt = conn.prepareStatement(query);
//                 ResultSet rs = pstmt.executeQuery()) {
//                while (rs.next()) {
//                    System.out.println("ID: " + rs.getInt("id"));
//                    System.out.println("Name: " + rs.getString("name"));
//                    System.out.println("Age: " + rs.getInt("age"));
//                }
//            String query = "UPDATE your_table SET name = ?, age = ? WHERE id = ?";
//            try (Connection conn = connection.createStatement());
//                 PreparedStatement pstmt = conn.prepareStatement(query)) {
//                pstmt.setString(1, id);
//                pstmt.setInt(2, name);
//                pstmt.setInt(3, id);
//                pstmt.executeUpdate();
//                System.out.println("Record updated successfully.");
//            }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//             4. Delete an Employee by ID
//
//            String query = "DELETE FROM student WHERE id = ?";
//            try (Connection conn = (Connection) connection.createStatement();
//                 PreparedStatement pstmt = conn.prepareStatement(query)) {
//                // int id = 0;
//                pstmt.setInt(1, 104);
//                int rowsDeleted = pstmt.executeUpdate();
//                System.out.println(rowsDeleted > 0 ? "student record deleted." : "student does  not found.");
//
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }


//               String sql = "SELECT * FROM student WHERE name = ?";
//               try (Connection conn = (Connection) connection.createStatement();
//                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
//                   pstmt.setString(1,"kajal");
//                   ResultSet rs = pstmt.executeQuery();
//                   while (rs.next()) {
//                       System.out.println("ID: " + rs.getInt("id") +
//                               ", Name: " + rs.getString("name") +
//                               ", age: " + rs.getInt("age"));
//                   }
//               } catch (SQLException e) {
//                   e.printStackTrace();
//               }

//             String sql = "SELECT * FROM student ORDER BY age DESC LIMIT 1";
//
//             try (Statement statement = connection.createStatement()) {
//                 ResultSet rs = statement.executeQuery(sql);
//                 {
//                     if (rs.next()) {
//                         System.out.println(" ID: " + rs.getInt("id") +
//                                 ", Name: " + rs.getString("name") +
//                                 ", Salary: " + rs.getInt("age"));
//                     } else {
//                         System.out.println("No student found.");
//                     }
//                 }
//             }
//             catch(SQLException e){
//                 e.printStackTrace();
//             }
             //try (Connection connection = DriverManager.getConnection(url, username, pwd)) {

                 String sql = "SELECT name,age, COUNT(id) as count FROM student GROUP BY age";

                 try (Statement statement = connection.createStatement()) {
                     ResultSet rs = statement.executeQuery(sql);
                     while (rs.next()) {
                         System.out.println("id: " + rs.getInt("age") +
                                 ", Count: " + rs.getInt("count"));
                     }

                 }
//                 catch(SQLException e){
//                     e.printStackTrace();
//                 }


             }


         }
     }

