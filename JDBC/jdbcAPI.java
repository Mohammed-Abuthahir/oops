package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcAPI {

    public static void main(String[] args) throws ClassNotFoundException {
        try {

            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "mohammed123");

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // Step 5: Process Result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + " " + name + " " + salary);
            }

            // Step 6: Close Connection
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
