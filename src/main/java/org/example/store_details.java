package org.example;
import java.sql.*;
public class store_details {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sales", "root", "Chauhan");
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO Consumer values(?,?,?,?,?)");
        stmt.setInt(1, 777);
        stmt.setString(2, "Mohit");
        stmt.setString(3, "delhi");
        stmt.setInt(4, 90);
        stmt.setInt(5, 123);
        int count = stmt.executeUpdate();
        System.out.println(count + "insertion successful");
        connection.close();
    }
}
